package org.AdnanCodes1.DP_Strategy2;

public class RemiseNVClients implements RemiseStrategy{
    private final double REMISE = 0.5;

    @Override
    public double remise(double montant) {
        return montant - montant * REMISE;
    }
}
