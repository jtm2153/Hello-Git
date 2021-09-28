package com.jtm2;

import java.util.Scanner;

public class Bianli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符：");
        String s = sc.next();
        char[] c = {'a','b'};
        System.out.println(c);
        //public char charAt(int index){}
        System.out.println(s.charAt(0));
    }
}
