package org.AdnanCodes1.DP_FlyWeight;

public class Character {

    private char value;
    private CharacterF caracterFormatting;

    public Character(char value, CharacterF caracterFormatting) {
        this.value = value;
        this.caracterFormatting = caracterFormatting;
    }

    public void show(){
        System.out.println("Caractère : '" + value + "' avec " + caracterFormatting);
    }
}
