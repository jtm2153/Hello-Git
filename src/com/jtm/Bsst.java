package com.jtm;

public class Bsst {
    public static void main(String[] args) {
        //不死神兔
        int[] a = new int[20];
        a[0] = 1;
        a[1] = 1;
        a[2] = a[0] + a[1];
        for(int i = 2;i < a.length;i++){
            a[i] = a[i - 2] + a[i - 1];
        }
        System.out.println(a[19]);
    }
}
