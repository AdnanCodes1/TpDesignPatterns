package org.AdnanCodes1.DP_Bridge1;

public class Main {

    public static void main(String[] args){
        Shape redCircle = new Circle(new DrawRed());
        redCircle.draw();

        System.out.println("-------------------------------------------------");

        Shape rectangle2D = new Rectangle(new Draw2D());
        rectangle2D.draw();

        System.out.println("-------------------------------------------------");

        Shape circle2D = new Circle(new Draw2D());
        circle2D.draw();
    }

}
