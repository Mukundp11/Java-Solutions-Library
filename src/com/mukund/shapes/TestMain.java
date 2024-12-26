package com.mukund.shapes;

/**
 * The RectMain class serves as an entry point to test the Rectangle class.
 */
public class TestMain {

    public static void main(String[] args) {
        // Create a Rectangle object with specified dimensions
        Rectangle r = new Rectangle(5, 10);

        // Print the area of the rectangle
        System.out.println("Area of Rectangle: " + r.getArea());

        // Print the perimeter of the rectangle
        System.out.println("Perimeter of Rectangle: " + r.getPerimeter());
    }
}
