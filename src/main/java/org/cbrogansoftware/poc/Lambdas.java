package org.cbrogansoftware.poc;

import java.math.BigInteger;

public class Lambdas {

    public static void main(String[] args) {
//        Cat myCat = new Cat();
//        myCat.print();
        BigInteger bi1, bi2, bi3;
        bi1 = new BigInteger("18");
        bi2 = new BigInteger("24");

        Printable lambdaPrintable = (s, p) -> System.out.println(p + " Meow1 " + s);
        lambdaPrintable.print("!", "Pre");

        System.out.println("--------------");

        GcdSam1 lambdaGcd = (b1, b2) -> b1.gcd(b2);
        bi3 = lambdaGcd.myGcd(bi1, bi2);

        System.out.println("my gcd: " + bi3);

        //printThing(lambdaPrintable);
    }

//    static void printThing(Printable thing){
//        thing.print("!");
//    }
}
