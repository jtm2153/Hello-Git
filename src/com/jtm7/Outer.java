package com.jtm7;

public class Outer {

    private int num = 22;

    public class Inner{
        public void show(){
            //可直接访问外部类成员
            System.out.println(num);
            System.out.println("成员内部类");
        }
    }
    public void show(){
        //访问内部类成员需创建对象
        Inner i = new Inner();
        i.show();
    }
    public void methon(){
        int num2 = 20;
        class Neibu{
            public void show2(){
                System.out.println(num);
                System.out.println(num2);
                System.out.println("局部内部类");
            }
        }
        Neibu n = new Neibu();
        n.show2();
    }
    public void show3(){
        /*new Jiekou(){
            @Override
            public void sh() {
                System.out.println("匿名内部类");
            }
        };
    }*/
        /*new Jiekou(){
            @Override
            public void sh() {
                System.out.println("匿名内部类");
            }
        }.sh();*/
        //匿名内部类本质是一个对象
        Jiekou j = new Jiekou(){
            @Override
            public void sh() {
                System.out.println("匿名内部类");
            }
        };
        j.sh();
        j.sh();
        j.sh();
    }
    public void show4(Jiekou j){
        j.sh();
    }
}
