package com.wehome.p4;

/*
  打印1-100之间所有奇数的和
*/
public class ForExer1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("奇数总和为: " + sum);
    }
}
