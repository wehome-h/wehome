package com.wehome.p5.exercise;

public class printRectangleTest {

    public static void main(String[] args) {
        // 1
        method1();

        // 2
        int area = method2();
        System.out.println("长为10宽为8的矩形面积为: " + area);

        // 3
        int m = 5;
        int n = 5;
        int area2 = method3(m, n);
        System.out.println("长为" + n + "宽为" + m + "的矩形面积为: " + area2);
    }

    /* 1: */
    public static void method1() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }

    /* 2: */
    public static int method2() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("★");
            }
            System.out.println();
        }

        return 8 * 10;
    }

    /* 3: */
    public static int method3(int m, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("★");
            }
            System.out.println();
        }

        return n * m;
    }

}
