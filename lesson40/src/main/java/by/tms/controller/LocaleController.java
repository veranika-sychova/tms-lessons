package by.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class LocaleController {

    @GetMapping("/locale")
    public String changeLocale(HttpServletRequest request, @RequestParam("locale") String locale) {
        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale(locale));
        return "search.jsp";
    }
}
