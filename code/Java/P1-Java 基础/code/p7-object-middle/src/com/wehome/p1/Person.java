package com.wehome.p1;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println("姓名: " + name);
        this.speak();
    }

    public void speak() {
        System.out.println("年龄: " + this.age);
    }

}
