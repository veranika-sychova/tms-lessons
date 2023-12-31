package com.tms.spring.boot.repository;

import com.tms.spring.boot.model.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {

    List<Student> findAll (Specification<Student> specification);

    List<Student> findAllByOrderByPositionAsc();

}
