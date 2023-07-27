package by.tms.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter ("/MyAccount.html")
public class CheckLoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        Object currentUserLogin = req.getSession().getAttribute("currentUserLogin");
        if (currentUserLogin == null){
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendRedirect("/23/Login.html");
        } else {
            chain.doFilter(request, response);
        }
    }
}
