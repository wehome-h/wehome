package com.wehome.p9.exercise;

public class Person {

    private int age;

    public void setAge(int i) {
        if (i >= 0 && i <= 130) {
            age = i;
        } else {
            System.out.println("请输入(0~130)之间的合法年龄");
        }
    }

    public int getAge() {
        return age;
    }

}
