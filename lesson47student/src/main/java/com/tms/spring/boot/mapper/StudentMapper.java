package com.tms.spring.boot.mapper;

import com.tms.spring.boot.domain.StudentEntity;
import com.tms.spring.boot.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface StudentMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "groupNumber", source = "groupNumber")
    @Mapping(target = "position", source = "position")
    StudentDto toDto (StudentEntity entity);

    StudentEntity toEntity (StudentDto dto);

    List<StudentDto> toDtos (List<StudentEntity> entity);
    List<StudentEntity> toEntities (List<StudentDto> dto);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "groupNumber", source = "groupNumber")
    @Mapping(target = "position", source = "position")
    void update (@MappingTarget StudentEntity toUpdate, StudentDto dto);

}
