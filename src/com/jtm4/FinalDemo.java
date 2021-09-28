package com.jtm4;

public class FinalDemo {
    public static void main(String[] args) {
        final Final2 f = new Final2();
        f.age = 100;  //内容可变
        //地址不可变
//        f = new Final2();
    }
}
