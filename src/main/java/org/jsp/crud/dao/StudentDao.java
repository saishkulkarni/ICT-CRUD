package org.jsp.crud.dao;

import java.util.List;

import org.jsp.crud.dto.Student;
import org.jsp.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	@Autowired
	StudentRepository repository;
	
	public void save(Student student)
	{
		repository.save(student);
	}

	public List<Student> fetchAll() {
		return repository.findAll();
	}
}
