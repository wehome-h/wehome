package com.wehome.p2;

/**
 * 定义猫类 Cat 继承动物类 Animal
 */

public class Cat extends Animal {

    // 记录每只猫抓的老鼠数量
    int count;

    // 定义一个猫抓老鼠的方法 catchMouse
    public void catchMouse() {
        count++;
        System.out.println("抓老鼠, 已经抓了" + count + "只老鼠");
    }

}