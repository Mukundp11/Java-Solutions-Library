package healthcare.management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {

    private ArrayList<Hospital> hospitals = new ArrayList<>();

    public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson,
                           String contactNumber, String location) {
        Hospital hospital = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
        hospitals.add(hospital);
        return hospital.getHospitalCode(); // Return the unique hospital code
    }

    public Map<Integer, String> getHospitals() {
        Map<Integer, String> hospitalMap = new HashMap<>();
        for (Hospital hospital : hospitals) {
            hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        }
        return hospitalMap;
    }

    public void displayHospitalDetails() {
        if (hospitals.isEmpty()) {
            System.out.println("No hospitals found.");
            return;
        }

        for (Hospital hospital : hospitals) {
            System.out.println("Hospital Code: " + hospital.getHospitalCode());
            System.out.println("Hospital Name: " + hospital.getHospitalName());
            System.out.println("Treatments Offered: " + hospital.getListOfTreatments());
            System.out.println("Contact Person: " + hospital.getContactPerson());
            System.out.println("Contact Number: " + hospital.getContactNumber());
            System.out.println("Location: " + hospital.getLocation());
            System.out.println("----------------------------------------");
        }
    }
}