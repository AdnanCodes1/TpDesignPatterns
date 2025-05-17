package org.AdnanCodes1.DP_Command;

public class EtteindreLampe implements Commande{
    private Lampe lampe;

    public EtteindreLampe(Lampe lampe){
        this.lampe = lampe;
    }

    @Override
    public void executer() {
        lampe.etteindreLampe();
    }

    @Override
    public void annuler() {
        lampe.allumerLampe();
    }
}
