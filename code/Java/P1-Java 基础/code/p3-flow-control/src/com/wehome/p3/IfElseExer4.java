package com.wehome.p3;

/**
 * USER wehome
 * DATE 2024/4/18 23:42
 */
/*
  小明参加期末 Java 考试, 通过考试成绩, 判断其 Java 等级, 成绩范围 [0, 100]
  90 - 100 优秀
  80 - 89 好
  70 - 79 良
  60 - 69 及格
  60 以下 不及格
 */

public class IfElseExer4 {
    public static void main(String[] args) {
        System.out.println("小明的期末 Java 成绩是: [0, 100]");

        int score = 89;

        if (score < 0 || score > 100) {
            System.out.println("你的成绩是错误的");
        } else {
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80) {
                System.out.println("好");
            } else if (score >= 70) {
                System.out.println("良");
            } else if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }
    }
}
