package com.jtm11;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Set<Student> set = new HashSet<>();

        Student s1 = new Student("ace",25);
        Student s2 = new Student("sabo",24);
        Student s3 = new Student("luffy",22);
        //Student没有重写hashCode()和equals()方法的话，可以重复添加，因为不是本类的对象
        Student s4 = new Student("luffy",22);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s:hs){
            System.out.println(s);
        }
        System.out.println("--------");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        //Student没有重写hashCode()和equals()方法的话，可以重复添加，因为不是本类的对象
        set.add(s4);

        for (Student s:set){
            System.out.println(s);
        }

    }
}
