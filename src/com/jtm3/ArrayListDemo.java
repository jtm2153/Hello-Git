package com.jtm3;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("jtm");
        array.add("00830700032");
        //插入元素
        array.add(1,"man");
        //插入位置不能超出元素个数
        //array.add(4,"sdfa");前面只有0,1,2；3个元素，只能在3个元素里插入或在第4个插入，不能在第5个插入（下标4即第五个元素，不能隔空插入）

       /*删除
        array.remove(0);返回元素
        array.remove("jtm");返回布尔值
        修改
        array.set(0,"jtm1");返回被修改元素
        查找
        array.get(0);返回索引元素
        元素个数
        array.size();返回集合中元素个数
        */

        System.out.println(array);

    }
}
