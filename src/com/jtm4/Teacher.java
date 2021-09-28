package com.jtm4;

public class Teacher extends Person {
    public void Teach(){
        System.out.println("教猴育人");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
       super(name,age);
    }
}
