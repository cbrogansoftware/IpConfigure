package org.cbrogansoftware.poc;

public class SimpleCalculator {

    public int add (int numberA, int numberB){
        return numberA + numberB;
    }

    public char calculateGrade(int nGrade){
        if (nGrade < 0){
            throw new IllegalArgumentException("Number less than zero");
            //return 'F'; // to show illegal arg test works.
        } else if (nGrade < 60) {
            return 'F';
        } else if (nGrade < 70) {
            return 'D';
        } else if (nGrade < 80) {
            return 'C';
        } else if (nGrade < 90) {
            return 'B';
        } else if (nGrade < 100) {
            return 'A';
        } else {
            return 'X';
        }
    }

}
