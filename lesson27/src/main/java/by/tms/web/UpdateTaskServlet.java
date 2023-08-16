package by.tms.web;

import by.tms.model.Customer;
import by.tms.model.Task;
import by.tms.model.TaskStatus;
import by.tms.repository.CustomerRepository;
import by.tms.repository.CustomerRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/task-update")
public class UpdateTaskServlet extends HttpServlet {

    CustomerRepository customerRepository = CustomerRepositoryImpl.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("text");

        String currentUserLogin = (String) req.getSession().getAttribute("currentUserLogin");

        Customer customer = customerRepository.getCustomerByLogin(currentUserLogin).orElseThrow();

        Task t = customer.getTasks().stream()
                .filter(task -> task.getText().equals(text))
                .findFirst().orElseThrow();

        if (t.getTaskStatus().equals(TaskStatus.CREATED)){
            t.setTaskStatus(TaskStatus.IN_PROGRESS);
        } else if (t.getTaskStatus().equals(TaskStatus.IN_PROGRESS)) {
            t.setTaskStatus(TaskStatus.DONE);
        }

        resp.sendRedirect("/27/account");
    }

}
