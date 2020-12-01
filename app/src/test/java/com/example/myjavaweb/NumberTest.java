package com.example.myjavaweb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberTest {
    @Test
    public void testPrime(){
        assertTrue(CMath.isPrime(3));
        assertTrue(CMath.isPrime(7));
//        assertTrue(CMath.isPrime(10));
    }

    @Test
    public void testPerpectionNumber(){
        assertTrue(CMath.isPerpectionNumber(6));
        assertTrue(CMath.isPerpectionNumber(28));
        assertFalse(CMath.isPerpectionNumber(100));

    }

    @Test
    public void testFactors(){
        assertEquals("[1, 2, 4, 8]", CMath.divisor(16));
//        assertEquals("[1, 2, 4, 8]", CMath.divisor(100));
    }
}
