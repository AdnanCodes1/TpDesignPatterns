package org.AdnanCodes1.DP_Bridge2;

public abstract class CompteBancaire {

    protected MethodeTransaction methodeTransaction;
    protected int id;
    protected String type;
    protected double solde;

    public CompteBancaire(MethodeTransaction methodeTransaction, String type, double solde){
        this.methodeTransaction = methodeTransaction;
        this.type = type;
        this.solde = solde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void effectuerOperation(double montant);

}
