package org.AdnanCodes1.DP_Bridge2;

public class Virement implements MethodeTransaction{
    @Override
    public void effectuerTransaction(CompteBancaire compte, double montant) {
        double nvSolde = compte.getSolde() + montant;
        compte.setSolde(nvSolde);
    }
}
