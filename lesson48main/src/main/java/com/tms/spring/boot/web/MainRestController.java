package com.tms.spring.boot.web;

import com.tms.spring.boot.dto.ErrorResponse;
import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.dto.StudentNotFoundException;
import com.tms.spring.boot.service.StudentService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/main/students")
@OpenAPIDefinition(info = @Info(
        title = "Main app",
        description = "This is a facade application for our system",
        version = "1.0.1"
))
public class MainRestController {

    private final StudentService service;

    @GetMapping("/{id}")
    @Operation(description = "This endpoint is responsible for obtaining all information about the requested student. To receive information you need to know the student ID.",
    summary = "Endpoint for getting a student by ID",
    responses = {
        @ApiResponse(description = "successfully executed", responseCode = "200",  content = @Content(
                schema = @Schema(implementation = StudentDto.class))),
            @ApiResponse (description = "if required id is not found", responseCode = "404", content = @Content(
                    schema = @Schema(implementation = ErrorResponse.class)))
    }
    )
    public ResponseEntity getById (@PathVariable(name = "id") UUID id){
        try {
            return ResponseEntity.ok(service.getById(id));
        } catch (StudentNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(id, e.getMessage()));
        }
    }

    @GetMapping
    public List<StudentDto> getAll() {
        return service.getAll();
    }

    @PostMapping
    public StudentDto save(@RequestBody StudentDto student){
        return service.save(student);
    }
}
