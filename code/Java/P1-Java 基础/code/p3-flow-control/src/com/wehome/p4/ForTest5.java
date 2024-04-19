package com.wehome.p4;

/*
输入两个正整数 m 和 n, 求其最大公约数和最小公倍数。
比如: 12和20的最大公约数是4, 最小公倍数是60
*/
public class ForTest5 {
    public static void main(String[] args) {
        // 需求1: 最大公约数
        int m = 12, n = 20;

        // 取出两个数中的较小值
        int min = (m < n) ? m : n;

        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数是: " + i);
                break; // 跳出当前循环结构
            }
        }

        // 需求2: 最小公倍数
        // 取出两个数中的较大值
        int max = (m > n) ? m : n;

        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数是: " + i);
                break;
            }
        }
    }
}
