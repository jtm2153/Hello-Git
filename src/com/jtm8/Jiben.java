package com.jtm8;

public class Jiben {
    public static void main(String[] args) {
        int num = 100;
        //整型转字符串型：方法一
        String s = String.valueOf(num);
        System.out.println(s);
        //方法二
        String s2 = "" + num;
        System.out.println(s2);

        //方法三（toString()是Object类的方法
        String s3 = Integer.toString(num);
        System.out.println(s3);
        System.out.println("--------");

        //字符串转整型：方法一
        String ss = "200";
        Integer i = Integer.valueOf(ss);
        int x = i.intValue();
        System.out.println(x);

        //方法二
        int y = Integer.parseInt(ss);
        System.out.println(y);


    }
}
