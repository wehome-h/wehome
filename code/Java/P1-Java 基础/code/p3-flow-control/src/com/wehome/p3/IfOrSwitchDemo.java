package com.wehome.p3;

import java.util.Scanner;

public class IfOrSwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入整数: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + "是正数");
        } else if (num < 0) {
            System.out.println(num + "是负数");
        } else {
            System.out.println(num + "为零");
        }

        input.close();
    }
}
