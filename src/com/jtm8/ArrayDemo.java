package com.jtm8;

import com.jtm.Array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {45,65,8,3,46};
        System.out.println("排序前：" + Arrays.toString(arr));

        System.out.println("--------");

        //按升序排序（冒泡排序）
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

        System.out.println("--------");

        int[] a = {12,45,68,35,45};
        System.out.println("排序前：" + To(a));

        System.out.println("--------");

        //冒泡排序
        for(int j = 0;j < a.length - 1;j++){
            for(int i = 0;i < a.length - 1 - j;i++){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.println("排序后：" + To(a));



    }
    public static String To(int[] arr){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                s.append(arr[i]);
            }else{
                s.append(arr[i]).append(",");
            }
        }
        s.append("]");
        String ss = s.toString();
        return ss;
    }
}
