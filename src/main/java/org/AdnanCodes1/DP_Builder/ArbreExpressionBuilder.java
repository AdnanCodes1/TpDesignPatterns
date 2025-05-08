package org.AdnanCodes1.DP_Builder;

import java.util.Stack;

public class ArbreExpressionBuilder {

    public Noeud build(String postfix) {
        Stack<Noeud> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (isOperateur(token)) {
                Noeud droite = stack.pop();
                Noeud gauche = stack.pop();
                stack.push(new NoeudOperateur(token.charAt(0), gauche, droite));
            } else {
                stack.push(new NoeudOperande(Integer.parseInt(token)));
            }
        }

        return stack.pop();
    }

    private boolean isOperateur(String s) {
        return s.length() == 1 && "+-*/".contains(s);
    }

}
