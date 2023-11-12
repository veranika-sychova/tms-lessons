package com.tms.spring.boot.service;

import com.tms.spring.boot.client.StudentClient;
import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.dto.StudentNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Validated
public class StudentServiceImpl implements StudentService{

    private final StudentClient client;

    @Override
    public StudentDto getById(UUID id) throws StudentNotFoundException {
        return client.getById(id);
    }

    @Override
    public List<StudentDto> getAll() {
        return client.getAll();
    }

    @Override
    public StudentDto save(StudentDto dto) {
        return client.save(dto);
    }
}
