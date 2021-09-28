package com.jtm13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//遍历一：通过键获取值

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("001","ace");
        map.put("002","sabo");
        map.put("003","luffy");

        Set<String> ks = map.keySet();
        for(String k:ks){
            String v = map.get(k);
            System.out.println(k + ":" + v);
        }
    }
}
