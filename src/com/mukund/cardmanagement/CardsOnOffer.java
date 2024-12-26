package com.mukund.cardmanagement;

/**
 * The CardsOnOffer class determines the type of card offered to a customer based on their credit points.
 */
public class CardsOnOffer {

    /**
     * Determines the offered card type based on the customer's credit points.
     *
     * @param customer The customer for whom the card is being offered.
     * @return A CardType object representing the offered card.
     */
    public static CardType getOfferedCard(Customer customer) {
        int creditPoints = customer.getCreditPoints();

        if (creditPoints >= 100 && creditPoints <= 500) {
            return new CardType(customer, "Silver");
        } else if (creditPoints >= 501 && creditPoints <= 1000) {
            return new CardType(customer, "Gold");
        } else if (creditPoints > 1000) {
            return new CardType(customer, "Platinum");
        } else {
            return new CardType(customer, "EMI");
        }
    }
}
