package com.example.myjavaweb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public ArrayList<Integer> getLotto() {
        Set<Integer> set = new HashSet<>();

        while(set.size() < 6){
            set.add((int)(Math.random() * 46));
        }

        return new ArrayList<>(set);

    }
}
