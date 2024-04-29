package com.wehome.p7;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        Dog dog = new Dog();
        dog.setNickname("小白");
        person.adopt(dog); // 实际是dog子类对象, 形参是父类Pet类型
        person.feed();

        Cat cat = new Cat();
        cat.setNickname("雪球");
        person.adopt(cat); // 实参是cat子类对象, 形参是父类Pet类型
        person.feed();

    }
}
