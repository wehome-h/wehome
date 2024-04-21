package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 14:07
 */
/*
  打印5行6个*

  ******
  ******
  ******
  ******
  ******
*/
public class ForForTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}