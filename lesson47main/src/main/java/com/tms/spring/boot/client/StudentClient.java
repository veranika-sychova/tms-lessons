package com.tms.spring.boot.client;

import com.tms.spring.boot.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "student-client", url = "${client.students}")
public interface StudentClient {

    @PostMapping
    StudentDto save(@RequestBody StudentDto request);

    @GetMapping("/{id}")
    StudentDto getById (@PathVariable(name = "id")UUID id);

    @GetMapping
    List<StudentDto> getAll();

}
