package com.tms.spring.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Data
@NoArgsConstructor
@Entity
public class Student {

    private String name;
    @Id
    private String id;
    private String groupNumber;
    private int position;

    public Student(String name, String groupNumber, int position) {
        this.id = "" + new Random().nextInt();
        this.name = name;
        this.groupNumber = groupNumber;
        this.position = position;
    }
}
