package org.AdnanCodes1.DP_AbstractFactory;

public class ClassicalChair implements Chair{
    @Override
    public String getName() {
        return "Classical chair";
    }

    @Override
    public double getPrice() {
        return 300;
    }
}
