package org.jsp.crud.controller;

import java.io.IOException;

import org.jsp.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping("/")
	public String loadHome() {
		return "Home.jsp";
	}
	
	@GetMapping("insert")
	public String loadInsert() {
		return "insert.jsp";
	}
	
	@PostMapping("insert")
	@ResponseBody
	public String save(@RequestParam String name,@RequestParam long mobile)
	{
		service.save(name, mobile);
		
		return "Data Saved Successfully";
	}
	
	@GetMapping("fetch")
	@ResponseBody
	public String fetchAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		return service.fetch(request,response);
	}
	
}
