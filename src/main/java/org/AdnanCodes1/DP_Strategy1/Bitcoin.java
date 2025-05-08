package org.AdnanCodes1.DP_Strategy1;

public class Bitcoin implements PaymentStrategy{
    private String walletAddress;

    public Bitcoin(String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " BTC effectuer avec succés en crypto (BTC) depuis le portefeuille : " + walletAddress +".");
    }
}
