package com.wehome.p1;

public class Student {

    private String name;
    private int age;

    // 无参构造
    public Student() { // [!code error]
        // 调用本类有参构造器
        // this("", 18);
    }

    // 有参构造
    public Student(String name) { // [!code error]
        // 调用本类无参构造器
        this();
        this.name = name;
    }

    // 有参构造
    public Student(String name, int age) { // [!code error]
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "姓名: " + name + ", 年龄: " + age;
    }
}
