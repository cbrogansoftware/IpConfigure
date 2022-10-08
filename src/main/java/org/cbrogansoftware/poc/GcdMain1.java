package org.cbrogansoftware.poc;

import java.math.*;

public class GcdMain1 {


        public static void main(String[] args) {

            // create 3 BigInteger objects
            BigInteger bi1, bi2, bi3;

            // assign values to bi1, bi2
            bi1 = new BigInteger("18");
            bi2 = new BigInteger("24");

            // assign gcd of bi1, bi2 to bi3
            bi3 = bi1.gcd(bi2);

            String str = "GCD of " + bi1 + " and " + bi2 + " is " +bi3;

            // print bi3 value
            System.out.println( str );

           // bi3 = (bi1, bi2)->{ bi1.gcd(bi2);}
        }
}
