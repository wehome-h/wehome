package com.wehome.p4;

import java.util.Scanner;

/**
 * USER wehome
 * DATE 2024/4/21 13:37
 */
/*
  随机生成一个100以内的数, 猜这个随机数是多少?
  从键盘输入数, 如果大了提示, 大了; 如果小了, 提示小了;
  如果对了, 就不再猜了, 并统计一共猜了多少次
*/
public class DoWhileExer {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);

        int count = 0; // 记录次数

        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("请输入100以内的正数: ");
            guess = scanner.nextInt();
            count++;
            if (guess > num)
                System.out.println("大了");
            else if (guess < num)
                System.out.println("小了");
        } while (guess != num);

        System.out.println("一共猜了: " + count + "次");

        scanner.close();
    }
}
