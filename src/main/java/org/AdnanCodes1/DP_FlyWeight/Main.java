package org.AdnanCodes1.DP_FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Character> text = new ArrayList<>();

        CharacterF formating1 = CharacterFFactory.getFormattingCombination("Times New Roman", 12.5, "Black", false, false);

        for (int i = 0; i < 10 ; i++){
            text.add(new Character('A', formating1));
        }

        CharacterF formating2 = CharacterFFactory.getFormattingCombination("Arial", 14, "Blue", true, false);

        text.add(new Character('R', formating2));

        for (Character c : text){
            c.show();
        }

    }

}
