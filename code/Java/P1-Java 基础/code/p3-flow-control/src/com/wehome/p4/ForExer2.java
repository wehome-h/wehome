package com.wehome.p4;

/* 打印1-100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）*/
public class ForExer2 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("1-100之间所有是7的倍数的整数的和为: " + sum);
        System.out.println("1-100之间所有是7的倍数的整数的个数为: " + count);
    }
}
