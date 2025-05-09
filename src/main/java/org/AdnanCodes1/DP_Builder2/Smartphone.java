package org.AdnanCodes1.DP_Builder2;

public class Smartphone {

    private final String processor;
    private final int ram;
    private final int storage;
    private final boolean has5G;
    private final boolean hasWirelessCharging;

    Smartphone(String processor, int ram, int storage, boolean has5G, boolean hasWirelessCharging) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.has5G = has5G;
        this.hasWirelessCharging = hasWirelessCharging;
    }

    @Override
    public String toString() {
        return "Smartphone :  " +
                "\nprocessor = " + processor +
                "\nram = " + ram +
                "\nstorage = " + storage +
                "\nhas5G = " + has5G +
                "\nhasWirelessCharging = " + hasWirelessCharging;
    }
}
