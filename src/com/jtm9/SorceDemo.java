package com.jtm9;

import java.util.Scanner;

public class SorceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        int n = sc.nextInt();
        Sorce s = new Sorce();
        try {
            s.checksorce(n);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
