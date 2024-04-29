package com.wehome.p1;

public class Chinese {

    // 实例变量
    public String name;
    public int age;

    // 类变量
    public static String nation; // 国籍

    public Chinese() {
    }

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
