package org.AdnanCodes1.DP_AbstractFactory;

public class ScandinavianChair implements Chair{
    @Override
    public String getName() {
        return "Scandinavian chair";
    }

    @Override
    public double getPrice() {
        return 400;
    }
}
