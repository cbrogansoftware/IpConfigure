package org.cbrogansoftware.objectcomparison;

import java.util.Objects;

/**
 * House class for demonstrating object comparison.
 */
public class House {

    private Integer squareFoot;
    private Double numBaths;
    private String exteriorColor;
    private Integer numFirePlaces;

    /**
     * Create house by passing desired attributes.
     * @param squareFoot
     * @param numBaths
     * @param exteriorColor
     * @param numFirePlaces
     */
    public House(Integer squareFoot, Double numBaths, String exteriorColor, Integer numFirePlaces) {
        this.squareFoot = squareFoot;
        this.numBaths = numBaths;
        this.exteriorColor = exteriorColor;
        this.numFirePlaces = numFirePlaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return squareFoot.equals(house.squareFoot) && numBaths.equals(house.numBaths) && exteriorColor.equals(house.exteriorColor) && numFirePlaces.equals(house.numFirePlaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareFoot, numBaths, exteriorColor, numFirePlaces);
    }
}
