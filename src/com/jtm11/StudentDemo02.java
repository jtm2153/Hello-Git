package com.jtm11;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentDemo02 {
    public static void main(String[] args) {
        TreeSet<Student03> ts = new TreeSet<>(new Comparator<Student03>() {
            @Override
            public int compare(Student03 s1, Student03 s2) {
                int num = s1.getSum() - s2.getSum();
                int num2 = num == 0?s1.getNsme().compareTo(s2.getNsme()):num;
                return num2;
            }
        });

        Student03 s1 = new Student03("ace",25,90,94);
        Student03 s2 = new Student03("sabo",24,97,90);
        Student03 s3 = new Student03("luffy",22,91,92);
        Student03 s4 = new Student03("jtm",22,100,99);
        //姓名相同，总分不同
        Student03 s5 = new Student03("jtm",22,100,100);
        //总分相同，姓名不同
        Student03 s6 = new Student03("jtm2",22,100,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student03 s:ts){
            System.out.println(s);
        }
    }
}
