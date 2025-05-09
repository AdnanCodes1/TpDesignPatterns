package org.AdnanCodes1.DP_Builder1;

public class NoeudOperateur implements Noeud{

    private char operateur;
    private Noeud gauche;
    private Noeud droite;

    public NoeudOperateur(char operateur, Noeud gauche, Noeud droite) {
        this.operateur = operateur;
        this.gauche = gauche;
        this.droite = droite;
    }

    @Override
    public int evaluer() {

        int g = gauche.evaluer();
        int d = droite.evaluer();

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
        return "(" + gauche + " " + operateur + " " + droite + ")";
    }
}
