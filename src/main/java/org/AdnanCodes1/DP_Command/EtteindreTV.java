package org.AdnanCodes1.DP_Command;

public class EtteindreTV implements Commande{
    private Television television;

    public EtteindreTV(Television television){
        this.television = television;
    }

    @Override
    public void executer() {
        television.etteindreTelevision();
    }

    @Override
    public void annuler() {
        television.allumerTelevision();
    }
}
