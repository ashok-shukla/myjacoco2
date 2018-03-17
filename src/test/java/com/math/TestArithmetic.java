package com.math;

//import junit.framework.Test;
//import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestArithmetic {

    @Test
    public void testAdd(){
        Arithmetic am = new Arithmetic();
        int result = am.add(5, 2);
        int expected = 7;
        assertEquals(expected, result);
    }


    /*@Test
    public void testSubstract(){
        Arithmetic am = new Arithmetic();
        int result = am.substract(5, 2);
        int expected = 3;
        assertEquals(expected, result);
    }*/

}
