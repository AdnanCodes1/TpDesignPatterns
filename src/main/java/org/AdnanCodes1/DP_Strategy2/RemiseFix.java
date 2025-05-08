package org.AdnanCodes1.DP_Strategy2;

public class RemiseFix implements RemiseStrategy{
    private final double REMISE_FIX = 100;

    @Override
    public double remise(double montant) {
        if (montant >= 101) return montant - REMISE_FIX;
        System.out.println("Impossible d'appliquer une remise sur un montant moins de 101 Dhs.");
        return montant;
    }
}
