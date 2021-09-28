package com.jtm6;

public class JTDemo {
    public static void main(String[] args) {
        //接口引用指向实现类对象
       Jumpping j = new Cat();
       j.Jump();
       ((Cat) j).eat();///Cat jj = (Cat)j;

        //父类引用指向子类对象
       Animal a = new Cat();
       a.setName("JT");
       a.setAge(22);
        System.out.println(a.getName() + a.getAge());
       a.eat();
       ((Cat) a).Jump();
        System.out.println("--------");

        //直接创建对象
       Cat c = new Cat();
       c.setAge(22);
       c.setName("jtm");
        System.out.println(c.getName() + c.getAge());
        c.eat();
        c.Jump();
    }
}
