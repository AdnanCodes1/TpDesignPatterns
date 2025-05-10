package org.AdnanCodes1.DP_AbstractFactory;

public class ContemporaryCabinet implements Cabinet{
    @Override
    public String getName() {
        return "Contemporary cabinet";
    }

    @Override
    public double getPrice() {
        return 550;
    }
}
