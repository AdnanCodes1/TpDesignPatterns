package org.AdnanCodes1.DP_AbstractFactory;

public class ClassicalDinnigTable implements DinningTable {
    @Override
    public String getName() {
        return "Classical Dinning table";
    }

    @Override
    public double getPrice() {
        return 700;
    }
}
