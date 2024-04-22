package com.wehome.p5;

public class BreakContinueTest2 {
    public static void main(String[] args) {
        l:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    // break l;
                    continue l;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}