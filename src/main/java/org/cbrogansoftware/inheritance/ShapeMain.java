package org.cbrogansoftware.inheritance;

public class ShapeMain {
    public static void main(String[] args) {

        System.out.println("----------------");
        Rectangle rectangle = new Rectangle();
        rectangle.describeShape();
        System.out.println("----------------");
        Triangle triangle = new Triangle();
        triangle.describeShape();
        System.out.println("----------------");
        Circle circle = new Circle();
        circle.describeShape();
        System.out.println("----------------");

    }
}
