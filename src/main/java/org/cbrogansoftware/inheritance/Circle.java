package org.cbrogansoftware.inheritance;

public class Circle implements Shape{

    private double radius;
    private String fillColor;
    private int borderWidth;

    /**
     * The default Triangle.
     */
    Circle(){
        setRadius(5);
        fillColor = "gray";
        borderWidth = 2;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void fillShape(String color) {
        fillColor = color;
    }

    @Override
    public void drawBorder(int width) {
        borderWidth = width;
    }

    @Override
    public void describeShape() {
        System.out.println("You are viewing a Circle.");
        System.out.println("One of the many forms that can be implemented from the Shape Interface.");
        System.out.println("Its area is: " + calculateArea() + " units (PI*r*r).");
        System.out.println("Its border is: " + borderWidth + " units wide.");
        System.out.println("Its fill color is: " + fillColor);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
