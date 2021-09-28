package com.jtm13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> ah = new ArrayList<>();

        HashMap<String,String> hs1 = new HashMap<>();

        hs1.put("ace","25");
        hs1.put("sabo","24");
        hs1.put("luffy","22");

        ah.add(hs1);

        HashMap<String,String> hs2 = new HashMap<>();

        hs2.put("ace","25");
        hs2.put("sabo","24");
        hs2.put("luffy","22");

        ah.add(hs2);

        HashMap<String,String> hs3 = new HashMap<>();

        hs3.put("ace","25");
        hs3.put("sabo","24");
        hs3.put("luffy","22");

        ah.add(hs3);

        for(HashMap<String,String> hm:ah){
            Set<String> key = hm.keySet();
            for(String k:key){
                String v = hm.get(k);
                System.out.println(k + ":" + v);
            }
        }

    }
}
