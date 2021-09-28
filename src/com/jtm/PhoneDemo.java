package com.jtm;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.name);
        System.out.println(p.price);
        p.Call();
        p.Music();
    }
}
