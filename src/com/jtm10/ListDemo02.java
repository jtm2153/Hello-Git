package com.jtm10;

import java.util.*;

/*
    要求：
         创建一个集合list
         添加三个元素
         遍历集合，得到每一个元素，看看有没有指定元素，有就添加另一个元素
*/
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ace");
        list.add("sabo");
        list.add("luffy");

        //会产生并发修改异常ConcurrentModificationException
//        Iterator<String> it = c.iterator();
//        while (it.hasNext()){
        //String s = it.next()
//            if(s.equals("ace")){
//                c.add("namei");
//            }
//        }
//        System.out.println(c);

        //有判断语句应该用for循环
       /* for(int i = 0;i <  list.size();i++){
            String s = list.get(i);
            if(s.equals("ace")){
                list.add("namei");
            }
        }
        System.out.println(list);*/
       //获取列表迭代器
        ListIterator<String> itlist = list.listIterator();
        //同归哦列表迭代器添加、判断就不会出现并发修改异常
        while (itlist.hasNext()){
            String s = itlist.next();
            if(s.equals("ace")){
                itlist.add("suolong");
            }
        }
        System.out.println(list);
    }
}
