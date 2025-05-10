package org.AdnanCodes1.DP_AbstractFactory;

public class ScandinavianDinningTable implements DinningTable{
    @Override
    public String getName() {
        return "Scandinavian dinning table";
    }

    @Override
    public double getPrice() {
        return 800;
    }
}
