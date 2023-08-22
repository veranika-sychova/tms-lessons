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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/tasks")
public class CreateTaskServlet extends HttpServlet {

    CustomerRepository customerRepository = CustomerRepositoryImpl.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("text");

        String currentUserLogin = (String) req.getSession().getAttribute("currentUserLogin");

        Customer customer = customerRepository.getCustomerByLogin(currentUserLogin).orElseThrow();

        Task task = new Task(text, TaskStatus.CREATED);

        customer.getTasks().add(task);

        resp.sendRedirect("/27/account");
    }

}
