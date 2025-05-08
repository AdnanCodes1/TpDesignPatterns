package org.AdnanCodes1.DP_Strategy2;

public class RemisePourcentage implements RemiseStrategy{
    private final double REMISE = 0.2;

    @Override
    public double remise(double montant) {
        return montant - montant * REMISE;
    }
}
