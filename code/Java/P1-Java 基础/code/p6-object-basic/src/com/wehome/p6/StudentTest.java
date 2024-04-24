package com.wehome.p6;

public class StudentTest {

    public static void main(String[] args) {
        // 数组的创建
        Student[] students = new Student[20];

        // 通过循环结构给数组的属性赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = (i + 1);
            students[i].state = (int) (Math.random() * 6 + 1); // [1, 6]
            students[i].score = (int) (Math.random() * 101); // [0, 100]
        }

        // 问题一: 打印出3年级(state 值为 3)的学生信息
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {
                students[i].info();
            }
        }

        System.out.println("**********************");

        // 问题二: 使用冒泡排序按学生成绩排序, 并遍历所有学生信息

        // 排序前
        for (int i = 0; i < students.length; i++) {
            students[i].info();
        }

        System.out.println();

        // 排序
        for (int i = 0; i < students.length - 1; i++) {
            boolean isFlag = true;

            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                    isFlag = false;
                }
            }

            if (isFlag) {
                break;
            }

        }

        // 排序后
        for (int i = 0; i < students.length; i++) {
            students[i].info();
        }

    }

}
