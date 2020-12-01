package com.example.myjavaweb;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testLeapYear(){
        /// 1700 2020

        assertEquals(false, isLeapYear(1700));

    }

    private boolean isLeapYear(int year) {
        return false;
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

}