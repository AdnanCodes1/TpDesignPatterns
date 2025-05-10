package org.AdnanCodes1.DP_AbstractFactory;

public class ScandinavianFactory implements FurnitureFactory{
    @Override
    public Cabinet createCabinet() {
        return new ScandinavianCabinet();
    }

    @Override
    public Chair createChair() {
        return new ScandinavianChair();
    }

    @Override
    public DinningTable createDinningTable() {
        return new ScandinavianDinningTable();
    }
}
