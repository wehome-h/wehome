package com.wehome.p3;

/*
  编写程序:
  从键盘上输入 2023 年的"month"和"day", 要求通过程序输出输入的日期为2023年的第几天。
*/

import java.util.Scanner;

public class SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入2024年的month: ");
        int month = scanner.nextInt();

        System.out.println("请输入2024年的day: ");
        int day = scanner.nextInt();

        int sumDays = 0;

        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }

        System.out.println(month + "月" + day + "日是2024年的第" + sumDays + "天");

        scanner.close();
    }
}
