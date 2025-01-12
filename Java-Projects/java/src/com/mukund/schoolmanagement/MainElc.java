package com.mukund.schoolmanagement;

/**
 * The MainElc class serves as an entry point to test the school management system.
 */
public class MainElc {

	public static void main(String[] args) {

	    // Create instances of Principal and Teacher
	    Principal p = new Principal("Dr. Kumar", 4);
	    Teacher t = new Teacher("Kishore", "Mathematics");
	    
	    // Create an instance of Student with an assigned teacher
	    Student st = new Student("Ravi", 10, 9.6, t);
	    
	    // Create an instance of School with a student and principal
	    School s = new School("ABC School", "india", st, p);
	    
	    // Create a copy of the school object using the copy constructor
	    School sc = new School(s);
	    
	    // Print details of Principal, Teacher, Student, and School
	    System.out.println(p);
	    System.out.println(t);
	    System.out.println(st);
	    System.out.println(s);
	    
	    // Add a student to the copied school object (currently only allows one)
	    sc.addStudent(st);
	    
	    // Change the teacher's name and print it
	    t.setName("Shiva");
	    System.out.println("Updated Teacher Name: " + t.getName());
	    
	    // Change the student's teacher and print updated details
	    st.changeTeacher(t);
	    System.out.println(st);
	}
}
