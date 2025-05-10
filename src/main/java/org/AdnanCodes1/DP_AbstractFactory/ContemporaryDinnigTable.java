package org.AdnanCodes1.DP_AbstractFactory;

public class ContemporaryDinnigTable implements DinningTable{
    @Override
    public String getName() {
        return "Contemporary dinning table";
    }

    @Override
    public double getPrice() {
        return 750;
    }
}
