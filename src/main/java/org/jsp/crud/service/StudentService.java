package org.jsp.crud.service;

import java.io.IOException;
import java.util.List;

import org.jsp.crud.dao.StudentDao;
import org.jsp.crud.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class StudentService {
	
	@Autowired
	Student student;
	
	@Autowired
	StudentDao dao;
	
	public void save(String name,long mobile)
	{
		student.setMobile(mobile);
		student.setName(name);
		
		dao.save(student);
	}

	public String fetch(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		List<Student> list=dao.fetchAll();
		if(list.isEmpty())
		{
			return "No Data Found";
		}
		else {
			request.setAttribute("list", list);
			request.getRequestDispatcher("Result.jsp").forward(request, response);
		}
		
		return null;
	}

}
