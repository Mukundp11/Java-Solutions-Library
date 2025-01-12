package com.mukund.shapes;

/**
 * The Rectangle class represents a rectangle with width and height.
 */
public class Rectangle {
    private double width;  // Width of the rectangle
    private double height; // Height of the rectangle

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        double area = width * height;
        return area; // Return the calculated area
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter; // Return the calculated perimeter
    }
}
