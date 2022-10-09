package org.cbrogansoftware.inheritance;

public class Triangle implements Shape{

    private double base;
    private double height;
    private String fillColor;
    private int borderWidth;

    /**
     * The default Triangle.
     */
    Triangle(){
        setBase(5);
        setHeight(2);
        fillColor = "gray";
        borderWidth = 2;
    }

    @Override
    public double calculateArea() {
        return base * height/2;
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
        System.out.println("You are viewing a Triangle.");
        System.out.println("One of the many forms that can be implemented from the Shape interface.");
        System.out.println("Its area is: " + calculateArea() + " units (h*b/2).");
        System.out.println("Its border is: " + borderWidth + " units wide.");
        System.out.println("Its fill color is: " + fillColor);
    }

    public void setBase(double width) {
        this.base = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
