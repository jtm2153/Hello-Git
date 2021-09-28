package com.jtm13;

import java.util.HashMap;
import java.util.Map;

//Map添加元素

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        //K--键    V--值
        m.put("001","ace");
        m.put("002","sabo");
        m.put("003","luffy");
        //会把之前键的内容覆盖掉
        m.put("002","娜美");

        System.out.println(m);
    }
}
