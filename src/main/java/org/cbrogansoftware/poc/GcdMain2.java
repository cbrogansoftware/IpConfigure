package org.cbrogansoftware.poc;

import java.math.*;

public class GcdMain2 {


    public static void main(String[] args) {

        // create 3 BigInteger objects
        BigInteger bi1, bi2, bi3;

        // assign values to bi1, bi2
        bi1 = new BigInteger("18");
        bi2 = new BigInteger("24");

        StandardGcd standardGcd = new StandardGcd();

        bi3 = standardGcd.myGcd(bi1, bi2);


        String str = "GCD of " + bi1 + " and " + bi2 + " is " + bi3;

        System.out.println(bi1);
        System.out.println(bi2);
        System.out.println(bi3);
        System.out.println(str);

    }
}