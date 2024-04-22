package com.wehome.p7;

public class MathRandomTest {
    public static void main(String[] args) {
        double value = Math.random();
        System.out.println(value);

        //[1,6]
        int number = (int) (Math.random() * (6 - 1 + 1)) + 1;
        System.out.println(number);
    }
}