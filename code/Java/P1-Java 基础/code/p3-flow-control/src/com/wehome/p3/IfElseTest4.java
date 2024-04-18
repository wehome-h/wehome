package com.wehome.p3;

/**
 * USER wehome
 * DATE 2024/4/18 23:32
 */
public class IfElseTest4 {
    public static void main(String[] args) {
        int num1 = 23, num2 = 32, num3 = 12;

        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + " - " + num1 + " - " + num3);
            } else if (num3 >= num2) {
                System.out.println(num2 + " - " + num3 + " - " + num1);
            } else {
                System.out.println(num3 + " - " + num2 + " - " + num1);
            }
        } else {
            if (num1 >= num3) {
                System.out.println(num3 + " - " + num1 + " - " + num2);
            } else if (num3 >= num2) {
                System.out.println(num1 + " - " + num2 + " - " + num3);
            } else {
                System.out.println(num1 + " - " + num3 + " - " + num2);
            }
        }
    }
}
