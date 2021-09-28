package com.jtm13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("001","ace");
        map.put("002","sabo");
        map.put("003","luffy");

        //获取所有键值对对象的集合
        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        //遍历键值对对象的集合，得到每一个键值对对象
        for(Map.Entry<String,String> m:entrySet){
            //根据键值对对象获取键和值
            String k = m.getKey();
            String v = m.getValue();
            System.out.println(k + ":" + v);
        }
    }
}
