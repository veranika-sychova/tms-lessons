package com.tms.spring.boot.repository;

import com.tms.spring.boot.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {

}
