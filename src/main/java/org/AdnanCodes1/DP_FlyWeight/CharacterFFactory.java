package org.AdnanCodes1.DP_FlyWeight;

import java.util.HashMap;

public class CharacterFFactory {

    private static final HashMap<String , CharacterF> formattingCombinations = new HashMap<>();

    public static CharacterF getFormattingCombination(String police, double taille, String couleur, boolean gras, boolean italique){
        if (formattingCombinations.get(police+taille+couleur+gras+italique) == null){
            formattingCombinations.put(police+taille+couleur+gras+italique, new CharacterF(police, taille, couleur, gras, italique));
        }
        return formattingCombinations.get(police+taille+couleur+gras+italique);
    }
}
