package com.jtm11;

import java.util.HashSet;
import java.util.Set;

public class SetDemo011 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("ace");
        set.add("sabo");
        set.add("luffy");
        //不包含重复输入元素
        set.add("luffy");
        //不能用普通for循环遍历
        for(String s:set){
            //输出元素的顺序不一定跟输入一样
            System.out.println(s);
        }
    }
}
