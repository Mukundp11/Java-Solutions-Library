package com.mukund.employeeapp;

/**
 * The Address class represents an address with city, district, and state information.
 */
public class Address {
    private String cityName;
    private String districtName;
    private String stateName;

    // Constructor to initialize address details
    public Address(String cityName, String districtName, String stateName) {
        this.cityName = cityName;
        this.districtName = districtName;
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "Address [City: " + cityName + ", District: " + districtName + ", State: " + stateName + "]";
    }
}
