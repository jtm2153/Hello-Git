package com.jtm7;

public class OIDemo {
    public static void main(String[] args) {
        //调用成员内部类：外部类名.内部类名 对象名 = new 外部类对象.new 内部类对象
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        System.out.println("--------");

        //若内部类用private修饰，则用外部类调用后再创建外部类对象
        Outer o = new Outer();
        o.show();

        System.out.println("--------");

        //调用局部内部类
        o.methon();

        System.out.println("--------");

        //调用匿名内部类
        o.show3();

        System.out.println("--------");

        //直接通过匿名内部类对象调用接口类，无需创建接口实现类
        o.show4(new Jiekou() {
            @Override
            public void sh() {
                System.out.println("我无敌，你随意！");
            }
        });
    }
}
