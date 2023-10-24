package com.tms.spring.boot.service;

import com.tms.spring.boot.controller.StudentsController;
import com.tms.spring.boot.model.Student;
import com.tms.spring.boot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAllByOrderByPositionAsc();
    }

    public Student addNewStudent(String name, String groupNumber, String position) {
        return repository.save(new Student(name, groupNumber, Integer.parseInt(position)));
    }

    public List<Student> findByGroupNumber (String groupNumber) {
        Specification<Student> specification = new Specification<Student>() {
            @Override
            public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("groupNumber"), groupNumber);
            }
        };
        return repository.findAll(specification);
    }

    public void changeOderNumber(String id, String direction) {
        List<Student> all = repository.findAllByOrderByPositionAsc();
        Student student = repository.getReferenceById(id);

        int i = all.indexOf(student);
        int j = -1;

        if (direction.equals("up")) {
            j = i - 1;
        } else {
            j = i + 1;
        }

        if (j == -1 || j >= all.size()) {
            System.out.println("Can not move the selected student.");
            return;
        }

        Student student1 = all.get(j);
        int orderI = student.getPosition();
        int orderJ = student1.getPosition();
        student.setPosition(orderJ);
        repository.save(student);
        student1.setPosition(orderI);
        repository.save(student1);
    }

    }
