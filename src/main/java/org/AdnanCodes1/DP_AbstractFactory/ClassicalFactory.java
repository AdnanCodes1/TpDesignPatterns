package org.AdnanCodes1.DP_AbstractFactory;

public class ClassicalFactory implements FurnitureFactory{
    @Override
    public Cabinet createCabinet() {
        return new ClassicalCabinet();
    }

    @Override
    public Chair createChair() {
        return new ClassicalChair();
    }

    @Override
    public DinningTable createDinningTable() {
        return new ClassicalDinnigTable();
    }
}
