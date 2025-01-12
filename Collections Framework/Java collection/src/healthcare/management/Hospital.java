package healthcare.management;

import java.util.List;

public class Hospital {

    private static int hospitalCode = 1001; // Starting hospital code
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson,
                    String contactNumber, String location) {
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
        hospitalCode++; // Increment hospital code for each new hospital
    }

    public int getHospitalCode() {
        return hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public void setListOfTreatments(List<String> listOfTreatments) {
        this.listOfTreatments = listOfTreatments;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
                + listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
                + ", location=" + location + "]";
    }
}