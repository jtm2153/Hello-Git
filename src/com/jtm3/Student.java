package com.jtm3;

public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age < 0 || age > 120){
            System.out.println("输入的年龄有误！");
        }else{
            this.age = age;
        }

    }
    public int getAge(){
        return age;
    }

    public Student(){ }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
