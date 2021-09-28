package com.jtm2;

public class FengZhuang {
    private String name;
    private int age;

    public void setAge(int age){
        if(age < 0 || age > 120){
            System.out.println("您输入的年龄有误！");
        }else{
            //age = a;
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
}
