package org.AdnanCodes1.DP_AbstractFactory;

public class FurnitureStore {

    public void sellPack(FurnitureFactory furnitureFactory){

        Chair chair = furnitureFactory.createChair();
        DinningTable dinningTable = furnitureFactory.createDinningTable();
        Cabinet cabinet = furnitureFactory.createCabinet();

        String pack = "";

        double priceBeforeDiscount = chair.getPrice() + cabinet.getPrice() + dinningTable.getPrice();
        double priceAfterDiscount = priceBeforeDiscount - priceBeforeDiscount * 0.15;

        switch (furnitureFactory.getClass().getSimpleName()){
            case "ClassicalFactory" -> pack = "Classical furniture pack";
            case "ContemporaryFactory" -> pack = "Contemporary furniture pack";
            case "ScandinavianFactory" -> pack = "Scandinavian furniture pack";
        }

        System.out.println("Pack : " + pack);
        System.out.println("Pack Content : " + chair.getName() + " + " + dinningTable.getName() + " + " + cabinet.getName());
        System.out.println("Price : " + priceAfterDiscount + "dhs");
    }

    public void sellItem(String itemType, FurnitureFactory furnitureFactory) {
        Chair chair;
        DinningTable dinningTable;
        Cabinet cabinet;

        switch (itemType.toLowerCase()){
            case "chair" -> {
                chair = furnitureFactory.createChair();
                System.out.println("Item : " + chair.getName());
                System.out.println("Price : " + chair.getPrice() + " dhs");
            }
            case "cabinet" -> {
                cabinet = furnitureFactory.createCabinet();
                System.out.println("Item : " + cabinet.getName());
                System.out.println("Price : " + cabinet.getPrice() + " dhs");
            }
            case "dinning table" -> {
                dinningTable = furnitureFactory.createDinningTable();
                System.out.println("Item : " + dinningTable.getName());
                System.out.println("Price : " + dinningTable.getPrice() + " dhs");
            }
        }



    }

}
