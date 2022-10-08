package org.cbrogansoftware.poc.cleanonly;

import org.cbrogansoftware.poc.GcdSam1;
import org.cbrogansoftware.poc.Printable;

import java.math.BigInteger;

public class MainDriver {
    public static void main(String[] args) {

        // Setup for this POC
        BigInteger bi1, bi2, bi3;
        bi1 = new BigInteger("18");
        bi2 = new BigInteger("24");

        // 1) Lambda expression that calculates the greatest common divisor of two integers.
        GcdSam1 lambdaGcd = (b1, b2) -> b1.gcd(b2);

        // 2) Accepts a file containing comma separated integer pairs.
        // * file logic here *

        // 3) Calculate and display the greatest common divisor for each pair.
        bi3 = lambdaGcd.myGcd(bi1, bi2);
        System.out.println("my gcd: " + bi3);

        // 4) Demonstrate concurrency by executing each calculation in a separate thread.
        // * Figure out the threading last *

    }
}
