package com.jtm10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("ace",25);
        Student s2 = new Student("sabo",24);
        Student s3 = new Student("luffy",22);
        //将学生信息添加到list集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //创建迭代器对象
        ListIterator<Student> itlist = list.listIterator();
        while (itlist.hasNext()){
            Student s = itlist.next();
            System.out.println(s);
        }
        //以上是迭代器遍历
        System.out.println("--------");
        //以下是普通for循环遍历
        for(int i = 0;i < list.size();i++){
            Student ss = list.get(i);
            System.out.println(ss);
        }
        System.out.println("--------");
        //以下是增强for循环遍历
        for(Student sss:list){
            System.out.println(sss);
        }
    }
}
