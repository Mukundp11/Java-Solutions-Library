package com.mukundit.educationmanagement;

public class EducationInstituteApp {
    public static void main(String[] args) {
        // Create courses
        Course[] courses = {
            new Course(1, "Science", 1200),
            new Course(2, "Art", 1000),
            new Course(3, "Commerce", 900)
        };

        // Create offers
        Offer[] offers = {
            new Offer("Get 20% off on all courses!")
        };

        // Create an education institute
        EducationInstitute institute = new EducationInstitute(courses, offers);

        // Create a student
        Student student = new Student("John Doe", institute);

        // Student views courses and fees
        student.viewCoursesAndFees();

        // Student views offers
        student.viewOffers();

        // Student enrolls in a course
        student.enrollInCourse(1); // Enroll in Science course
    }
}