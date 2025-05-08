package org.AdnanCodes1.DP_Strategy2;

public class RemiseContext {

    private RemiseStrategy remiseStrategy;

    public RemiseContext(RemiseStrategy remiseStrategy){
        this.remiseStrategy = remiseStrategy;
    }

    public void setRemiseStrategy(RemiseStrategy nvRemiseStrategy){
        this.remiseStrategy = nvRemiseStrategy;
    }

    public double appliquerRemise(double montant){
       return remiseStrategy.remise(montant);
    }

}
