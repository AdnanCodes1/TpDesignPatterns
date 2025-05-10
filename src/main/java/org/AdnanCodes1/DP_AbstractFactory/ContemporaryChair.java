package org.AdnanCodes1.DP_AbstractFactory;

public class ContemporaryChair implements Chair{
    @Override
    public String getName() {
        return "Contemporary Chair";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
