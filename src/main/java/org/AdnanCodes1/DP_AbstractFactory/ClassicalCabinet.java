package org.AdnanCodes1.DP_AbstractFactory;

public class ClassicalCabinet implements Cabinet{

    @Override
    public String getName() {
        return "Classical Cabinet";
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
