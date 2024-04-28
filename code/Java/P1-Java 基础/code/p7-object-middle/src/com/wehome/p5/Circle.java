package com.wehome.p5;

public class Circle {

    private double radius;

    Circle() {
        radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
