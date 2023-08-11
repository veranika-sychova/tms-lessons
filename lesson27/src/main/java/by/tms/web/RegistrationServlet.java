package by.tms.web;

import by.tms.model.Customer;
import by.tms.repository.CustomerRepository;
import by.tms.repository.CustomerRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    CustomerRepository customerRepository = CustomerRepositoryImpl.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmation = req.getParameter("confirmation");

        if (login == null || login.isEmpty()
        || password == null || password.isEmpty()
        || confirmation == null || confirmation.isEmpty()){
            req.getRequestDispatcher("/Registration.html").forward(req, resp);
            return;
        }

        if (!password.equals(confirmation)){
            req.getRequestDispatcher("/Registration.html").forward(req, resp);
            return;
        }

        customerRepository.saveCustomer(login, password);

        HttpSession session = req.getSession();
        session.setAttribute("currentUserLogin", login);

        resp.sendRedirect("/27/account");
    }

}
