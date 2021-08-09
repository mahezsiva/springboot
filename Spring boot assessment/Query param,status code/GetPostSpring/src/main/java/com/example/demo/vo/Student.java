package com.example.demo.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {
	
	private int Id;
	private String studentName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + Id + ", studentName=" + studentName + ", dob=" + dob + "]";
	}

}
