package com.wehome.p2;

public class Person {

    String name;

    char gender;

    Dog dog;

    // 喂宠物
    public void feed() {
        dog.eat();
    }

}