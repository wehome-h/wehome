package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 13:24
 */
/*
  体会do-while至少会执行一次循环体
*/
public class DoWhileTest2 {
    public static void main(String[] args) {
        // while循环:
        int num1 = 10;
        while (num1 > 10) {
            System.out.println("hello:while");
            num1--;
        }

        // do-while循环:
        int num2 = 10;
        do {
            System.out.println("hello:do-while");
            num2--;
        } while (num2 > 10);
    }
}
