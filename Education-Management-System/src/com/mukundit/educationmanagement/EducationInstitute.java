package com.mukundit.educationmanagement;

public class EducationInstitute {
    private Course[] courses;
    private Offer[] offers;

    public EducationInstitute(Course[] courses, Offer[] offers) {
        this.courses = courses;
        this.offers = offers;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                System.out.println(studentName + " enrolled in course: " + course.getName());
                return;
            }
        }
        System.out.println("Course with ID " + courseId + " not found.");
    }

    public void displayCoursesAndFees() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void displayOffers() {
        System.out.println("Current Offers:");
        for (Offer offer : offers) {
            System.out.println(offer);
        }
    }
}