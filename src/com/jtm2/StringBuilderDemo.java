package com.jtm2;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //String和StringBuilder相互转换
        StringBuilder s = new StringBuilder();
        s.append("jtm");
        String ss = s.toString();
       // String ss = String.valueOf(s);
        System.out.println(ss);

        String s2 = "jtm";
        StringBuilder ss2 = new StringBuilder(s2);
        ss2.append("100");
        ss2.reverse();
        System.out.println(ss2);
    }
}
