package com.tms.spring.boot.service;

import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.dto.StudentNotFoundException;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    StudentDto getById (UUID id) throws StudentNotFoundException;

    List<StudentDto> getAll ();

    StudentDto save (StudentDto dto);
}
