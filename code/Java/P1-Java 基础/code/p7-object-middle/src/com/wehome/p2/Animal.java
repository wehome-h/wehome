package com.wehome.p2;

/**
 * 定义动物类 Animal, 作为父类
 */

public class Animal {

    // 定义 name 属性
    String name;

    // 定义 age 属性
    int age;

    // 定义动物的吃东西方法
    public void eat() {
        System.out.println(age + "岁的" + name + "在吃东西");
    }

}
