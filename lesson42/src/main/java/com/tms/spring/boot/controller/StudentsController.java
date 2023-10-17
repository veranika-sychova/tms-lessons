package com.tms.spring.boot.controller;

import com.tms.spring.boot.model.Student;
import com.tms.spring.boot.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

@Controller
public class StudentsController {

    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping("/")
    public String getAllStudents(Model model) {
        List<Student> all = studentsRepository.getAll();
        model.addAttribute("students", all);
        return "students";
    }

    @PostMapping("/student")
    public String addNewStudent(@RequestParam String name, @RequestParam String groupNumber, Model model) {
        studentsRepository.addStudent(new Student(name, "" + new Random(20).nextInt(), groupNumber));

        List<Student> all = studentsRepository.getAll();
        model.addAttribute("students", all);

        return "students";
    }
}
