package com.example.myjavaweb;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassTest {
    @Test
    public void testStudent(){
        Student student = new Student("tester", "java");
        assertEquals("tester", student.getName());
        assertEquals("java", student.getCourse());
    }
    @Test
    public void testPerson(){
        Person 철수 = new Person("홍철수");
        assertEquals("홍철수", 철수.getName());

    }

    @Test
    public void testPoint2D(){
        Point2D point = new Point2D(2, 2);

        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }
}
