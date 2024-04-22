package com.wehome.p5;

public class PrimeNumberTest2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;
        label:
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("执行此程序花费的毫秒数为: " + (end - start));
    }
}