package org.AdnanCodes1.DP_AbstractFactory;

public class Main {

    public static void main(String[] args) {

        FurnitureStore store = new FurnitureStore();

        FurnitureFactory scandinavianFactory = new ScandinavianFactory();

        store.sellPack(scandinavianFactory);

        System.out.println("-------------------------------------------------------------");

        store.sellItem("dinning table", scandinavianFactory);

    }

}
