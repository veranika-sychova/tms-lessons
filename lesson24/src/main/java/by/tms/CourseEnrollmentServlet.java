package by.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/enrollment")
public class CourseEnrollmentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String programmingLanguage = req.getParameter("programming-language");
        String additionalInfo = req.getParameter("additional-info");
        String password = req.getParameter("password");

        System.out.println(name + " " + programmingLanguage + " " + additionalInfo + " " + password);

        PrintWriter writer = resp.getWriter();
        writer.println("Success");

    }
}
