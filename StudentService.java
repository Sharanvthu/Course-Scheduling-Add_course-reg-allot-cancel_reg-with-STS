package com.sharan.student;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.query.QueryProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.Spring.student.model.Student;

import jakarta.persistence.EntityManager;

@Service
public class StudentService {

	@Autowired
	  StudentRepo repo ;
	@Autowired 
	CourseRepo repo2;
//	 Course course;
	 Student student1;
	 int j=0;
		public String register(Student student) {
			student.setId(++j);
			int i=student.getGmail().indexOf('@');
			
			student.setStudentName(student.getGmail().substring(0,i));
			Course resultSet=repo2.findById("python").get();
			
			if (student.getId()<=resultSet.getMaxStudent()) {
			
				student.setStatus("ACCEPTED");
			} else {
				student.setStatus("COURSE_FULL_ERROR");
			}
		
			student.setCourseRegId(student.getStudentName()+"-"+resultSet.getCourseName());
			student1 =new Student(student.getId(), student.getGmail(), student.getStatus(), student.getStudentName(), student.getCourseRegId());
			repo.save(student1);
//			student= new Student(student.getId(),student.getGmail(),student.getStatus() , student.getStudentName(), student.getCourseRegId());
			return student.getCourseRegId()+" --"+student.getStatus();
		}
	


	
	
	
}
