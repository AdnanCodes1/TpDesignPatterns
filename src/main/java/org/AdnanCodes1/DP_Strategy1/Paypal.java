package org.AdnanCodes1.DP_Strategy1;

public class Paypal implements PaymentStrategy{
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " DHS effectuer avec succés via Paypal avec l'email de : " + email + ".");
    }
}
