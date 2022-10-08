package org.cbrogansoftware.poc.cleanonly;

import org.cbrogansoftware.poc.cleanonly.GcdSam;

import java.math.BigInteger;
import java.util.ArrayList;

import javafx.util.Pair;

public class MainDriver {
    public static void main(String[] args) {

        // Setup for this POC
        BigInteger bi1, bi2, bi3;
        Pair<String, String> inPairs;

        // -----------------------------------------------------------------
        // 1) Lambda expression that calculates the greatest common divisor of two integers.
        GcdSam lambdaGcd = (b1, b2) -> b1.gcd(b2);

        // -----------------------------------------------------------------
        // 2) Accepts a file containing comma separated integer pairs.
        // * file logic here *
        ArrayList<Pair> listOfPairs = new ArrayList<>();

        // Load up the list with pairs
        inPairs = new Pair<>("3", "9");
        listOfPairs.add(inPairs);
        inPairs = new Pair<>("4", "44");
        listOfPairs.add(inPairs);
        inPairs = new Pair<>("5", "25");
        listOfPairs.add(inPairs);

        // Get each pair from the list by index
        for(int i=0;i < listOfPairs.size(); i++){
            Pair<String, String> outPairs = listOfPairs.get(i);
            bi1 = new BigInteger(outPairs.getKey().toString());
            bi2 = new BigInteger(outPairs.getValue().toString());

            bi3 = lambdaGcd.calcGcd(bi1, bi2);
            System.out.println("GCD for index " + i + " is: " + bi3);
        }

        // -----------------------------------------------------------------
        // 3) Calculate and display the greatest common divisor for each pair.
//        Moved these to the for loop above
//        bi3 = lambdaGcd.calcGcd(bi1, bi2);
//        System.out.println("my gcd: " + bi3);

        // -----------------------------------------------------------------
        // 4) Demonstrate concurrency by executing each calculation in a separate thread.
        // * Figure out the threading last *

    }
}
