package com.wehome.p6.exercise;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("画一个半径为" + radius + "的圆形");
    }

}
