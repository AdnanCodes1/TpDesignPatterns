package org.AdnanCodes1.DP_Bridge1;

public class Rectangle extends Shape{

    public Rectangle(DrawingAPI drawingAPI){
        super(drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawShape("Rectangle");
    }
}
