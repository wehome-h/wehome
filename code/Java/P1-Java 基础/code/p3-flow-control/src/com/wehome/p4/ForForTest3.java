package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 14:10
 */
/*
  打印5行倒直角三角形

  *****
  ****
  ***
  **
  *
*/
public class ForForTest3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}