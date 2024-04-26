package com.wehome.p10;

public class TriAngle {

    private int base;
    private int height;

    public TriAngle() {
    }

    public TriAngle(int b, int h) {
        base = b;
        height = h;
    }

    public void setBase(int b) {
        base = b;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public double getTriAngleArea() {
        return base * height / 2.0;
    }

}
