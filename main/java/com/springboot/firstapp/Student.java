package com.springboot.firstapp;

public class Student {
private String firstname;
private String secondname;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String firstname, String secondname) {
	super();
	this.firstname = firstname;
	this.secondname = secondname;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
}
