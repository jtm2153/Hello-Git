package com.jtm2;


public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:"+s1);
//String效果上相当于字符数组char[],底层原理是字节数组byte[]
        char[] c = {'a','b','c'};
        String s2 = new String(c);
        System.out.println(s2);

        byte[] b = {97,98,99};
        String s3 = new String(b);
        System.out.println(s3);

        String s4 = "abc";
        System.out.println(s4);
    }
}
