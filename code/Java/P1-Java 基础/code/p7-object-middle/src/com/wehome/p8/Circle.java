package com.wehome.p8;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
