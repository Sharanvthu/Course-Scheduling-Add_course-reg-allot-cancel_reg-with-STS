package com.sharan.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	CourseRepo repo;
	int i=0;
	public String createCourse(Course course2) {
		course2.setId(++i);
		course2.setCourseOfferingId(course2.getCourseName()+"-"+course2.getInstructorName());
		Course course=new Course(course2.getId(), course2.getCourseName(), course2.getInstructorName(), course2.getDate(), course2.getMinStudent(), course2.getMaxStudent(), course2.getCourseOfferingId());
		repo.save(course);
		return course2.getCourseOfferingId();
	}

	

}
