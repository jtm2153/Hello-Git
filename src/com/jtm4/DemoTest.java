package com.jtm4;

public class DemoTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("紫霞仙子");
        t.setAge(500);
        System.out.println(t.getName() + "," + t.getAge() + "岁");
        t.Teach();

        System.out.println("-------------");

        Student s = new Student();
        s.setName("至尊宝");
        s.setAge(500);
        System.out.println(s.getName() + "," + s.getAge() + "岁");
        s.Study();

        System.out.println("-------------");

        Teacher tt = new Teacher("仙子",1000);
        System.out.println(tt.getName() + "," + tt.getAge() + "岁");
        tt.Teach();

        System.out.println("-------------");

        Student ss = new Student("猴子",1000);
        System.out.println(ss.getName() + "," + ss.getAge() + "岁");
        ss.Study();
    }
}
