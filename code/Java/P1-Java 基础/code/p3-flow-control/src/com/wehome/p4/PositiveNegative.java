package com.wehome.p4;

import java.util.Scanner;

/**
 * USER wehome
 * DATE 2024/4/21 13:53
 */
/*
  从键盘读入个数不确定的正数, 并判断读入的正数和负数的个数, 输入为0时结束程序
*/
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumber = 0; // 统计正数的个数
        int negativeNumber = 0; // 统计负数的个数

        for (;;) {
            System.out.print("请输入一个整数: （输入为 0 时结束程序）");
            int num = scanner.nextInt();
            if (num > 0) {
                positiveNumber++;
            } else if (num < 0) {
                negativeNumber++;
            } else {
                System.out.println("程序结束");
                break;
            }
        }

        System.out.println("正数的个数为: " + positiveNumber);
        System.out.println("负数的个数为: " + negativeNumber);
    }
}
