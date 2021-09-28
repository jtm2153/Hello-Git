package com.jtm13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map的常用方法

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("001","ace");
        m.put("002","sabo");
        m.put("003","luffy");

        //System.out.println(m.remove("002"));
        //System.out.println(m.remove("004"));

        //m.clear();

//        System.out.println(m.containsKey("001"));
//        System.out.println(m.containsValue("luffy"));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println(m.get("001"));
        System.out.println("--------");

        Set<String> ks = m.keySet();
        for(String k:ks){
            System.out.println(k);
        }
        System.out.println("--------");
        Collection<String> vc = m.values();
        for(String v:vc){
            System.out.println(v);
        }
        System.out.println(m);
    }
}
