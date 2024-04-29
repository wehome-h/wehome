package com.wehome.p7;

public class TestInstanceof {

    public static void main(String[] args) {
        Pet[] pets = new Pet[2];
        pets[0] = new Dog(); // 多态引用
        pets[0].setNickname("小白");
        pets[1] = new Cat(); // 多态引用
        pets[1].setNickname("雪球");

        for (int i = 0; i < pets.length; i++) {
            pets[i].eat();

            if (pets[i] instanceof Dog) {
                Dog dog = (Dog) pets[i];
                dog.watchHouse();
            } else if (pets[i] instanceof Cat) {
                Cat cat = (Cat) pets[i];
                cat.catchMouse();
            }
        }
    }

}
