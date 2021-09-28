package com.jtm11;

public class Student03 {
    private String nsme;
    private int age;
    private int math;
    private int chinese;

    public Student03() {
    }

    public Student03(String nsme, int age, int math, int chinese) {
        this.nsme = nsme;
        this.age = age;
        this.math = math;
        this.chinese = chinese;
    }

    public String getNsme() {
        return nsme;
    }

    public void setNsme(String nsme) {
        this.nsme = nsme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return "姓名：" + nsme + ",年龄：" + age + ",数学：" + math + ",语文：" + chinese + ",总分：" + getSum();
    }
    public int getSum(){
        return this.chinese + this.math;
    }
}
