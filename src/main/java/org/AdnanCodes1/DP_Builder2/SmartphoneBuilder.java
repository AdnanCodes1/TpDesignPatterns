package org.AdnanCodes1.DP_Builder2;

public class SmartphoneBuilder {

    private String processor;
    private int ram;
    private int storage;
    private boolean has5G;
    private boolean hasWirelessCharging;

    public SmartphoneBuilder processor(String processor){
        this.processor = processor;
        return this;
    }

    public SmartphoneBuilder ram(int ram){
        this.ram = ram;
        return this;
    }

    public SmartphoneBuilder storage(int storage){
        this.storage = storage;
        return this;
    }

    public SmartphoneBuilder has5G(boolean has5G){
        this.has5G = has5G;
        return this;
    }

    public SmartphoneBuilder hasWirelessCharging(boolean hasWirelessCharging){
        this.hasWirelessCharging = hasWirelessCharging;
        return this;
    }

    public Smartphone build(){
        Smartphone smartphone = new Smartphone(processor, ram, storage, has5G, hasWirelessCharging);
        return smartphone;
    }

}
