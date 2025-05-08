package org.AdnanCodes1.DP_FlyWeight;

public class CharacterF {

    private String police;
    private double taille;
    private String couleur;
    private boolean gras;
    private boolean italique;

    public CharacterF(String police, double taille, String couleur, boolean gras, boolean italique  ) {
        this.police = police;
        this.italique = italique;
        this.couleur = couleur;
        this.gras = gras;
        this.taille = taille;
    }


    @Override
    public String toString(){
        return String.format("Police: %s, Taille: %f, Couleur: %s, Gras: %b, Italique: %b", police, taille, couleur, gras, italique);
    }
}
