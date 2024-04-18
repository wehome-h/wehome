package com.wehome.p3;

/**
 * USER wehome
 * DATE 2024/4/18 23:47
 */
/*
  编写程序, 声明 2 个 double 型变量并赋值。
  判断第一个数大于 10.0, 且第 2 个数小于 20.0, 打印两数之和。
  否则, 打印两数的乘积。
*/

public class IfElseExer6 {
    public static void main(String[] args) {
        double d1 = 21.2, d2 = 12.3;

        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两数之和为: " + (d1 + d2));
        } else {
            System.out.println("两数乘积为: " + (d1 * d2));
        }
    }
}