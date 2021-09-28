package com.jtm11;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(40);

        ts.add(20);

        for (Integer i:ts){
            System.out.println(i);
        }
        System.out.println("--------");
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("ace");
        ts2.add("sabo");
        ts2.add("luffy");

        for(String s:ts2){
            System.out.println(s);
        }
    }
}
