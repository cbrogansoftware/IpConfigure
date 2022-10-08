package org.cbrogansoftware.poc.cleanonly;

import java.math.BigInteger;

@FunctionalInterface
public interface GcdSam { // SAM Single Abstract Method
    BigInteger calcGcd (BigInteger bi1, BigInteger bi2);
}