package com.tms.spring.boot.web;

import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/main")
public class MainRestController {

    private final StudentService service;

    @GetMapping("/{id}")
    public StudentDto getById (@RequestParam(name = "id") UUID id){
        StudentDto byId = service.getById(id);
        return byId;
    }
}
