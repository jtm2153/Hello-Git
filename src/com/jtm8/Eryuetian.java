package com.jtm8;

import java.util.Calendar;
import java.util.Scanner;

public class Eryuetian {
    public static void main(String[] args) {
        //判断输入年份的二月有多少天
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int n = sc.nextInt();
        //获取日历对象
        Calendar c = Calendar.getInstance();
        //设置时间为三月一日
        c.set(n,2,1);
        //将日期减一即可得到二月份日期
        c.add(Calendar.DATE,-1);
        //获取二月份日期（多少天）
        int d = c.get(Calendar.DATE);
        System.out.println(d);
    }
}
