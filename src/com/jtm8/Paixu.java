package com.jtm8;

import java.util.Arrays;

public class Paixu {
    public static void main(String[] args) {
        //将字符串中数据排序
    String s = "91 27 46 38 50";
    //分片取出，去除空格
    String[] srr = s.split(" ");
    //定义整型数组存储
    int[] arr = new int[srr.length];
    for(int i = 0;i < arr.length;i++){
        //字符串转为整型
        int a = Integer.parseInt(srr[i]);
        arr[i] = a;
    }
    //输出检查是否转型成功
    System.out.println(Arrays.toString(arr));
    //升序排序；也可用冒泡排序法
    Arrays.sort(arr);
   /* String i = Arrays.toString(arr);
        System.out.println(i);*/
   //定义StringBuilder类型存放数组
   StringBuilder sb = new StringBuilder();
   for(int i = 0;i < arr.length;i++){
       if(i == arr.length){
           sb.append(arr[i]);
       }else{
           //链式编程添加空格
           sb.append(arr[i]).append(" ");
       }
   }
   //转为普通字符串
   String ss = sb.toString();
        System.out.println(ss);
    }
}
