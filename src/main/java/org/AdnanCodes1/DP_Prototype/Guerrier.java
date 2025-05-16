package org.AdnanCodes1.DP_Prototype;

import java.util.HashMap;

public class Guerrier extends Personnage {

    public Guerrier() {
        classe = "Guerrier";
        pointDeVie = 700;
        attaque = 80;
        defense = 100;

        competencesSpecials = new HashMap<>();
        competencesSpecials.put("Coup Puissant", "Une attaque dévastatrice qui inflige de lourds dégâts.");
        competencesSpecials.put("Cri de Guerre", "Augmente l'attaque des alliés à proximité.");
        competencesSpecials.put("Provocation", "Force les ennemis à attaquer le guerrier.");
        competencesSpecials.put("Parade", "Réduit considérablement les dégâts reçus pendant un court instant.");
        competencesSpecials.put("Charge", "Fonce vers un ennemi et le renverse.");
        competencesSpecials.put("Frappe Tourbillonnante", "Attaque tous les ennemis autour de lui.");
        competencesSpecials.put("Endurance", "Augmente temporairement les points de vie.");
        competencesSpecials.put("Rage du Berserker", "Double les dégâts mais réduit la défense.");
        competencesSpecials.put("Défense Totale", "Ignore tous les dégâts pendant une brève période.");
        competencesSpecials.put("Maîtrise de l'Arme", "Augmente la précision et la vitesse d'attaque.");
    }
}
