package org.AdnanCodes1.DP_Strategy1;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy newPaymentStrategy){
        this.paymentStrategy = newPaymentStrategy;
    }

    public void effectuerPaiement(double montant){
        paymentStrategy.payer(montant);
    }

}
