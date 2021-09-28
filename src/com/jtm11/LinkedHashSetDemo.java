package com.jtm11;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashSet：有序且没有重复的集合
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("ace");
        lhs.add("sabo");
        lhs.add("luffy");
        lhs.add("luffy");

        for (String s:lhs){
            System.out.println(s);
        }
    }
}
