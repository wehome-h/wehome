package com.wehome.p3;

/**
 * USER wehome
 * DATE 2024/4/18 23:39
 */
/*
  定义两个整数, 分别为 small 和 big, 如果第一个整数 small 大于第二个整数 big,
  就交换。输出显示 small 和 big 变量的值。
*/

public class IfElseExer3 {
    public static void main(String[] args) {
        int small = 10;
        int big = 9;

        if (small > big) {
            System.out.println("交换前: small = " + small + ", big = " + big);

            int temp = small;
            small = big;
            big = temp;
        }
        System.out.println("small = " + small + ", big = " + big);
    }
}
