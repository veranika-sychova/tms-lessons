package com.tms.spring.boot.repository;

import com.tms.spring.boot.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

    Optional<PersonEntity> findByPersonName (String personName);
}
