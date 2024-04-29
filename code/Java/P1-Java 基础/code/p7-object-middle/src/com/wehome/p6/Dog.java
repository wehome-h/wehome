package com.wehome.p6;

public class Dog extends Animal {

    public static void main(String[] args) {
        new Dog();

        // Creature无参数的构造器
        // Animal带一个参数的构造器, 该动物的name为汪汪队阿奇
        // Aniaml带两个参数的构造器, 其age为3
        // Dog无参数的构造器
    }

    public Dog() {
        super("汪汪队阿奇", 3);
        System.out.println("Dog无参数的构造器");
    }

}