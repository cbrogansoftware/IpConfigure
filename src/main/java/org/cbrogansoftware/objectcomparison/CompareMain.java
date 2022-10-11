package org.cbrogansoftware.objectcomparison;

public class CompareMain {

    public static void main(String[] args)
    {

        House house1 = new House(4000, 3.5, "Blue", 2);
        House house2 = new House(3000, 2.5, "White", 0);
        House house3 = new House(3000, 2.5, "White", 0);

        System.out.println("----------------------");
        System.out.println("Three House objects have been created: house1, house2, house3");
        System.out.println("  house1 is constructed with different parameters than house2 and house3.");
        System.out.println("  house2 and house3 are constructed with identical parameters.");

        System.out.println("----------------------");
        System.out.println("Compare house1 to house1. Are they the same by...? ");
        System.out.println("  using reference |" + (house1 == house1) + "|");
        System.out.println("  using value |" + house1.equals(house1) + "|");
        System.out.println("  house1 hashCode |" + house1.hashCode() + "|");
        System.out.println("  house1 hashCode |" + house1.hashCode() + "|");

        System.out.println("----------------------");
        System.out.println("Compare house1 to house2. Are they the same by...? ");
        System.out.println("  using reference |" + (house1 == house2) + "|");
        System.out.println("  using value |" + house1.equals(house2) + "|");
        System.out.println("  house1 hashCode |" + house1.hashCode() + "|");
        System.out.println("  house2 hashCode |" + house2.hashCode() + "|");

        System.out.println("----------------------");
        System.out.println("Compare house2 to house3. Are they the same by...? ");
        System.out.println("  using reference |" + (house2 == house3) + "|");
        System.out.println("  using value |" + house2.equals(house3) + "|");
        System.out.println("  house2 hashCode |" + house2.hashCode() + "|");
        System.out.println("  house3 hashCode |" + house3.hashCode() + "|");

    }

}
