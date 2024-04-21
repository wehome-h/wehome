package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 13:22
 */
/*
遍历 1-100 的偶数, 并计算所有偶数的和、偶数的个数（累加的思想）
*/
public class DoWhileTest1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        int count = 0;

        do {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
            num++;
        } while (num <= 100);

        System.out.println("偶数的总和为: " + sum);
        System.out.println("偶数的个数为: " + count);
    }
}
