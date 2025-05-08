package org.AdnanCodes1.DP_Strategy2;

public class Main {

    public static void main(String[] args){

        RemiseContext remiseContext = new RemiseContext(new RemiseNVClients());

        double montant = 8000;
        System.out.println("Montant : " + montant + " DHS.");

        System.out.println("--------------------------------------------------------------");

        System.out.println("Remise pour la première commande du nouveau client : " + remiseContext.appliquerRemise(montant) + " DHS.");

        System.out.println("--------------------------------------------------------------");

        remiseContext.setRemiseStrategy(new RemiseFix());
        System.out.println("Remise fix de 100 DHS : " + remiseContext.appliquerRemise(montant) + " DHS.");

        System.out.println("--------------------------------------------------------------");

        remiseContext.setRemiseStrategy(new RemisePourcentage());
        System.out.println("Remise pourcentage de 20% : " + remiseContext.appliquerRemise(montant) + " DHS.");

    }

}
