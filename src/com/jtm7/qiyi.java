package com.jtm7;

public class qiyi {
    public static void main(String[] args) {
        System.out.println(max((double) 1,2));
    }
    public static double max (int num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static double max (double num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
