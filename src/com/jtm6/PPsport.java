package com.jtm6;

public class PPsport extends Sport implements YY{
    @Override
    public void Study() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void yy() {
        System.out.println("学习英语");
    }
}
