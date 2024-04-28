package com.wehome.p3;

public class TestOverload {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

}
