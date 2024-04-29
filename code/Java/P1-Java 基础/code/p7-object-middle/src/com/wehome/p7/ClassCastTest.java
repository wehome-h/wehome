package com.wehome.p7;

public class ClassCastTest {

    public static void main(String[] args) {
        // 没有类型转换
        Dog dog = new Dog(); // dog的编译时类型和运行时类型都是Dog

        // 向上转型
        Pet pet = new Dog(); // pet的编译时类型是Pet, 运行时类型是Dog
        pet.setNickname("小白");
        pet.eat(); // 可以调用父类Pet有声明的方法eat(), 但是执行的是子类重写的eat方法体
        // pet.watchHouse(); 不能调用父类没有的方法watchHouse

        Dog d = (Dog) pet;
        System.out.println("d.nickname = " + d.getNickname());
        d.eat(); // 可以调用eat方法
        d.watchHouse(); // 可以调用子类扩展的方法watchHouse

        Cat c = (Cat) pet;
        // 编译通过, 因为从语法检查来说,
        // pet的编译时类型是Pet, Cat是Pet的子类, 所以向下转型语法正确
        // 这句代码运行报错ClassCastException, 因为pet变量的运行时类型是Dog,
        // Dog和Cat之间是没有继承关系的

    }

}
