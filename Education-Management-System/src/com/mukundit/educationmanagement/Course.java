package com.mukundit.educationmanagement;

public class Course {
    private int id;
    private String name;
    private double fee;

    public Course(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", fee=" + fee + "]";
    }
}