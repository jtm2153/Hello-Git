package com.jtm10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
   要求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
   思路：
*      1.定义学生类
*      2.创建Collection集合对象
*      3.创建学生类对象
*      4.把学生添加到集合
*      5.遍历集合（迭代器方式）
* */
public class StudentDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("艾斯",25);
        Student s2 = new Student("萨博",24);
        Student s3 = new Student("路飞",22);

       c.add(s1);
       c.add(s2);
       c.add(s2);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student ss = it.next();
            System.out.println(ss);
        }

    }
}
