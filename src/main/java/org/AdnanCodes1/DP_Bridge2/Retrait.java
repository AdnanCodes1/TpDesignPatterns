package org.AdnanCodes1.DP_Bridge2;

public class Retrait implements MethodeTransaction{
    @Override
    public void effectuerTransaction(CompteBancaire compte, double montant) {
        if(compte.getSolde() >= montant){
            double nvSolde = compte.getSolde() - montant;
            compte.setSolde(nvSolde);
        }else{
            System.out.println("Solde insufisant!");
        }
    }
}
