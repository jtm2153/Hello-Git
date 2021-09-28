package com.jtm6;

public class Cat extends Animal implements Jumpping {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //重写接口类方法Jump()，否则只能把类定义为抽象
    @Override
    public void Jump() {
        System.out.println("跳高");
    }

    //重写父类方法，理由同上
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}
