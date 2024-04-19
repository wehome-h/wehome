package com.wehome.p4;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 获取一个随机数
        int random = (int) ((Math.random() * 100) + 1);

        int count = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数（1-100）: ");
        int guess = scanner.nextInt();

        while (guess != random) {
            if (guess > random) {
                System.out.println("猜大了");
            } else if (guess < random) {
                System.out.println("猜小了");
            }

            System.out.println("请输入一个整数（1-100）: ");
            guess = scanner.nextInt();

            count++;
        }

        System.out.println("猜中了！");
        System.out.println("一共猜了" + count + "次");
    }
}