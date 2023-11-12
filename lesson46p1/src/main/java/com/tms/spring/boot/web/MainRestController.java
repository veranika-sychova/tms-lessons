package com.tms.spring.boot.web;

import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/main")
public class MainRestController {

    private final StudentService service;

    @GetMapping("/{id}")
    public StudentDto getById (@PathVariable(name = "id") UUID id){
        StudentDto byId = service.getById(id);
        return byId;
    }

    @GetMapping
    public List<StudentDto> getAll() {
        return service.getAll();
    }
}
