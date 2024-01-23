package com.sharan.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service2;
	@Autowired
	CourseService service;
	@Autowired
	AllotService service3;
	@Autowired
	CancelService service4;
//	Student student;
	Course course;
	@PostMapping("create")
	public String createCourse(@RequestBody Course course)
	{
		 		
		 return service.createCourse(course);
	}
	
	@PostMapping("register")
	public String register(@RequestBody Student student)
	{
		 return service2.register(student);
	}
	
	@PostMapping("allot")
	public List<String> allotCourse(@RequestBody Allot allot)
	{
		return  (List<String>) service3.allotCourse(allot);
	}
	
//	@PostMapping("create/stud")
//	public String createStudent(@RequestBody Student student)
//	{
//		return service.createStudent(student);
//	}
	@PostMapping("cancel")
	public String allotCourse(@RequestBody Cancel cancel)
	{
		return   service4.cancelReg(cancel);
	}

}
