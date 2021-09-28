package com.jtm12;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        //把类定义成泛型类，调用时就可以随意变化类型
        Deneric<String> d1 = new Deneric<>();
        d1.setT("jtm");
        System.out.println(d1.getT());

        Deneric<Integer> d2 = new Deneric<>();
        d2.setT(22);
        System.out.println(d2.getT());
        System.out.println("--------");

        //泛型方法：调用时直接按给的参数类型赋值
        Generic g = new Generic();
        g.show("jtm");
        g.show(22);

        //类型通配符
        List<?>  list1 = new ArrayList<Object>();
        List<?>  list2 = new ArrayList<Number>();
        List<?>  list3 = new ArrayList<Integer>();

        //最高父类为Number，不能使用Object类
        //List<? extends Number>  list4 = new ArrayList<Object>();
        List<? extends Number>  list5 = new ArrayList<Number>();
        List<? extends Number>  list6 = new ArrayList<Integer>();

        //最低子类为Number，不能使用Integer类
        List<? super Number>  list7 = new ArrayList<Object>();
        List<? super Number>  list8 = new ArrayList<Number>();
       // List<? super Number>  list9 = new ArrayList<Integer>();
    }
}
