package com.jtm11;

import java.util.TreeSet;

public class zrTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("ace",25);
        Student s2 = new Student("sabo",24);
        Student s3 = new Student("luffy",22);

        Student s4 = new Student("jtm",22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student s:ts){
            System.out.println(s);
        }
    }
}
