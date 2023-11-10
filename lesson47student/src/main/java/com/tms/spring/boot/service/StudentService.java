package com.tms.spring.boot.service;

import com.tms.spring.boot.dto.StudentDto;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    List<StudentDto> getAll ();

    StudentDto save (StudentDto dto);

    StudentDto getById (UUID id);

    void delete (UUID id);

    StudentDto update (UUID id, StudentDto dto);
}
