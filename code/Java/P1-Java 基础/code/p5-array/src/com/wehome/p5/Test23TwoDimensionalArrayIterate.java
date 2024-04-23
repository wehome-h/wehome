package com.wehome.p5;

public class Test23TwoDimensionalArrayIterate {
    public static void main(String[] args) {
        // 存储3个小组的学员的成绩, 分开存储, 使用二维数组
        int[][] scores = {
                {85, 96, 85, 75},
                {99, 96, 74, 72, 75},
                {52, 42, 56, 75}
        };

        System.out.println("一共有" + scores.length + "组成绩");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("第" + (i + 1) + "组有" + scores[i].length + "个学员, 成绩如下: ");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
