package com.mukund.geometryandfinance;

/**
 * The TotalSurfaceAreaOfCylinder class provides a method to calculate the total surface area of a cylinder.
 */
public class TotalSurfaceAreaOfCylinder {

    // Method to calculate total surface area of a cylinder
    public static float calculateTotalSurfaceArea(float radius, float height) {
        return (float) (2 * Math.PI * radius * (radius + height));
    }
}
