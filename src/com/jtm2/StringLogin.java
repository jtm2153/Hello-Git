package com.jtm2;

import java.util.Scanner;

public class StringLogin {
    public static void main(String[] args) {
        String username = "jtm";
        String password = "018301700032";

        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 3;i++){
            System.out.print("请输入用户名：");
            String user = sc.next();
            System.out.print("请输入密码：");
            String pass = sc.next();
            if(user.equals(username) && pass.equals(password)){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("登录失败！您还有" + (2 - i) + "次机会。");
            }
        }
    }
}
