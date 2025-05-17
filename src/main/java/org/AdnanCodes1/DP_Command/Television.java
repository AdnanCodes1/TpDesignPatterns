package org.AdnanCodes1.DP_Command;

public class Television {

    private int id;
    private boolean estAllumer = false;

    public Television(int id){
        this.id = id;
    }

    public void allumerTelevision(){
        estAllumer = true;
        System.out.println("Television numero : " + id + " est allumer!");
    }

    public void etteindreTelevision(){
        estAllumer = false;
        System.out.println("Television numero : " + id + " est étteinte!");
    }

}
