package by.tms.web;

import by.tms.model.Customer;
import by.tms.model.Task;
import by.tms.repository.CustomerRepository;
import by.tms.repository.CustomerRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

    CustomerRepository customerRepository = CustomerRepositoryImpl.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String currentUserLogin = (String) req.getSession().getAttribute("currentUserLogin");

        Optional<Customer> customer = customerRepository.getCustomerByLogin(currentUserLogin);

        List<Task> tasks = customer.orElseThrow().getTasks();

        req.setAttribute("tasks", tasks);

        req.getRequestDispatcher("/MyAccount.jsp").forward(req, resp);
    }
}
