package com.sharan.student;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "stud")
public class Student {
	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Id
	private String Gmail;
	private String status;
	private String studentName;
	private String courseRegId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseRegId() {
		return courseRegId;
	}
	public void setCourseRegId(String courseRegId) {
		this.courseRegId = courseRegId;
	}

//	public Student(int id, String gmail, String status, String studentName, String courseRegId, Course course) {
//		super();
//		this.id = id;
//		this.Gmail = gmail;
//		this.status = status;
//		this.studentName = studentName;
//		this.courseRegId = courseRegId;
//		this.course = course;
//	}
	public Student() {
		super();
	}
	public Student(int id1,String gmail2, String status2, String studentName2, String courseRegId2) {
		this.id=id1;
		this.Gmail=gmail2;
		this.status=status2;
		this.studentName=studentName2;
		this.courseRegId=courseRegId2;
	}



	


}
