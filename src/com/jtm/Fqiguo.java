package com.jtm;

public class Fqiguo {
    public static void main(String[] args) {
        //逢七过
        for(int i = 1;i <= 100;i++){
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
