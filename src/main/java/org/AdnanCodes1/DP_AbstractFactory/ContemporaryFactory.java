package org.AdnanCodes1.DP_AbstractFactory;

public class ContemporaryFactory implements FurnitureFactory{
    @Override
    public Cabinet createCabinet() {
        return new ContemporaryCabinet();
    }

    @Override
    public Chair createChair() {
        return new ContemporaryChair();
    }

    @Override
    public DinningTable createDinningTable() {
        return new ContemporaryDinnigTable();
    }
}
