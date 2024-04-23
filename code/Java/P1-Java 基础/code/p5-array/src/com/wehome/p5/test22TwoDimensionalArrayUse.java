package com.wehome.p5;

public class test22TwoDimensionalArrayUse {
    public static void main(String[] args) {
        // 存储3个小组的学员的成绩, 分开存储, 使用二维数组

        /*
          int[][] scores1;
          int scores2[][];
          int[] scores3[];
        */

        int[][] scores = {
                {85, 96, 85, 75},
                {99, 96, 74, 72, 75},
                {52, 42, 56, 75}
        };

        System.out.println(scores); // [[I@15db9742
        System.out.println("一共有" + scores.length + "组成绩");

        // [[: 代表二维数组, I代表元素类型是int

        System.out.println(scores[0]); // [I@6d06d69c

        // [: 代表一维数组, I代表元素类型是int

        System.out.println(scores[1]); // [I@7852e922

        System.out.println(scores[2]); // [I@4e25154f

        // System.out.println(scores[3]); // ArrayIndexOutOfBoundsException: 3

        System.out.println("第1组有" + scores[0].length + "个学员");
        System.out.println("第2组有" + scores[1].length + "个学员");
        System.out.println("第3组有" + scores[2].length + "个学员");

        System.out.println("第1组的每一个学员成绩如下: ");
        // 第一行的元素
        System.out.println(scores[0][0]); // 85
        System.out.println(scores[0][1]); // 96
        System.out.println(scores[0][2]); // 85
        System.out.println(scores[0][3]); // 75

        // System.out.println(scores[0][4]); // java.lang.ArrayIndexOutOfBoundsException: 4
    }
}
