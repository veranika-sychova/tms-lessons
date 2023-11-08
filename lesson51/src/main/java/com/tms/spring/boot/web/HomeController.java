package com.tms.spring.boot.web;

import com.tms.spring.boot.dto.PersonDto;
import com.tms.spring.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @Autowired
    private PersonService personService;

    @GetMapping("/home")
    public String homePage (){
        return "home";
    }

    @GetMapping("/public")
    public String publicPage (){
        return "public";
    }

    @PostMapping("/save")
    public String publicPage (PersonDto dto){
        PersonDto save= personService.save(dto);
        return "home";
    }

    @GetMapping("/private")
    public String privatePage (){
        return "private";
    }

}
