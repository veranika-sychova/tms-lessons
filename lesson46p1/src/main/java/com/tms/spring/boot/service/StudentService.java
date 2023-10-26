package com.tms.spring.boot.service;

import com.tms.spring.boot.dto.StudentDto;

import java.util.UUID;

public interface StudentService {

    StudentDto getById (UUID id);
}
