package com.wehome.p4;

public class ForTest2 {
    public static void main(String[] args) {
        int num = 1;
        for (System.out.print("a"); num < 3; System.out.print("c"), num++) {
            System.out.println("b");
        }
    }
}
