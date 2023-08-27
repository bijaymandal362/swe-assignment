package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {
	private long studentId;
	private String name;
	private LocalDate dateOfAdmission;
	

	public Student() {
		
	}
	
	public Student(long id, String name, LocalDate dOA) {
		this.studentId = id;
		this.name = name;
		this.dateOfAdmission = dOA;
	}
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long id) {
		this.studentId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dOA) {
		this.dateOfAdmission = dOA;
	}
	
	@Override
	public String toString() {
		return "studentId=" + studentId + ", name=" + name + ", dateOfAdmission=" + dateOfAdmission;
	}

}
