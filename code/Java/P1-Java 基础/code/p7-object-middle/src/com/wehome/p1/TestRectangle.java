package com.wehome.p1;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("r1对象: " + r1.getInfo());
        System.out.println("r2对象: " + r2.getInfo());

        r1.length = 10;
        r1.width = 2;
        System.out.println("r1对象: " + r1.getInfo());
        System.out.println("r2对象: " + r2.getInfo());

        r1.print('#');
        System.out.println("---------------------");
        r1.print('&');

        System.out.println("---------------------");
        r2.print('#');
        System.out.println("---------------------");
        r2.print('%');
    }

}
