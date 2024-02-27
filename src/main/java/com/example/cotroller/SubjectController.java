package com.example.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Subject;
import com.example.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	public SubjectService subjectService;
	@RequestMapping(method=RequestMethod.GET, value="/subjects")
	public List<Subject> getAllSubject()
	{
		return subjectService.getAllSubjects();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/Subjects")
	public void addSubjet(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/Subjects/{id}")
	public void updateSubjet(@PathVariable String id, @RequestBody Subject subject)
	{
		subjectService.updateSubject(id,subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/Subjects/{id}")
	public void deleteSubjet(@PathVariable String id)
	{
		subjectService.deleteSubject(id);
	}
}
