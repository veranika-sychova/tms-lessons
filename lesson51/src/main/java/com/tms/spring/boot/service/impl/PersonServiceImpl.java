package com.tms.spring.boot.service.impl;

import com.tms.spring.boot.domain.PermissionEntity;
import com.tms.spring.boot.domain.PersonEntity;
import com.tms.spring.boot.dto.PersonDto;
import com.tms.spring.boot.repository.PersonRepository;
import com.tms.spring.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;
//    @Autowired
//    private PasswordEncoder encoder;

    @Override
    @Transactional
    public PersonDto save (PersonDto dto){
        String permissions = dto.getPermissions();
        String[] split = permissions.split(",");

        PersonEntity person = PersonEntity.builder()
                .personName(dto.getUsername())
                .password(dto.getPassword())
                .build();


        List<PermissionEntity> perms = Arrays.stream(split)
                .map(PermissionEntity::new)
                .peek(permissionEntity -> permissionEntity.setPerson(person))
                .collect(Collectors.toList());

        person.setPermissions(perms);

        repository.save(person);

        return dto;
    }
}
