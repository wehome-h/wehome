package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 14:08
 */
/*
  打印5行直角三角形

  *
  **
  ***
  ****
  *****
*/
public class ForForTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
