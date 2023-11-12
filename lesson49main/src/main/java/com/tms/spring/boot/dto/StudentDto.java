package com.tms.spring.boot.dto;

import com.tms.spring.boot.valid.StudentConstraint;
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
@StudentConstraint
public class StudentDto {

    //Validation is not implemented, annotations are to "play" with swagger"!

    @Schema(title = "set student name")
    @NotNull
    private String name;
    private String id;
    @Schema(title = "set group number")
    @NotNull
    private String groupNumber;
    @Schema(title = "set student position")
    private int position;
}
