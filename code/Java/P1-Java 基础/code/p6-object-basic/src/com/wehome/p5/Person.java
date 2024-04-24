package com.wehome.p5;

public class Person {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
    }

    public static void eat() {
        sleep();
        System.out.println("人: 吃饭");
    }

    public static void sleep() {
        System.out.println("人: 睡觉");
        doSport();
    }

    public static void doSport() {
        System.out.println("人: 运动");
    }

}
