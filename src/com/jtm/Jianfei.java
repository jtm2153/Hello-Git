package com.jtm;

import java.util.Scanner;

public class Jianfei {
    public static void main(String[] args) {
        //减肥计划
        Scanner sc = new Scanner(System.in);
        System.out.println("请数入星期数：");
        String date = sc.next();
        if(date.equals("周一")){
            System.out.println("周一：跑步");
        }else if(date.equals("周二")){
            System.out.println("周二：游泳");
        }
        else if(date.equals("周三")){
            System.out.println("周三：慢走");
        }
        else if(date.equals("周四")){
            System.out.println("周四：动感单车");
        }
        else if(date.equals("周五")){
            System.out.println("周五：拳击");
        }
        else if(date.equals("周六")){
            System.out.println("周六：爬山");
        }
        else if(date.equals("周日")){
            System.out.println("周日：好好吃一顿");
        }else{
            System.out.println("请正确输入星期数！");
        }
        System.out.println("----------");
        switch (date){

            case "周一":
                System.out.println("周一：跑步");
                break;
            case "周二":
                System.out.println("周二：游泳");
                break;
            case "周三":
                System.out.println("周三：慢走");
                break;
            case "周四":
                System.out.println("周四：动感单车");
                break;
            case "周五":
                System.out.println("周五：拳击");
                break;
            case "周六":
                System.out.println("周六：爬山");
                break;
            case "周日":
                System.out.println("周日：好好吃一顿");
                break;
            default:
                System.out.println("请正确输入星期数！");
        }
    }
}
