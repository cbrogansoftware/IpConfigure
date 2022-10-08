package org.cbrogansoftware.poc;

import java.math.BigInteger;

public class StandardGcd implements GcdSam1{

    //public BigInteger GcdSam1 (){return x;};

    @Override
    public BigInteger myGcd(BigInteger bi1, BigInteger bi2) {
        return bi1.gcd(bi2);
    }

}
