package com.sharan.student;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Course {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Id                    
	private String courseName;
	private String instructorName;
	private String date;
	private Integer minStudent;
	private Integer maxStudent;
	private String courseOfferingId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getMinStudent() {
		return minStudent;
	}
	public void setMinStudent(Integer minStudent) {
		this.minStudent = minStudent;
	}
	public Integer getMaxStudent() {
		return maxStudent;
	}
	public void setMaxStudent(Integer maxStudent) {
		this.maxStudent = maxStudent;
	}
	public String getCourseOfferingId() {
		return courseOfferingId;
	}
	public void setCourseOfferingId(String courseOfferingId) {
		this.courseOfferingId = courseOfferingId;
	}
	public Course(Integer id, String courseName, String instructorName, String date, Integer minStudent, Integer maxStudent,
			String courseOfferingId) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.date = date;
		this.minStudent = minStudent;
		this.maxStudent = maxStudent;
		this.courseOfferingId = courseOfferingId;
	}
	public Course() {
		super();
	}


	

}
