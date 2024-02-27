package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Subject;

@Repository
public interface SubjectReository extends CrudRepository<Subject, String> {

	
}
