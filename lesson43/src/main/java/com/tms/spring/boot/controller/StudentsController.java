package com.tms.spring.boot.controller;

import com.tms.spring.boot.model.Student;
import com.tms.spring.boot.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
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
        studentsRepository.addStudent(new Student(name, "" + new Random(20).nextInt(), groupNumber, new Random(10).nextInt()));

        List<Student> all = studentsRepository.getAll();
        model.addAttribute("students", all);

        return "students";
    }

    //@Transactional
    // In case of jpa repository uncomment the line above
    @PostMapping("/student/order")
    public String changeOderNumber(@RequestParam String id, @RequestParam String direction, Model model) {
        List<Student> all = studentsRepository.getAll();
        Student student = studentsRepository.getById(id);

        int i = all.indexOf(student);
        int j = -1;

        if (direction.equals("up")) {
            j = i - 1;
        } else {
            j = i + 1;
        }

        if (j == -1 || j >= all.size()) {
            System.out.println("Can not move the selected student.");
            model.addAttribute("students", all);
            return "students";
        }

        Student student1 = all.get(j);
        int orderI = student.getOrder();
        int orderJ = student1.getOrder();
        studentsRepository.updateStudentsOrder(student, orderJ);
        studentsRepository.updateStudentsOrder(student1, orderI);
        model.addAttribute("students", studentsRepository.getAll());
        return "students";
    }
}

