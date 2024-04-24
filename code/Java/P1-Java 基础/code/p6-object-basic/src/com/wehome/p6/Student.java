package com.wehome.p6;

/**
 * 定义类 Student, 包含三个属性:
 * 学号 number(int), 年级 state(int), 成绩 score(int)
 */

public class Student {

    int number; // 学号
    int state; // 年级
    int score; // 成绩

    public void info() {
        System.out.println("number : " + number + ", state : " + state + ", score : " + score);
    }

}
