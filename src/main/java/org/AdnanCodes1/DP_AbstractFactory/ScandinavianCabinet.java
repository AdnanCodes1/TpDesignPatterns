package org.AdnanCodes1.DP_AbstractFactory;

public class ScandinavianCabinet implements Cabinet{
    @Override
    public String getName() {
        return "Scandinavian cabinet";
    }

    @Override
    public double getPrice() {
        return 600;
    }
}
