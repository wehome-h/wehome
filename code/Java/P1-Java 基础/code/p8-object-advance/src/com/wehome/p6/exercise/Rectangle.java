package com.wehome.p6.exercise;

public class Rectangle extends Shape {

    private double length;
    private double weight;

    public Rectangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void draw() {
        System.out.println("画一个长为" + length + ", 宽为" + weight + "的矩形");
    }

}
