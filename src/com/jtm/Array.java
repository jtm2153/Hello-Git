package com.jtm;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a1 = new int[3];
        int a2[] = {1,2,3};
        System.out.println(a1);
        System.out.println(a2);
        a2 = null;
        System.out.println(a2);
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的数：");
        int a = sc.nextInt();
        Jiou(a);
        System.out.println(a);
        int b = 20;
        System.out.println(jtm(b));
        int[] c = new int[4];
        System.out.println("请输入：");
        for(int i = 0;i<c.length;i++){
            int x = sc.nextInt();
            c[i] = x;
        }
        aa(c);
        int x = aa2(c);
        System.out.println(x);
    }
    public static void aa(int[] c){
        for(int i = 0;i<c.length;i++){
            if(i == c.length-1){
                System.out.println(c[i]);
            }else{
                System.out.print(c[i] + ",");
            }
        }
    }
    public static int aa2(int[] c){
        int max = c[0];
        for(int i = 0;i<c.length;i++){
           if(c[i] > max){
               max = c[i];
           }
        }
       return max;
    }
    public static void Jiou(int a){
        a =  20;
        if(a % 2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    public static int jtm(int a){
        a = 10;
        return a;
    }
}
