package com.tms.spring.boot.web;

import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.exception.StudentNotFoundException;
import com.tms.spring.boot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<StudentDto> getAll() {
        return service.getAll();
    }

    @PostMapping
    public StudentDto create(@RequestBody StudentDto student) {
        return service.save(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById (@PathVariable(name = "id")UUID id){
        try {
            return ResponseEntity.ok(service.getById(id));
        } catch (StudentNotFoundException e) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id")UUID id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public StudentDto update (@PathVariable(name = "id") UUID id, @RequestBody StudentDto dto){
        return service.update(id, dto);
    }

}
