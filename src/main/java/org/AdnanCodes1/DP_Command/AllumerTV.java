package org.AdnanCodes1.DP_Command;

public class AllumerTV implements Commande{
    private Television television;

    public AllumerTV(Television television){
        this.television = television;
    }

    @Override
    public void executer() {
        television.allumerTelevision();
    }

    @Override
    public void annuler() {
        television.etteindreTelevision();
    }
}
