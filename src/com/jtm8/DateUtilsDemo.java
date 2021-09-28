package com.jtm8;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s = DateUtils.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);
        System.out.println("--------");

        String s2 = "2020-01-01 11:11:11";
        Date dd = DateUtils.stringToDate(s2,"yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
