package org.cbrogansoftware.mocking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ConcatenatorMockingTest {

    DependencyA mockDependencyA;
    DependencyB mockDependencyB;
    Concatenator concatenator;

    @BeforeEach
    public void setUp() {
        mockDependencyA = mock(DependencyA.class);
        mockDependencyB = mock(DependencyB.class);
        concatenator = new Concatenator((DependencyA) mockDependencyA, mockDependencyB);
    }

    @Test
    public void testConcatThisReturnValueWhen() throws Exception {

        // Define the return values when particular methods of the mocked objects are called.
        when(mockDependencyA.getMyStringA()).thenReturn("String1");
        when(mockDependencyB.getMyStringB()).thenReturn("String2");

        // Standard JUnit test asserts that expected string matches actual return value;
        assertEquals("String1String2", concatenator.concatThis());

        // Verify particular methods of the mocked objects are called 1 time each.
        // (Note: Explicitly specified as 1 here for demo purposes.)
        verify(mockDependencyA, times(1)).getMyStringA();
        verify(mockDependencyB, times(1)).getMyStringB();

    }
}