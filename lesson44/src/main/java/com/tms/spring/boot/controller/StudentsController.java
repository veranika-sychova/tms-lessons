package com.tms.spring.boot.controller;

import com.tms.spring.boot.model.Student;
import com.tms.spring.boot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Controller
public class StudentsController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String getAllStudents(Model model) {
        List<Student> all = studentRepository.findAll();
        model.addAttribute("students", all);
        return "students";
    }

    @PostMapping("/student")
    public String addNewStudent(@RequestParam String name, @RequestParam String groupNumber,@RequestParam String position, Model model) {
        studentRepository.save(new Student(name, groupNumber, Integer.parseInt(position)));
        List<Student> all = studentRepository.findAll();
        model.addAttribute("students", all);
        return "students";
    }

   @PostMapping ("/find")
    public String find (@RequestParam String groupNumber, Model model){
       Specification<Student> specification = new Specification<Student>() {
           @Override
           public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
               return criteriaBuilder.equal(root.get("groupNumber"), groupNumber);
           }
       };
       List<Student> all = studentRepository.findAll(specification);
       model.addAttribute("students", all);
       return "students";
   }

    //@Transactional
    // In case of jpa repository uncomment the line above
//    @PostMapping("/student/order")
//    public String changeOderNumber(@RequestParam String id, @RequestParam String direction, Model model) {
//        List<Student> all = studentRepository.findAll();
//        Student student = studentRepository.getById(id);
//
//        int i = all.indexOf(student);
//        int j = -1;
//
//        if (direction.equals("up")) {
//            j = i - 1;
//        } else {
//            j = i + 1;
//        }
//
//        if (j == -1 || j >= all.size()) {
//            System.out.println("Can not move the selected student.");
//            model.addAttribute("students", all);
//            return "students";
//        }
//
//        Student student1 = all.get(j);
//        int orderI = student.getOrder();
//        int orderJ = student1.getOrder();
//        studentRepository.updateStudentsOrder(student, orderJ);
//        studentRepository.updateStudentsOrder(student1, orderI);
//        model.addAttribute("students", studentRepository.getAll());
//        return "students";
//    }
}

