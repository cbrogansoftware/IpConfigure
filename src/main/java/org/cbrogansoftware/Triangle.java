package org.cbrogansoftware;

public class Triangle implements Shape{

    private double width;
    private double height;
    private String fillColor;
    private int borderWidth;

    /**
     * The default Rectangle.
     */
    Triangle(){
        setWidth(0);
        setHeight(0);
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
        System.out.println("One of the many forms the Shape Interface can implement.");
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
