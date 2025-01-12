
package com.mukund.geometry;
/**
 * The Area class provides a method to calculate the area of a circle.
 */
public class Area {

    /**
     * Calculates the area of a circle given its radius.
     *
     * @param radius The radius of the circle.
     * @return A string representation of the area, or "0" if the radius is less than or equal to 0.
     */
    public static String getArea(int radius) {
        if (radius <= 0) {
            return "0"; // Return "0" for non-positive radius
        } else {
            double area = Math.PI * radius * radius; // Use Math.PI for better precision
            return String.format("%.2f", area); // Format the area to two decimal places
        }
    }
}

