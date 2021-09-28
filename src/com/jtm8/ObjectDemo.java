package com.jtm8;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Jtzero");
        s.setAge(22);
        System.out.println(s);

        System.out.println("--------");

        Student s2 = new Student();
        s2.setName("Jtzero");
        s2.setAge(22);
        System.out.println(s.equals(s2));


    }

}
