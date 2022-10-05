package org.cbrogansoftware;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.fillShape("black");
        rectangle.drawBorder(2);
        rectangle.describeShape();
    }
}
