package org.AdnanCodes1.DP_Prototype;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PersonnageCache.loadCache();

        Personnage clonedMage = PersonnageCache.getPersonnage(1);
        System.out.println("Classe : " + clonedMage.getClasse());

        System.out.println("----------------------------------------------");

        Personnage clonedGuerrier = PersonnageCache.getPersonnage(2);
        System.out.println("Classe : " + clonedGuerrier.getClasse());

        System.out.println("----------------------------------------------");

        Personnage clonedArcher = PersonnageCache.getPersonnage(3);
        System.out.println("Classe : " + clonedArcher.getClasse());



    }
}
