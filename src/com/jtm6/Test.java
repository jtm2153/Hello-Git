package com.jtm6;

public class Test {
    public static void main(String[] args) {
        PPsport pp = new PPsport();
        pp.setName("luffy");
        pp.setAge(22);
        System.out.println(pp.getName() + ":" + pp.getAge());
        pp.eat();
        pp.Study();
        pp.yy();

        System.out.println("--------");

        PPteacher p= new PPteacher();
        p.setName("jtm");
        p.setAge(22);
        System.out.println(p.getName() + ":" + p.getAge());
        p.eat();
        p.Teach();
        p.yy();
    }
}
