package com.mukund.schoolmanagement;

/**
 * The School class represents a school with a name, location, student, and principal.
 */
public class School {
    
	private String name; 
	private String location; 
	private Student student; 
	private Principal principal;

	public School(String name, String location, Student student, Principal principal) {
		this.name = name;
		this.location = location;
		this.student = student;
		this.principal = principal;
	}

	public School(School school) { // Copy constructor
		this.name = school.name;
		this.location = school.location;
		this.student = school.student; // Assuming shallow copy is acceptable for Student
		this.principal = school.principal; // Assuming shallow copy is acceptable for Principal
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student getStudent() { // Changed method to plural to reflect multiple students
		return student; 
	}

	public void setStudent(Student student) { 
		this.student = student; 
	}

	public Principal getPrincipal() { 
		return principal; 
	}

	public void setPrincipal(Principal principal) { 
		this.principal = principal; 
	}

	public void addStudent(Student newStudent) { // Method to add a new student
	    this.student = newStudent; // This could be modified to support multiple students in the future
	}

	@Override
	public String toString() {
	    return "School [name=" + name + ", location=" + location + ", student=" + student + ", principal=" + principal + "]";
	}
}
