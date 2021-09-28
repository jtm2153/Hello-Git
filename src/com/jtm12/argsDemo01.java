package com.jtm12;

public class argsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50,60,70,80,90));
    }
  /*  public static int sum(int ...a){
        int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;
    }*/
    public static int sum(int b,int... a){
        int sum = b;
        for(int i:a){
            sum += i;
        }
        return sum;
    }
    public static int sum(int a,int b){
        return a + b;
    }
}
