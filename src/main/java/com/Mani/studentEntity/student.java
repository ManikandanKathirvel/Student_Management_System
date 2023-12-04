package com.Mani.studentEntity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class student {
	@Id
	//@GeneratedValue(strategy = GenerationType)
	private int id;
	private String studentname;
	private String email;
	private long mobileno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public student(String studentname, String email, long mobileno) {
		super();
		this.studentname = studentname;
		this.email = email;
		this.mobileno = mobileno;
	}
	
	public student () {
	
	}
}
