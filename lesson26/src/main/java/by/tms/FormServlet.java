package by.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/enrollment")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String programmingLanguage = req.getParameter("programming-language");
        String password = req.getParameter("password");

        if (name == null ||name.isEmpty()
                || programmingLanguage == null || programmingLanguage.isEmpty()
                || password == null || password.isEmpty()) {
            req.setAttribute("formName", name);
            req.setAttribute("formPL", programmingLanguage);
            req.setAttribute("errorMessage", "Please, fill in all fields!");
            req.getRequestDispatcher("/Save-request.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/26/Success.html");
        }
    }
}
