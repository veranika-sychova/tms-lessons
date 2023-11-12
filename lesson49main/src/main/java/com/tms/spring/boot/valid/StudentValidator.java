package com.tms.spring.boot.valid;

import com.tms.spring.boot.dto.StudentDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentValidator implements ConstraintValidator<StudentConstraint, StudentDto> {

    @Override
    public void initialize(StudentConstraint constraint){
    }

    @Override
    public boolean isValid(StudentDto dto, ConstraintValidatorContext context){
        String groupNumber = dto.getGroupNumber();

        if (groupNumber != null && groupNumber.length() <= 10 ){
            return true;
        }

        return false;
    }
}
