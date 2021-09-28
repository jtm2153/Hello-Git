package com.jtm3;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("jtm");
        a.add("018301700032");
        a.add("hello");

        for(int i = 0;i < a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
