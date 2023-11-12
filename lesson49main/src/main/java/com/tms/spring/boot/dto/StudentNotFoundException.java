package com.tms.spring.boot.dto;

public class StudentNotFoundException extends Exception{

    public StudentNotFoundException(String message) {
        super(message);
    }
}
