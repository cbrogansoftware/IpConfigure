package org.cbrogansoftware.mocking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConcatenatorStandardTest {

    DependencyA dependencyA = new DependencyA("String1");
    DependencyB dependencyB = new DependencyB("String2");

    @Test
    public void concatThisReturnsExpectedValueAfterCreation() {
        Concatenator concatenator = new Concatenator(dependencyA, dependencyB);
        assertEquals("String1String2", concatenator.concatThis());
    }

}