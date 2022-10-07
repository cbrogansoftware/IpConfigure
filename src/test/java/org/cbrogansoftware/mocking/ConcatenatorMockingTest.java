package org.cbrogansoftware.mocking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConcatenatorMockingTest {

    DependencyA mockedDependencyA = mock(DependencyA.class);
    DependencyB mockedDependencyB = mock(DependencyB.class);

    Concatenator concatenator = new Concatenator(mockedDependencyA, mockedDependencyB);


}