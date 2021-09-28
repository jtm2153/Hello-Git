package com.jtm4;

/*public class Final {
    public int age = 22;

    public void jtm(){
        System.out.println("fianl" +age);
    }
}*/
public final class Final {//被fianl修饰了不能被继承
    public final int age = 22;

    public final void jtm(){//被final修饰了不能被重写
        //age = 20;被final修饰了不能再赋值
        System.out.println("fianl" + age);
    }
}
