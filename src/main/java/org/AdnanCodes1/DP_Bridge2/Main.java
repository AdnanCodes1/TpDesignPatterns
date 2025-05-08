package org.AdnanCodes1.DP_Bridge2;

public class Main {

    public static void main(String[] args){
        CompteBancaire compteEpargneRetrait = new CompteEpargne(new Retrait(), "Epargne", 15000);

        System.out.println(compteEpargneRetrait.getSolde());

        compteEpargneRetrait.effectuerOperation(5000);

        System.out.println(compteEpargneRetrait.getSolde());
        
    }

}
