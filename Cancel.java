package com.sharan.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
public class Cancel {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
	private String courseRegitrationId;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseRegitrationId() {
		return courseRegitrationId;
	}
	public void setCourseRegitrationId(String courseRegitrationId) {
		this.courseRegitrationId = courseRegitrationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cancel(Integer id, String courseRegitrationId, String status) {
		super();
		this.id = id;
		this.courseRegitrationId = courseRegitrationId;
		this.status = status;
	}
	

}
