package com.jtm4;

public class Student extends Person {
    public void Study(){
        System.out.println("好好恋爱，天天向上");
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
