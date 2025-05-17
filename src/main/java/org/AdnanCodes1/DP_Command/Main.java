package org.AdnanCodes1.DP_Command;

public class Main {
    public static void main(String[] args) {

        Television tv = new Television(1);
        Lampe lampe = new Lampe(1);

        Commande commandeAllumerTV = new AllumerTV(tv);
        Commande commandeEtteindreTV = new EtteindreTV(tv);

        Commande commandeAllumerLampe = new AllumerLampe(lampe);
        Commande commandeEtteindreLampe = new EtteindreLampe(lampe);


        Telecomande telecomande = new Telecomande();

        System.out.println("------- Configuration TV : -------");
        telecomande.setButtonOn(commandeAllumerTV);
        telecomande.setButtonOff(commandeEtteindreTV);

        telecomande.on();
        telecomande.off();
        telecomande.appuyerAnnuler();


        System.out.println("------- Configuration Lampe : -------");
        telecomande.setButtonOn(commandeAllumerLampe);
        telecomande.setButtonOff(commandeEtteindreLampe);

        telecomande.on();
        telecomande.off();
        telecomande.appuyerAnnuler();

    }
}
