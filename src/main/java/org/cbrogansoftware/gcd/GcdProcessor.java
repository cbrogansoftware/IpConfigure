package org.cbrogansoftware.gcd;

import javafx.util.Pair;
import org.cbrogansoftware.gcd.GcdSam;

import java.math.BigInteger;
import java.util.ArrayList;

public class GcdProcessor implements Runnable {
    private int threadNumber;
    ArrayList<Pair> listOfPairs = new ArrayList<>();
    public GcdProcessor (ArrayList<Pair> listOfPairs, int threadNumber){
        this.threadNumber = threadNumber;
        this.listOfPairs = listOfPairs;
    }
    @Override
    public void run(){
        BigInteger bi1, bi2, bi3;
        GcdSam lambdaGcd = (b1, b2) -> b1.gcd(b2);

        for(int i=0;i < listOfPairs.size(); i++){
            Pair<String, String> outPairs = listOfPairs.get(i);
            bi1 = new BigInteger(outPairs.getKey().toString());
            bi2 = new BigInteger(outPairs.getValue().toString());

            bi3 = lambdaGcd.calcGcd(bi1, bi2);
            System.out.println("GcdProcessor1 for index " + i + " is: " + bi3 + " from thread " + threadNumber);
        }
    }
}
