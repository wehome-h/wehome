package com.wehome.p3;

/*
  编写程序: 从键盘上读入一个学生成绩, 存放在变量 score 中,
  根据 score 的值输出其对应的成绩等级:
  score >= 90         等级: A
  70 <= score < 90    等级: B
  60 <= score < 70    等级: C
  score < 60          等级: D
*/

import java.util.Scanner;

// 方式一: 使用 if-else
// 方式二: 使用 switch-case:    score / 10 : 0 - 10
public class SwitchCaseExer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生成绩: ");
        int score = scanner.nextInt();

        char grade;

        // 方式一:
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // 方式二:
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }

        System.out.println("学生成绩为: " + score + ", 对应的等级为: " + grade);

        scanner.close();
    }
}