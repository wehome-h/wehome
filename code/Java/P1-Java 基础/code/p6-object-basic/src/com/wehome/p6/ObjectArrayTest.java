package com.wehome.p6;

public class ObjectArrayTest {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle();

            rectangles[i].length = (i + 1) * 10;
            rectangles[i].width = (2 * i + 1) * 5;

            System.out.println(rectangles[i].getInfo());
        }

    }

}
