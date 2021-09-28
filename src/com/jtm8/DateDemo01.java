package com.jtm8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        Date dd = new Date();
        //System.out.println(d.getTime());
        System.out.println((int)(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365) + "年");
        System.out.println(dd);

        //setTime
        long time = 1142347382442l;
        d.setTime(time);
        System.out.println(d);
        System.out.println("--------");

        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(dd);
        System.out.println(s);
        System.out.println("--------");
        //解析
        String ss = "1998-09-22 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date ddd = sdf2.parse(ss);
        System.out.println(ddd);
    }
}
