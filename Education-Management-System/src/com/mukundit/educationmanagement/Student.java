package com.mukundit.educationmanagement;

public class Student {
    private String name;
    private EducationInstitute institute;

    public Student(String name, EducationInstitute institute) {
        this.name = name;
        this.institute = institute;
    }

    public void viewCoursesAndFees() {
        institute.displayCoursesAndFees();
    }

    public void viewOffers() {
        institute.displayOffers();
    }

    public void enrollInCourse(int courseId) {
        institute.enrollStudentInCourse(courseId, name);
    }
}