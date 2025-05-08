package org.AdnanCodes1.DP_Strategy1;

public class Main {

    public static void main(String[] args){

        PaymentContext paymentContext = new PaymentContext(new Bitcoin("1BoatSLRHtKNngkdXEeobR76b53LETtpyT"));
        paymentContext.effectuerPaiement(0.02);

        System.out.println("--------------------------------------------");

        paymentContext.setPaymentStrategy(new CarteBancaire("4111 1111 1111 1111", "Hamid Alaoui"));
        paymentContext.effectuerPaiement(5000);

        System.out.println("--------------------------------------------");

        paymentContext.setPaymentStrategy(new Paypal("hamid.alaoui@gmail.com"));
        paymentContext.effectuerPaiement(800);

    }

}
