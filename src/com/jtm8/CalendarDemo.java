package com.jtm8;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH) + 1;
        int d = c.get(Calendar.DATE);
        System.out.println( y + "年" + m + "月" + d + "日");
        System.out.println("--------");

        c.add(Calendar.YEAR,-1);
        c.add(Calendar.MONTH,-1);
        c.add(Calendar.DATE,-1);
        int y2 = c.get(Calendar.YEAR);
        int m2 = c.get(Calendar.MONTH) + 1;
        int d2 = c.get(Calendar.DATE);
        System.out.println( y2 + "年" + m2 + "月" + d2 + "日");
        System.out.println("--------");

        c.set(1998,9,22);
        int y3 = c.get(Calendar.YEAR);
        int m3 = c.get(Calendar.MONTH) + 1;
        int d3 = c.get(Calendar.DATE);
        System.out.println( y3 + "年" + m3 + "月" + d3 + "日");
    }
}
