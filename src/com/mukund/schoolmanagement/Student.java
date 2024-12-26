package com.mukund.schoolmanagement;

/**
 * The Student class represents a student with a name, age, GPA, and assigned teacher.
 */
public class Student {
    private String name; 
    private int age; 
    private double GPA; 
    private Teacher teacher;

    public Student(String name, int age, double GPA, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    // Change assigned teacher
    public void changeTeacher(Teacher newTeacher) {
        this.teacher = newTeacher;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", GPA=" + GPA + ", teacher=" + teacher + "]";
    }
}
