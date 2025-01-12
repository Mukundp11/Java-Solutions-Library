package healthcare.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HospitalFinder {

    public static void main(String[] args) {
        HospitalService hospitalService = new HospitalService();

        // Adding hospitals with Indian names and cities
        List<String> treatments1 = new ArrayList<>();
        treatments1.add("General Checkup");
        treatments1.add("Pediatrics");
        hospitalService.addHospital("City General Hospital", treatments1, "Rahul Sharma", "9876543210", "Delhi");

        List<String> treatments2 = new ArrayList<>();
        treatments2.add("Cardiology");
        treatments2.add("Orthopedics");
        hospitalService.addHospital("Green Valley Hospital", treatments2, "Ravi Kumar", "8765432109", "Mumbai");

        List<String> treatments3 = new ArrayList<>();
        treatments3.add("Dermatology");
        treatments3.add("Neurology");
        hospitalService.addHospital("Sunrise Hospital", treatments3, "Priya Singh", "7654321098", "Bangalore");

        // Displaying hospital details
        System.out.println("Hospital Details:");
        hospitalService.displayHospitalDetails();

        // Fetching hospital map
        Map<Integer, String> hospitals = hospitalService.getHospitals();
        System.out.println("Hospital Map: " + hospitals);
    }
}