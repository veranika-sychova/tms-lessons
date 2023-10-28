package com.tms.spring.boot.service;

import com.tms.spring.boot.client.StudentClient;
import com.tms.spring.boot.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

    private final StudentClient client;

    @Override
    public StudentDto getById(UUID id) {
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
