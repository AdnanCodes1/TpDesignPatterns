package org.AdnanCodes1.DP_Builder1;

public class Main {

    public static void main(String[] args){

        ArbreExpressionBuilder builder = new ArbreExpressionBuilder();


        String expressionPostfixe = "3 5 9 + 2 * +";

        Noeud racine = builder.build(expressionPostfixe);

        System.out.println("Expression infixe : " + racine);
        System.out.println("Résultat = " + racine.evaluer());

    }

}
