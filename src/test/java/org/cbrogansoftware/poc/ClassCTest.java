package org.cbrogansoftware.poc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
class ClassCTest {

    //@Mock
    //private ClassA classA;
    ClassA mockedClassA = mock(ClassA.class);

    //@Mock
    //private ClassB classB;
    ClassB mockedClassB = mock(ClassB.class);

    private ClassC classC;

    @BeforeEach
    void setup() {
        classC = new ClassC(mockedClassA, mockedClassB);
        //classC = new ClassC(classA, classB);
    }

    @Test
    public void testCombineString() {
        final String str1 = "TestStringA";
//        final String str2 = "TestStringB";
//
        when(mockedClassA.getSomeString()).thenReturn(str1);
//        when(mockedClassB.getSomeString()).thenReturn(str2);

        //mockedClassA.getSomeString();
        verify(mockedClassA).getSomeString();

        //when(classA.getSomeString()).thenReturn(str1);
        //when(classB.getSomeString()).thenReturn(str2);

        final String result  = classC.combineString();



//        assertEquals(true , result.startsWith(str1));
//        assertEquals(true, result.endsWith(str2));
    }

// This baseline test passes with standard JUnit functionality
//    @Test
//    void combineString() {
//        ClassA classA = new ClassA();
//        ClassB classB = new ClassB();
//        ClassC classC = new ClassC(classA, classB);
//        assertEquals("ClassA and ClassB", classC.combineString());
//    }
}