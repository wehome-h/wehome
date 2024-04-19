package com.wehome.p4;

import java.util.Scanner;

public class Test05While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0; // 记录正数的个数
        int negative = 0; // 记录负数的个数
        int num = 1; // 初始化为特殊值, 使得第一次循环条件成立

        while (num != 0) {
            System.out.println("请输入整数（0表示结束）");

            num = scanner.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("正数个数: " + positive);
        System.out.println("负数个数: " + negative);

        scanner.close();
    }
}
