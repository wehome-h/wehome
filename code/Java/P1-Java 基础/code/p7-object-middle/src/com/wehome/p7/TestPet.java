package com.wehome.p7;

public class TestPet {

    public static void main(String[] args) {
        // 多态引用
        Pet pet = new Dog();
        pet.setNickname("小白");

        // 多态的表现形式
        /*
          编译时看父类: 只能调用父类声明的方法, 不能调用子类扩展的方法;
          运行时, 看"子类", 如果子类重写了方法, 一定是执行子类重写的方法体;
        */
        pet.eat(); // 运行时执行子类Dog重写的方法
        // pet.watchHouse(); // 不能调用Dog子类扩展的方法

        pet = new Cat();
        pet.setNickname("雪球");
        pet.eat(); // 运行时执行子类Cat重写的方法
    }

}