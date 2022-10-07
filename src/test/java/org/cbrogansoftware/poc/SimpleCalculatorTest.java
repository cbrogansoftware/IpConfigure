package org.cbrogansoftware.poc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();

        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void eightyFiveShouldBeB(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals('B', calculator.calculateGrade(85));
    }

    @Test
    void seventyFiveShouldBeC(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals('C', calculator.calculateGrade(75));
    }

    @Test
    void negOneShouldBeIllegal(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals('C', calculator.calculateGrade(-1));
        });
    }

}