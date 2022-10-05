package org.cbrogansoftware;


/**
 * Shape interface for public implementation as desired.
 */
public interface Shape {

    /**
     * Returns area of shape.
     * The calculateArea() method is key to demonstrating polymorphism
     * in this example because each subclass must implement the appropriate
     * geometric formula for its specific shape.
     * @return Area as double.
     */
    public double calculateArea();

    /**
     * Specify shape color.
     * @param color
     */
    public void fillShape(String color);

    /**
     * Specify shape border width.
     * Note: Border within bounds of shape area.
     * @param width
     */
    public void drawBorder(int width);

    /**
     * Print description of shape.
     */
    public void describeShape();
 }
