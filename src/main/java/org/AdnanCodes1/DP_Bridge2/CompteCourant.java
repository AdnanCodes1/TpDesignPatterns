package org.AdnanCodes1.DP_Bridge2;

public class CompteCourant extends CompteBancaire{

    public CompteCourant(MethodeTransaction methodeTransaction, String type, double solde){
        super(methodeTransaction, type, solde);
    }

    @Override
    public void effectuerOperation(double montant) {
        methodeTransaction.effectuerTransaction(this, montant);
    }
}
