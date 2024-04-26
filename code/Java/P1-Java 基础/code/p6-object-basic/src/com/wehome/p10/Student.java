package com.wehome.p10;

public class Student {

    private String name;
    private int age;

    // 无参构造
    public Student() {
    }

    // 有参构造
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getInfo() {
        return "姓名: " + name + ", 年龄: " + age;
    }

}
