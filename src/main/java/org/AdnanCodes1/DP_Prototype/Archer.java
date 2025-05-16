package org.AdnanCodes1.DP_Prototype;

import java.util.HashMap;

public class Archer extends Personnage {

    public Archer() {
        classe = "Archer";
        pointDeVie = 500;
        attaque = 100;
        defense = 60;

        competencesSpecials = new HashMap<>();
        competencesSpecials.put("Tir Précis", "Inflige des dégâts accrus à une cible unique.");
        competencesSpecials.put("Pluie de Flèches", "Tire une volée de flèches sur une large zone.");
        competencesSpecials.put("Flèche Empoisonnée", "Inflige des dégâts sur la durée.");
        competencesSpecials.put("Camouflage", "Devient temporairement invisible aux ennemis.");
        competencesSpecials.put("Tir Rapide", "Tire plusieurs flèches en un instant.");
        competencesSpecials.put("Piège au Sol", "Pose un piège qui immobilise les ennemis.");
        competencesSpecials.put("Vision Aiguisée", "Révèle les ennemis cachés à longue distance.");
        competencesSpecials.put("Tir Explosif", "Tire une flèche explosive causant des dégâts de zone.");
        competencesSpecials.put("Évasion", "Effectue une roulade pour esquiver une attaque.");
        competencesSpecials.put("Concentration", "Augmente la précision et la portée des tirs.");
    }
}
