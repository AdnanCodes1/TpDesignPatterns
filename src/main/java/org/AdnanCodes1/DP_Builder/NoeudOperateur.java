package org.AdnanCodes1.DP_Builder;

public class NoeudOperateur implements Noeud{

    private char operateur;
    private Noeud gauche;
    private Noeud droit;

    public NoeudOperateur(char operateur, Noeud gauche, Noeud droit) {
        this.operateur = operateur;
        this.gauche = gauche;
        this.droit = droit;
    }

    @Override
    public int evaluer() {

        int g = gauche.evaluer();
        int d = droit.evaluer();

        switch (operateur) {
            case '+': return g + d;
            case '-': return g - d;
            case '*': return g * d;
            case '/': return g / d;
            default: throw new IllegalArgumentException("Opérateur invalide: " + operateur);
        }
    }

    @Override
    public String toString() {
        return "(" + gauche + " " + operateur + " " + droit + ")";
    }
}
