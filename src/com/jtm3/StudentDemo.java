package com.jtm3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();

        Student s = new Student("路飞",1111);
        Student s2 = new Student("艾斯",25);
        Student s3 = new Student("萨博",24);

        arr.add(s);
        arr.add(s2);
        arr.add(s3);

        for(int i = 0;i < arr.size();i++) {
            Student ss = arr.get(i);
            System.out.println(ss.getName() + "," + ss.getAge());
        }
        ArrayList<Student> arr2 = new ArrayList<Student>();
       for(int j = 0;j < 3;j++){
           Bianli(arr2);
       }
       for(int z = 0;z < arr2.size();z++){
           Student ss = arr2.get(z);
           System.out.println(ss.getName() + ss.getAge());
       }

        }
        public static void Bianli(ArrayList<Student> students){

            Scanner sc = new Scanner(System.in);
            Student stu = new Student();
            System.out.println("请输入学生的姓名：");
            String stu1 = sc.next();
            System.out.println("请输入学生的年龄：");
            int stu2 = sc.nextInt();
            stu.setName(stu1);
            stu.setAge(stu2);
            students.add(stu);

        }
    }

