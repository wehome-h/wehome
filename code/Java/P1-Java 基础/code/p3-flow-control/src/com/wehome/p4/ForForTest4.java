package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 14:13
 */
/*
  打印菱形形状的图案

          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/
public class ForForTest4 {
    public static void main(String[] args) {
        // 上半部分
        for (int i = 1; i <= 5; i++) {
            // 打印空格
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 下半部分
        for (int i = 1; i <= 4; i++) {
            // 打印空格
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = 1; k <= 9 - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}