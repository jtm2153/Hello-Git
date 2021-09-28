package com.jtm13;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tjTreeMap {
    public static void main(String[] args) {
        TreeMap<Character,Integer> t = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String n = sc.next();

        for(int i = 0;i < n.length();i++){
            char key = n.charAt(i);
            Integer value = t.get(key);
            if(value==null){
                t.put(key,1);
            }else{
                value++;
                t.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = t.keySet();
        for(Character k:keySet){
            Integer v = t.get(k);
            sb.append(k).append("(").append(v).append(")");
        }
        String s = sb.toString();

        System.out.println(s);
    }
}
