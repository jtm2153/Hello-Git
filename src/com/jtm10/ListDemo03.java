package com.jtm10;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("ace");
        arr.add("sabo");
        arr.add("luffy");

        for(String s:arr){
            System.out.println(s);
        }
        System.out.println("--------");

        LinkedList<String> l = new LinkedList<>();

        l.add("sdf");
        l.add("sdfs");
        l.add("gfg");

        for(String s:l){
            System.out.println(s);
        }
    }
}
/*
        void addFirst(E e)
        void adLast(E e)
        E getFirst()
        E getLast()
        E removeFirst()
        E removeLast()

*/
