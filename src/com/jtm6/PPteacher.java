package com.jtm6;

public class PPteacher extends Teacher implements YY{
    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void Teach() {
        System.out.println("教球");
    }

    @Override
    public void yy() {
        System.out.println("学习英语");
    }
}
