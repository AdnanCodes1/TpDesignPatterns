package org.AdnanCodes1.DP_Prototype;

import java.util.HashMap;
import java.util.Map;

public abstract class Personnage implements Cloneable{

    private int id;
    protected String classe;
    protected int pointDeVie;
    protected int attaque;
    protected int defense;
    protected Map<String, String> competencesSpecials;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Map<String, String> getCompetencesSpecials() {
        return competencesSpecials;
    }

    public void setCompetencesSpecials(Map<String, String> competencesSpecials) {
        this.competencesSpecials = competencesSpecials;
    }

    public Personnage clone(){
        Personnage clone = null;
        try{
            clone = (Personnage) super.clone();
            clone.setCompetencesSpecials(new HashMap<>(this.competencesSpecials));
        }catch (Exception e){
            e.printStackTrace();
        }

        return clone;
    }

}
