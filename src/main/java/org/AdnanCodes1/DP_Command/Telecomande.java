package org.AdnanCodes1.DP_Command;

public class Telecomande {

    private Commande buttonOn;
    private Commande buttonOff;
    private Commande lastCommand;

    public Commande getButtonOff() {
        return buttonOff;
    }

    public void setButtonOff(Commande buttonOff) {
        this.buttonOff = buttonOff;
    }

    public Commande getButtonOn() {
        return buttonOn;
    }

    public void setButtonOn(Commande buttonOn) {
        this.buttonOn = buttonOn;
    }

    public void on(){
        buttonOn.executer();
        lastCommand = buttonOn;
    }

    public void off(){
        buttonOff.executer();
        lastCommand = buttonOff;
    }

    public void appuyerAnnuler(){
        if(lastCommand != null){
            System.out.println("Annulation ...");
            lastCommand.annuler();
        }else{
            System.out.println("Pas d'actions à annuler!");
        }
    }
}
