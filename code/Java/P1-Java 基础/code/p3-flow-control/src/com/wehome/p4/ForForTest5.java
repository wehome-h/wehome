package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 14:16
 */
public class ForForTest5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
