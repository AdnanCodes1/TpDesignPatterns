package org.AdnanCodes1.DP_Command;

public class Lampe {

    private int id;
    private boolean estAllumer = false;

    public Lampe(int id){
        this.id = id;
    }

    public void allumerLampe(){
        estAllumer = true;
        System.out.println("Lampe numero : " + id + " est allumer!");
    }

    public void etteindreLampe(){
        estAllumer = false;
        System.out.println("Lampe numero : " + id + " est étteinte!");
    }


}
