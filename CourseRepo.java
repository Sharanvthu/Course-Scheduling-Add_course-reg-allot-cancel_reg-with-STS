package com.sharan.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course, String> {

//	Integer getmaxStudent(Course course);



	

}
