package com.jtm;

import java.util.Scanner;

public class Pwdf {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        int x = 1;   //记录打分次数
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        //从键盘录入分数
        for(int i = 0;i < a.length;i++){
            System.out.println("请输入第" +x+ "分数：");
            int n = sc.nextInt();
            a[i] = n;
            sum += a[i];
            x++;
        }
        //sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5];
        int max = Max(a);
        int min = Max(a);
        avg = (sum - max - min) / (a.length - 2);
        System.out.println("去掉一个最高分、一个最低分，选手最终得分："+avg);
    }
    //求最高分
    public static int Max(int[] a){
        int max =  a[0];
        for(int i = 1;i <a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    //求最低分
    public static int Min(int[] a){
        int min =  a[0];
        for(int i = 1;i <a.length;i++){
            if(a[i] > min){
                min = a[i];
            }
        }
        return min;
    }
}
