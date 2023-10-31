package com.tms.spring.boot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "object to create user", title = "StudentDto request")
public class StudentDto {

    //Validation is not implemented, annotations are to "play" with swagger"!

    @Schema(title = "set student name")
    @NotNull
    private String name;
    @NotNull
    private String id;
    @Schema(title = "set group number")
    @NotNull @Size(max = 2)
    private String groupNumber;
    @Schema(title = "set student position")
    @NotNull @Size(max = 100)
    private int position;
}
