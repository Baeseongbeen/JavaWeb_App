package com.example.myjavaweb;

import androidx.collection.ArraySet;

import java.util.ArrayList;
import java.util.List;

public class CMath {
    public static String divisor(int num){
        List<Integer> numbers = divisorOf(num);
        return numbers.toString();
    }

    private static List<Integer> divisorOf(int num) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) numbers.add(i);
        }
        return numbers;
    }

    public static boolean isPerpectionNumber(int num) {
        List<Integer> numbers = divisorOf(num);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
            sum = sum + numbers.get(i);
        return (sum == num) ;
    }

    public static boolean isPrime(int num) {
        List<Integer> numbers = divisorOf(num);
        return ( 1 == numbers.size());
    }
}
