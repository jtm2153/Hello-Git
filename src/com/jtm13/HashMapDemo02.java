package com.jtm13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo02 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("25");
        ar1.add("25");
        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("24");
        ar2.add("24");
        ArrayList<String> ar3 = new ArrayList<>();
        ar3.add("22");
        ar3.add("22");

        hm.put("ace",ar1);
        hm.put("sabo",ar2);
        hm.put("luffy",ar3);

        Set<Map.Entry<String, ArrayList<String>>> sm = hm.entrySet();
        for(Map.Entry<String,ArrayList<String>> kv:sm){
            String k = kv.getKey();
            System.out.println(k);
            ArrayList<String> v = kv.getValue();
            for(String s:v){
                System.out.println("\t" + s);
            }
        }
    }
}
