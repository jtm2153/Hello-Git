package com.jtm9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowableDemo {
    public static void main(String[] args) {
        methon();
        methon2();
    }
    public static void methon(){
        //编译时异常：不能编译
        try {
            String s = "2000-02-02";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);//没有try...catch会爆红提示，
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void methon2(){
        //运行时异常：没有爆红异常，但运行会出错
        int[] a = {1,2,3};
        System.out.println(a[3]);//超出范围
    }
}
