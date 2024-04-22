package com.wehome.p6;

import java.util.Scanner;

/*
  我家的狗 5 岁了, 5 岁的狗相当于人类多大呢? 其实, 狗的前两年每一年相当于人类的 10.5 岁,
  之后每增加一年就增加四岁。那么 5 岁的狗相当于人类多少年龄呢?
  应该是: 10.5 + 10.5 + 4 + 4 + 4 = 33 岁

  编写一个程序, 获取用户输入的狗的年龄, 通过程序显示其相当于人类的年龄。
  如果用户输入负数, 请显示一个提示信息。
*/
public class ScannerExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入狗狗的年龄: ");
        int dogAge = scanner.nextInt();

        if (dogAge < 0) {
            System.out.println("你输入的狗狗的年龄不合法");
        } else if (dogAge <= 2) {
            System.out.println("相当于人的年龄: " + (dogAge * 10.5));
        } else {
            System.out.println("相当于人的年龄: " + (2 * 10.5 + (dogAge - 2) * 4));
        }

        scanner.close();
    }
}
