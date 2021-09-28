package com.jtm11;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("luffy",22);
        //同一个对象
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());

        System.out.println("--------")
        ;
        Student s2 = new Student("sa",22);
        System.out.println(s2.hashCode());
        System.out.println("--------");

        System.out.println("jtm".hashCode());
        System.out.println("luffy".hashCode());
        System.out.println("--------");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("--------");

        System.out.println("你好".hashCode());
        System.out.println("滚".hashCode());
    }
}
