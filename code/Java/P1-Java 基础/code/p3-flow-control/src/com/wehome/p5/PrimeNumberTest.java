package com.wehome.p5;

public class PrimeNumberTest {
    public static void main(String[] args) {
        // 记录当前时间距离1970-1-1 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        int count = 0; // 记录质数的个数

        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true; // 用于标识i是否被除尽过
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) { // 表明i有约数
                    isFlag = false;
                }
            }

            // 判断i是否是质数
            if (isFlag) {
                count++;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("执行此程序花费的毫秒数为: " + (end - start));
    }
}