package com.wehome.p4;

public class WhileTest2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            // 迭代条件
            i++;
        }

        System.out.println("偶数的总和为: " + sum);
        System.out.println("偶数的个数为: " + count);
    }
}