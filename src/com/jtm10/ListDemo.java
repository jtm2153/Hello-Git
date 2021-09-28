package com.jtm10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
        list集合特点
                有序，存储和取出元素顺序一致
                课重复，存取的元素课重复
**/
public class ListDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("ace");
        l.add("sabo");
        l.add("luffy");

        System.out.println(l);
        //迭代器方式输出
        Iterator<String> it = l.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
