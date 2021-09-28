package com.jtm2;

import java.util.Scanner;

public class Tongji {
    public static void main(String[] args) {
        //大写、小写、数字出现次数
        int a = 0,b = 0,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.next();
        for(int i = 0;i < line.length();i++){
            if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'){
                a++;
            }else if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z'){
                b++;
            }else if(line.charAt(i) >= '0' && line.charAt(i) <= '9'){
                c++;
            }
        }
        System.out.println("大写字母有：" + a + "个，小写字母有：" + b + "个，数字有：" + c + "个。");
    }
}
