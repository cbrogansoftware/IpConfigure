package org.cbrogansoftware.inheritance;

public class Rectangle implements Shape{

    private double width;
    private double height;
    private String fillColor;
    private int borderWidth;

    /**
     * The default Rectangle.
     */
    Rectangle(){
        setWidth(20);
        setHeight(10);
        fillColor = "white";
        borderWidth = 1;
    }

    @Override
    public double calculateArea() {
        return width * height;
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
        System.out.println("You are viewing a Rectangle.");
        System.out.println("One of the many forms that can be implemented from the Shape interface.");
        System.out.println("Its area is: " + calculateArea() + " units (h*w).");
        System.out.println("Its border is: " + borderWidth + " units wide.");
        System.out.println("Its fill color is: " + fillColor);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
