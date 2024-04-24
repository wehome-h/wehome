package com.wehome.p2;

public class Game {

    public static void main(String[] args) {
        Person p = new Person();

        // 通过 Person 对象调用属性
        p.name = "wehome";
        p.gender = '男';
        p.dog = new Dog(); // 给 Person 对象的 dog 属性赋值

        // 给 Person 对象的 dog 属性的 type、nickName 属性赋值
        p.dog.type = "柯基犬";
        p.dog.nickName = "小白";

        // 通过 Person 对象调用方法
        p.feed();
    }

}
