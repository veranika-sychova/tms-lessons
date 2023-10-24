package com.tms.spring.boot.controller;

import com.tms.spring.boot.model.Student;
import com.tms.spring.boot.repository.StudentRepository;
import com.tms.spring.boot.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Controller
@RequestMapping
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/")
    public String getAllStudents(Model model) {
        List<Student> all = studentsService.getAllStudents();
        model.addAttribute("students", all);
        return "students";
    }

    @PostMapping("/student")
    public String addNewStudent(@RequestParam String name, @RequestParam String groupNumber,@RequestParam String position, Model model) {
        studentsService.addNewStudent(name, groupNumber, position);
        List<Student> all = studentsService.getAllStudents();
        model.addAttribute("students", all);
        return "students";
    }

   @PostMapping ("/find")
    public String find (@RequestParam String groupNumber, Model model){
       List<Student> all = studentsService.findByGroupNumber(groupNumber);
       model.addAttribute("students", all);
       return "students";
   }

//    @Transactional
//     In case of jpa repository uncomment the line above
    @PostMapping("/student/order")
    public String changeOderNumber(@RequestParam String id, @RequestParam String direction, Model model) {
        studentsService.changeOderNumber(id, direction);
        model.addAttribute("students", studentsService.getAllStudents());
        return "students";
    }
}

