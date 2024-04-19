package com.wehome.p4;

public class ZFTest {
    public static void main(String[] args) {
        int count = 0;
        int zf = 8848860;

        double paper = 0.1;

        while (paper < zf) {
            count++;
            paper *= 2;
        }

        System.out.println("需要折叠: " + count + "次");
        System.out.println("折纸的高度为" + paper / 1000 + "米, 超过了珠峰的高度");
    }
}