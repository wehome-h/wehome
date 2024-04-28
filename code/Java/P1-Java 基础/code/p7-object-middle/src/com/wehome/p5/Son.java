package com.wehome.p5;

public class Son extends Father {

    int a = 20;

    public void test() {
        // 子类与父类的属性同名, 子类对象中就有两个 a
        System.out.println("子类的a: " + a); // 20 先从局部变量找, 没有再从本类成员变量找
        System.out.println("子类的a: " + this.a); // 20 先从本类成员变量找
        System.out.println("父类的a: " + super.a); // 10 直接从父类成员变量找

        // 子类与父类的属性不同名, 是同一个 b
        System.out.println("b = " + b); // 11 先从局部变量找, 没有再从本类成员变量找, 没有再从父类找
        System.out.println("b = " + this.b); // 11 先从本类成员变量找, 没有再从父类找
        System.out.println("b = " + super.b); // 11 直接从父类成员变量找
    }

    public void method(int a, int b) {
        // 子类与父类的属性同名, 子类对象中就有两个成员变量 a, 此时方法中还有一个局部变量 a
        System.out.println("局部变量的a: " + a); // 30 先从局部变量
        System.out.println("子类的a: " + this.a); // 20 先从本类成员变量找
        System.out.println("父类的a: " + super.a); // 10 直接从父类成员变量找

        System.out.println("b = " + b); // 13 先找局部变量
        System.out.println("b = " + this.b); // 11 先从本类成员变量找
        System.out.println("b = " + super.b); // 11 直接从父类成员变量找
    }

}
