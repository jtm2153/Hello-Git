package com.jtm13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*若学生作键，其它作值，学生的成员变量值相同，应认为是同一个对象，前面添加的需要被覆盖
*需要在实体类重写hashCode()和equals()方法
* */

public class StudentDemo01 {
    public static void main(String[] args) {
        HashMap<String,Student> hs = new HashMap<>();

        Student s1 = new Student("ace",25);
        Student s2 = new Student("sabo",24);
        Student s3 = new Student("luffy",22);

        hs.put("1",s1);
        hs.put("2",s2);
        hs.put("3",s3);

        Set<Map.Entry<String,Student>> entrySet = hs.entrySet();
        for(Map.Entry<String,Student> en:entrySet){
            String k = en.getKey();
            Student v = en.getValue();
            System.out.println(k + ":" + v.getName() + "年龄" + v.getAge());
        }
        System.out.println("--------");

        Set<String> key = hs.keySet();
        for(String k:key){
            Student v = hs.get(k);
            System.out.println(k + ":" + v.getName() + "年龄" + v.getAge());
        }
    }
}
