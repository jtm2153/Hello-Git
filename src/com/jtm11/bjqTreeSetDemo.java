package com.jtm11;

import java.util.Comparator;
import java.util.TreeSet;

public class bjqTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student02> ts = new TreeSet<Student02>(new Comparator<Student02>() {
            @Override
            public int compare(Student02 s1, Student02 s2) {
                //s1在前为升序，s1在后为降序
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        //创建Student对象
        Student02 s1 = new Student02("ace",25);
        Student02 s2 = new Student02("sabo",24);
        Student02 s3 = new Student02("luffy",22);

        Student02 s4 = new Student02("jtm",22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student02 s:ts){
            System.out.println(s);
        }
    }
}
