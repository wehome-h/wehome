package com.wehome.p2;

/**
 * USER wehome
 * DATE 2024/4/18 22:52
 */
public class StatementTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // 对x、y的值进行修改
        x++;
        y = 2 * x + y;
        x = x * 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
