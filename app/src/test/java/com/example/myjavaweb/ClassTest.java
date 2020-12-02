package com.example.myjavaweb;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class ClassTest {
    @Test
    public void testSleepTimeAVG() throws ParseException {
//        12:00 1:00 11:00 1:00 3:00 3:00 4:00 12:00 1:13
        SleepTime st = new SleepTime();
        st.getDate();

    }

    @Test
    public void testLotto(){
        Lotto lotto = new Lotto();
        ArrayList<Integer> list = lotto.getLotto();

        assertEquals(6, list.size());
        System.out.println(list.toString());
    }
    @Test
    public void testRandom(){
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
        System.out.println(Math.random() * 10 );
    }

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
