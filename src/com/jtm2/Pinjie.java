package com.jtm2;

public class Pinjie {
    public static void main(String[] args) {
        //字符串反转跟数组一样
        //字符串拼接
        int[] arr = {1,2,3};
        String s = Tostring(arr);
        System.out.println(s);
        System.out.println(5 + 6 + "a" + 5 + 6);
        //--------------------
        //拼接升级版--StringBuilder
        String s2 = To(arr);
        System.out.println(s2);
        //--------------------
        //反转升级版--StringBuilder
        String s3 = Fanzhuan(arr);
        System.out.println(s3);

    }
    public static String Tostring(int[] arr){
        String s = "[";
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                s += arr[i];
            }else{
                s += arr[i] + ",";
            }
        }
        s += "]";
        return s;
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
    public static String Fanzhuan(int[] arr){
        StringBuilder s = new StringBuilder();
        s.append("]");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                s.append(arr[i]);
            }else{
                s.append(arr[i]).append(",");
            }
        }
        s.append("[");
//        s.reverse();
//        String ss = s.toString();
        return s.reverse().toString();
    }
}
