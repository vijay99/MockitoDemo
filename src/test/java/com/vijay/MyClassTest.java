package com.vijay;

import com.test.MyAbstractClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyClassTest {


    class MyInnerclass extends MyAbstractClass{

        @Override
        protected int multiply(int p,int q){
            return p*q;
        }

    }

    @Test
    public void testMyMethod() {

       // create a mock of the abstract class
       // MyAbstractClass mockAbstract = mock(MyAbstractClass.class);

       // mock inner class that is extending the class which we want to mock
        MyInnerclass mockMyInnerClass = mock(MyInnerclass.class);

        // Define the behavior of the protected method
        when(mockMyInnerClass.multiply(anyInt(),anyInt())).thenReturn(anyInt());

        // Create an instance of the class you are testing
        MyClass myClass = new MyClass();

        // Call the method you want to test
        int result = myClass.myMethod(4,5);

        // Assert or verify the result as needed
        assertEquals(20, result);

    }
}