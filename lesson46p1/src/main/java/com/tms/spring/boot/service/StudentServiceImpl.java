package com.tms.spring.boot.service;

import com.tms.spring.boot.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

    private final RestTemplate template;

    @Override
    public StudentDto getById(UUID id) {
        StudentDto responce = template.getForObject("http://127.0.0.1:8090/" + id, StudentDto.class);
        return responce;
    }

    @Override
    public List<StudentDto> getAll() {
        List forObject = template.getForObject("http://127.0.0.1:8090/", List.class);
        return forObject;
    }

}
