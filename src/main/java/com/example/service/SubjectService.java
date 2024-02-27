package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Subject;
import com.example.repository.SubjectReository;

@Service
public class SubjectService {

	@Autowired
	public SubjectReository studentRepository;
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects=new ArrayList<Subject>();
		studentRepository.findAll().forEach(subjects::add);
		return subjects;
	}
	public Object addSubject(Subject subject) {
		
		return studentRepository.save(subject);
	}
	public void updateSubject(String id, Subject subject) {
		
		studentRepository.save(subject);
	}
	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	
}
