package com.mukund.schoolmanagement;

/**
 * The Principal class represents a school principal with a name and years of experience.
 */
public class Principal {
    private String name;
    private int yearsExperience;

    public Principal(String name, int yearsExperience) {
        this.name = name;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public String toString() {
        return "Principal [name=" + name + ", yearsExperience=" + yearsExperience + "]";
    }
}
