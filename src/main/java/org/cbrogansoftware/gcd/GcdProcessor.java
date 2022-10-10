package org.cbrogansoftware.gcd;

import javafx.util.Pair;

import java.math.BigInteger;
import java.util.function.BinaryOperator;

public class GcdProcessor implements Runnable {
    private final int threadNumber;
    Pair<String, String> pair;

    /**
     * Class for processing Greatest Common Divisor
     * @param pair Pass Pair object with two string representations of integers.
     *               This processor uses BigInteger.gcd which requires the pair of values
     *               to be passed as strings.
     * @param threadNumber Passed here to demonstrate concurrency. It shows which thread is actually doing
     *                       the GCD calculation.
     */
    public GcdProcessor (Pair pair, int threadNumber){
        this.threadNumber = threadNumber;
        this.pair = pair;
    }
    @Override
    public void run(){
        calcGcd();
    }

    /**
     * Designed specifically for this assessment to calculate
     *   and display GCD with its operands and thread number.
     *
     * A real world implementation would likely see this method
     *   simply calculate and return the GCD as Integer.
     *
     * Note that this method also satisfies the lambda requirement
     *   and uses the functional interface called BinaryOperator<T>.
     */
    private void calcGcd() {
        BigInteger bi1, bi2, bi3;
        BinaryOperator<BigInteger> gcd = (b1, b2) -> b1.gcd(b2);

        Pair<String, String> outPairs = pair;
        bi1 = new BigInteger(outPairs.getKey().toString());
        bi2 = new BigInteger(outPairs.getValue().toString());
        bi3 = gcd.apply(bi1, bi2);
        System.out.println("ThreadNumber: " + threadNumber
                            + " Integer1: " + bi1
                            + " Integer2: " + bi2
                            + " GCD: " + bi3);
    }
}
