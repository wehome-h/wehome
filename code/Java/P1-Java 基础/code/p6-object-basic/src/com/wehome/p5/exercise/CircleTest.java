package com.wehome.p5.exercise;

public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2;
        double area1 = c1.getCircleArea();
        System.out.println("半径为" + c1.radius + "圆的面积为 = " + area1);

        Circle c2 = new Circle();
        c2.radius = 4;
        double area2 = c2.getCircleArea();
        System.out.println("半径为" + c2.radius + "圆的面积为 = " + area2);
    }

}
