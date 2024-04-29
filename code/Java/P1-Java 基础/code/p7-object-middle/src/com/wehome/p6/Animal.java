package com.wehome.p6;

public class Animal extends Creature {

    public Animal(String name) {
        System.out.println("Animal带一个参数的构造器, 该动物的name为" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Aniaml带两个参数的构造器, 其age为" + age);
    }

}