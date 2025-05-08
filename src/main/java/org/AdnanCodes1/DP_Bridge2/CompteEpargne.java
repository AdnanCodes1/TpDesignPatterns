package org.AdnanCodes1.DP_Bridge2;

public class CompteEpargne extends CompteBancaire{

    public CompteEpargne(MethodeTransaction methodeTransaction, String type, double solde){
        super(methodeTransaction, type, solde);
    }

    @Override
    public void effectuerOperation(double montant) {
        methodeTransaction.effectuerTransaction(this, montant);
    }
}
