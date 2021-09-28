package com.jtm12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class argsDemo02 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ace","sabo","luffy");
        /*list.add("jtm");//UnsupportedOperationException
        list.remove("ace");*/
        list.set(1,"jtm");
        System.out.println(list);
        System.out.println("--------");

        //jdk8没有of方法
       // List<String> list2 = List.of("ace","sabo","luffy");

        //Set<String> set = Set.of("ace","sabo","luffy");
    }
}
