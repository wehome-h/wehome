package com.wehome.p5.exercise;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.year = 1999;
        myDate.month = 2;
        myDate.day = 29;
        myDate.showMessage();

        System.out.println();

        MyDate youDate = new MyDate();
        youDate.year = 2000;
        youDate.month = 8;
        youDate.day = 12;
        youDate.showMessage();
    }

}
