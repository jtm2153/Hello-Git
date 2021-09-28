package com.jtm8;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("1970.01.01距现在" + System.currentTimeMillis() * 1.0 / 1000 /60 / 60 / 24 / 365 + "年");
        System.out.println("1970.01.01距现在" + (int)(System.currentTimeMillis() * 1.0 / 1000 /60 / 60 / 24 / 365) + "年");

        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000;i++){
            System.out.println(i);
            System.out.println("jtm");
        }
        long end = System.currentTimeMillis();
        System.out.println("此for循环共耗时：" + (end - start) + "毫秒");
    }
}
