package com.wehome.p5.exercise;

// 测试类
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "wehome";
        p1.age = 20;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        System.out.println(p1.name + "原来" + p1.age + "岁, 增加两岁后是" + p1.addAge(2) + "岁");

        System.out.println();

        Person p2 = new Person();
        p2.name = "jerry";
        p2.age = 18;
        p2.sex = 0;

        p2.study();
        p2.showAge();
        System.out.println(p2.name + "原来" + p2.age + "岁, 增加两岁后是" + p2.addAge(2) + "岁");
    }

}
