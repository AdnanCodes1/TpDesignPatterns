package org.AdnanCodes1.DP_Strategy1;

public class CarteBancaire implements PaymentStrategy{
    private String cardHolder;
    private String cardNumber;

    public CarteBancaire(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " DHS effectuer avec succés par carte bancaire de : " + cardHolder + ".");
    }
}
