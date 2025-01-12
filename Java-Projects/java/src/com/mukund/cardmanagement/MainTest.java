package com.mukund.cardmanagement;

/**
 * The TestELC class serves as an entry point to test the card offering functionality.
 */
public class MainTest {

    public static void main(String[] args) {
        // Create a Customer object with sample data
        Customer customer = new Customer("Ravi", 510);
        
        // Get the offered card based on the customer's credit points
        CardType cardType = CardsOnOffer.getOfferedCard(customer);
        
        // Print out the details of the offered card
        System.out.println(cardType);
    }
}
