package org.cbrogansoftware.poc;

import java.math.BigInteger;

/**
 * GcdSam Functional Interface
 *  Has SAM (Single Abstract Method) calcGcd for use in lambda expression.
 */
@FunctionalInterface
public interface GcdSam {
    BigInteger calcGcd (BigInteger bi1, BigInteger bi2);
}
