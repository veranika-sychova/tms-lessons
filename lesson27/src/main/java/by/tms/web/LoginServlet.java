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

@WebServlet ("/login")
public class LoginServlet extends HttpServlet {

    CustomerRepository customerRepository = CustomerRepositoryImpl.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("username");
        String password = req.getParameter("password");

        Customer customer = customerRepository.getCustomerByLogin(login);

        if (customer == null){
            resp.getWriter().println("Invalid login");
        } else if (customer.getPassword().equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("currentUserLogin", login);
            resp.sendRedirect("/27/account");
        } else {
            resp.getWriter().println("Invalid password");
        }
    }
}
