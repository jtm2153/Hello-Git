package com.jtm4;

public class Fu {
    public int age = 50;
    public void show(){
        System.out.println("我是你爸爸！！！");
    }

    public Fu(){
        System.out.println("1");
    }
    public Fu(int age){
        System.out.println("2,"  + age);
    }
}
