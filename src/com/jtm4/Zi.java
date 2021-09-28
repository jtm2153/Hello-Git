package com.jtm4;

public class Zi extends Fu{
    public String name = "儿子";
    //public int age = 40; 后访问成员变量，若此类中没有age变量，再访问父类，父类没有则报错
    /* 访问变量优先级 */
    public void Methon(){
        //int age = 20;  最先访问（使用）局部变量
        System.out.println(name + age);
        System.out.println("调用bb");
    }
    public Zi(){
        super(20);
        System.out.println("3" + age);
    }
    public Zi(int age){
        super(50);
        System.out.println("4" + age);
    }
}
