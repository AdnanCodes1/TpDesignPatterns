package org.AdnanCodes1.DP_Prototype;

import java.util.HashMap;

public class Mage extends Personnage {

    public Mage() {
        classe = "Mage";
        pointDeVie = 400;
        attaque = 120;
        defense = 40;

        competencesSpecials = new HashMap<>();
        competencesSpecials.put("Boule de Feu", "Lance une boule de feu infligeant des dégâts à distance.");
        competencesSpecials.put("Choc de Glace", "Projette une onde glaciale qui ralentit les ennemis.");
        competencesSpecials.put("Barrière Magique", "Crée un bouclier absorbant une partie des dégâts subis.");
        competencesSpecials.put("Téléportation", "Permet de se déplacer instantanément vers un point visible.");
        competencesSpecials.put("Drain de Mana", "Vole de la mana à l’ennemi pour restaurer la sienne.");
        competencesSpecials.put("Explosion Arcanique", "Libère une puissante onde magique autour du mage.");
        competencesSpecials.put("Soin Mineur", "Soigne légèrement une cible ou soi-même.");
        competencesSpecials.put("Vision Astrale", "Permet de voir les ennemis cachés ou invisibles.");
        competencesSpecials.put("Silence Magique", "Empêche un ennemi de lancer des sorts pendant un court instant.");
        competencesSpecials.put("Invocation Élémentaire", "Invoque un esprit élémentaire pour combattre à ses côtés.");
    }

}
