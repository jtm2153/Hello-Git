package com.jtm3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo2 {
    public static void main(String[] args) {
        ArrayList<Student2> arr = new ArrayList<Student2>();
        //用while来循环进入系统
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            int n = sc.nextInt();
            //if ...else判断选项（也可以用switch）
            if (n == 1) {
                Add(arr);
            } else if (n == 4) {
                Search(arr);
            }else if(n == 5){
                System.out.println("谢谢使用!");
                //关闭虚拟机--直接退出系统
                System.exit(0);
            }else if(n == 3){
                Del(arr);
            }else if(n == 2){
                Change(arr);
            }
        }
    }
    //添加学生信息
    public static void Add(ArrayList<Student2> arr){
        Scanner sc = new Scanner(System.in);
        int sid;
        //如果重复ID则while循环重新输入
        while (true) {
            System.out.print("请输入学生ID：");
            sid = sc.nextInt();
            boolean flag = Rep(arr,sid);
            //当返回true,则表示重复
            if(flag){
                System.out.println("ID已存在！请重新输入！");
        }else {
                //跳出while
                break;
            }}
        System.out.print("请输入学生姓名：");
        String name = sc.next();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.print("请输入学生地址：");
        String address = sc.next();
                //调用Set方法进行封装
        Student2 s = new Student2();
                s.setSid(sid);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                //添加到arr集合中
                arr.add(s);
        System.out.println("添加成功！");
        System.out.println("-----*********-**********-----");
        }

    //ID重复分情况,用boolean进行判断
    public static boolean Rep(ArrayList<Student2> arr,int sid){
        boolean flag = false;
        for(int i = 0;i < arr.size();i++){
            Student2 s = arr.get(i);
            //如果存在则返回true
            if(s.getSid() == sid){
                flag = true;
                break;
            }
        }
        return flag;
    }
    //查询所有学生信息
    public static void Search(ArrayList<Student2> arr){
        //判断系统中是否存在数据
        if(arr.size() == 0){
            System.out.println("不存任何学生信息，请录入信息！");
            System.out.println("-----*********-**********-----");
            //用return结束当前方法，避免再往下执行
            return;
        }
        System.out.println("ID\t姓名\t年龄\t居住地");
        //循环遍历去获取查找信息
        for(int i = 0;i < arr.size();i++){
            Student2 s = arr.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
        System.out.println("-----**********-*********-----");
    }
    //删除单个学生信息（是否需要判断删除的内容是否存在）
    public static void Del(ArrayList<Student2> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学生ID：");
        int a = sc.nextInt();
        if(arr.size() == 0){
            System.out.println("不存任何学生信息，请录入信息！");
            System.out.println("-----*********-**********-----");
            return;
        }
        for(int i = 0;i < arr.size();i++){
            Student2 s = arr.get(i);
            //判断是否存在需要删除信息的ID
            if(s.getSid() == a){
               arr.remove(i);
               break;
            }
        }
        System.out.println("删除成功！");
    }
    //修改学生信息（单个）
    public static void Change(ArrayList<Student2> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生ID：");
        int a = sc.nextInt();
        if(arr.size() == 0){
            System.out.println("不存任何学生信息，请录入信息！");
            System.out.println("-----*********-**********-----");
            return;
        }
        for(int i = 0;i < arr.size();i++){
            Student2 s = arr.get(i);
            if(a == s.getSid()){
                System.out.println("请输入新的姓名：");
                String s1 = sc.next();
                System.out.println("请输入新的年龄：");
                int s2 = sc.nextInt();
                System.out.println("请输入新的地址：");
                String s3 = sc.next();
                //再次封装
                s.setName(s1);
                s.setAge(s2);
                s.setAddress(s3);
                //用set方法修改arr
                arr.set(i,s);
                break;
            }
        }
        System.out.println("修改成功！");
    }
}
