package com.jtm;

import java.util.Scanner;

public class szqh {
    public static void main(String[] args) {
        //数组元素求和，个位、十位不能有7并只求偶数
        int[] a = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] % 10 != 7 || a[i] / 10 % 10 != 7){
                if(a[i] % 2 == 0){
                    sum += a[i];
                }
            }
        }
        System.out.println(sum);
        //---------------------
        int[] x = {1,3,2};
        int[] y = {1,3,2};
        boolean bl = a2(x,y);
        System.out.println(bl);
        //---------------------
        int[] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();
        int sy = Search(n,arr);
        System.out.println(sy);
        //--------------------
        int[] arr2 = {19,28,37,46,50};
        Fz(arr2);
    }
    //比较两数组内容是否相同
    public static boolean a2(int[] x,int[] y){
        //判断一：数组长度
        if(x.length != y.length){
            return false;
        }
        //判断二：元素是否相等（包括顺序）
            for(int i = 0;i < x.length;i++){
                if(x[i] != y[i]){
                    return false;
                }
            }
            return true;
    }
    //输入一个数，查找索引
    public static int Search(int n,int[] arr){
        //初始化/输入数据不在数组的返回值
        int num = -1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == n){
                num = i;
                break;
            }
        }
        return num;
    }
    //数组反转
    /*for(int start = 0,end = arr2.length - 1;start <= end;start++,end--){
        int temp = arr2[start];
        arr2[start] = arr2[end];
        arr2[end] = temp;
    }*/
    public static void Fz(int[] arr2){
        //定义一个新数组
        int[] arr3 = new int[arr2.length];
        for(int i = 0;i < arr2.length;i++){
            //头尾依次交换
            arr3[i] = arr2[arr2.length - i - 1];
        }
        System.out.print("[");
        for(int i = 0;i < arr3.length;i++){
            //判断是否为最后一个，是就不用加逗号隔开
           if(i == arr3.length - 1){
               System.out.print(arr3[i]);
           }else{
               System.out.print(arr3[i] + ",");
           }
        }
        System.out.println("]");
    }
}


