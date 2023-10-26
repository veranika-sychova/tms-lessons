package com.tms.spring.boot.service;

import com.tms.spring.boot.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

    private final RestTemplate template;

    @Override
    public StudentDto getById(UUID id) {
        StudentDto responce = template.getForObject("127.0.0.1:8091/" + id, StudentDto.class);
        return responce;
    }
}
