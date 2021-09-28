package com.jtm11;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        Random r = new Random();

        while (ts.size() < 10){
            int n = r.nextInt(20) + 1;
            ts.add(n);
        }
       for (Integer i:ts){
           System.out.println(i);
       }
    }
}
