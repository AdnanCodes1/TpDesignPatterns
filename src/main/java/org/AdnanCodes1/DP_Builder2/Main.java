package org.AdnanCodes1.DP_Builder2;

public class Main {

    public static void main(String[] args) {

        SmartphoneBuilder builder = new SmartphoneBuilder();

        Smartphone smartphone1 = builder.ram(8)
                .storage(128)
                .processor("SnapDragon GEN1")
                .has5G(true)
                .hasWirelessCharging(true)
                .build();

        System.out.println(smartphone1);

    }

}
