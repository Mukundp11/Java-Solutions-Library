package com.mukund.empDetails;

/**
 * The Employee class represents an employee with attributes such as name, age, salary, and department.
 */
public class Employee {
    private String name;        // Name of the employee
    private int age;           // Age of the employee
    private double salary;      // Salary of the employee
    private String department;  // Department of the employee

    // Constructor to initialize employee details
    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Copy constructor for creating a new Employee object from an existing one
    public Employee(Employee e) {
        this.name = e.name;
        this.age = e.age;
        this.salary = e.salary;
        this.department = e.department;
    }

    // Getters and Setters
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to raise the salary by a given percentage
    public void raiseSalary(double percentage) {
        double increment = salary * (percentage / 100);
        this.salary += increment; // Update the salary with the increment
        System.out.println("Salary of " + name + " after " + percentage + "% increment: " + this.salary);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
    }
}
