package com.jtm;

public class Phone {
    String name = "华为";
    Double price = 4000.0;

    public void Call(){
        System.out.println("打电话");
    }
    public void Music(){
        System.out.println("听音乐");
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.price);
        p.Music();
    }
}
