package com.mukund.cardmanagement;

/**
 * The CardType class represents a type of card offered to a customer based on their credit points.
 */
public class CardType {
    private Customer customer; // The customer associated with this card
    private String cardType;   // The type of card (e.g., Silver, Gold, Platinum, EMI)

    // Constructor to initialize card type details
    public CardType(Customer customer, String cardType) {
        this.customer = customer;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CardType [Customer=" + customer + ", CardType=" + cardType + "]";
    }
}
