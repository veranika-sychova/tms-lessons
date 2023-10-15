package com.tms.spring.boot.repository;

import com.tms.spring.boot.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentsRepository {

    private List<Student> students = new ArrayList<>() {{
        add(new Student("student1", "1", "group1"));
        add(new Student("student2", "2", "group1"));
        add(new Student("student3", "3", "group3"));
    }};

    public Student getById(String id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst().get();
    }

    public void addStudent(Student student) {
        if (student.getName() == null || student.getId() == null || student.getGroupNumber() == null) {
            System.out.println("Please, all attributes must be provided.");
            throw new RuntimeException("Please, all attributes must be provided.");
        }
        students.add(student);
    }

    public List<Student> getAll() {
        return students;
    }
}
