package com.wehome.p2;

public class TestCat {

    public static void main(String[] args) {
        // 创建一个猫类对象
        Cat cat = new Cat();

        // 为该猫类对象的 name 属性进行赋值
        cat.name = "Tom";

        // 为该猫类的 age 属性进行赋值
        cat.age = 2;

        // 调用该猫继承来的 eat() 方法
        cat.eat();

        // 调用该猫的 catchMouse() 方法
        cat.catchMouse();
        cat.catchMouse();
        cat.catchMouse();
    }

}