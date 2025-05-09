package org.AdnanCodes1.DP_Builder1;

public class NoeudOperande implements Noeud{

    private int valeur;

    public NoeudOperande(int valeur){
        this.valeur = valeur;
    }

    @Override
    public int evaluer() {
        return this.valeur;
    }

    @Override
    public String toString() {
        return String.valueOf(valeur);
    }
}
