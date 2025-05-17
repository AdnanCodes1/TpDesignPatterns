package org.AdnanCodes1.DP_Command;

public class AllumerLampe implements Commande{

    private Lampe lampe;

    public AllumerLampe(Lampe lampe){
        this.lampe = lampe;
    }

    @Override
    public void executer() {
        lampe.allumerLampe();
    }

    @Override
    public void annuler() {
        lampe.etteindreLampe();
    }
}
