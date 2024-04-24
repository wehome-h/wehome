package com.wehome.p7;

public class MethodExer3 {

    public static void main(String[] args) {
        int max1 = max(2, 4);
        System.out.println("两个 int 值中最大值为: " + max1);

        double max2 = max(2.0, 4.0);
        System.out.println("两个 double 值中最大值为: " + max2);

        double max3 = max(2.0, 4.0, 3.0);
        System.out.println("三个 double 值中最大值为: " + max3);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b, double c) {
        return (a > b ? a : b) > c ? (a > b ? a : b) : c;
    }

}
