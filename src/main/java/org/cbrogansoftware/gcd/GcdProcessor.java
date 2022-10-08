package org.cbrogansoftware.gcd;

import javafx.util.Pair;
import org.cbrogansoftware.gcd.GcdSam;

import java.math.BigInteger;
import java.util.ArrayList;

public class GcdProcessor implements Runnable {
    private int threadNumber;
    Pair<String, String> pair;

    /**
     * GcdProcessor - Class for processing Greatest Common Divisor
     * @param pair - Pass Pair object with two string representations of integers.
     *                  This processor uses BigInteger.gcd which requires the pair of values
     *                  to be passed as strings.
     * @param threadNumber - Passed here to be used for demo purposes to show what thread is actually doing
     *                          the GCD calculation.
     */
    public GcdProcessor (Pair pair, int threadNumber){
        this.threadNumber = threadNumber;
        this.pair = pair;
    }
    @Override
    public void run(){
        BigInteger bi1, bi2, bi3;
        GcdSam lambdaGcd = (b1, b2) -> b1.gcd(b2);

        Pair<String, String> outPairs = pair;
        bi1 = new BigInteger(outPairs.getKey().toString());
        bi2 = new BigInteger(outPairs.getValue().toString());
        bi3 = lambdaGcd.calcGcd(bi1, bi2);
        System.out.println("ThreadNumber: " + threadNumber
                            + " Integer1: " + bi1
                            + " Integer2: " + bi2
                            + " GCD: " + bi3);
    }
}
