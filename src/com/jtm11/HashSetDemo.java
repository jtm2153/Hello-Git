package com.jtm11;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("ace");
        hs.add("sabo");
        hs.add("luffy");

        for(String s:hs){
            System.out.println(s);
        }
    }
}
