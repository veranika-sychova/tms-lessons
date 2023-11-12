package com.tms.spring.boot.service.impl;

import com.tms.spring.boot.domain.StudentEntity;
import com.tms.spring.boot.dto.StudentDto;
import com.tms.spring.boot.mapper.StudentMapper;
import com.tms.spring.boot.repository.StudentRepository;
import com.tms.spring.boot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper mapper;
    private final StudentRepository repository;

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> all = repository.findAll();
        return mapper.toDtos(all);
    }

    @Override
    public StudentDto save(StudentDto dto) {
        StudentEntity entity = mapper.toEntity(dto);
        StudentEntity save = repository.save(entity);
        return mapper.toDto(save);
    }

    @Override
    public StudentDto getById(UUID id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public void delete(UUID id) {
        Optional<StudentEntity> byId = repository.findById(id);
        if (byId.isPresent()){
            repository.deleteById(id);
        }
    }

    @Transactional
    @Override
    public StudentDto update(UUID id, StudentDto dto) {
        StudentEntity toUpdate = repository.findById(id).orElseThrow(RuntimeException ::new);
        mapper.update(toUpdate, dto);
        return mapper.toDto(toUpdate);
    }
}
