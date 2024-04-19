package com.wehome.p3;

import java.util.Scanner;

public class SwitchCaseExer5 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        int c = (int) (Math.random() * 6 + 1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("请押宝(豹子、大、小: )");
        String ya = scanner.next();

        boolean result = false;

        switch (ya) {
            case "豹子":
                result = a == b && b == c;
                break;
            case "大":
                result = a + b + c > 9;
                break;
            case "小":
                result = a + b + c <= 9;
                break;
            default:
                System.out.println("输入有误");
                break;
        }

        System.out.println("a, b, c分别是: " + a + ", " + b + ", " + c);

        System.out.println(result ? "猜中了" : "猜错了");

        scanner.close();
    }
}
