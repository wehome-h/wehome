package com.wehome.p5;

public class Cylinder extends Circle {

    private double length;

    Cylinder() {
        length = 1;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    @Override
    public double findArea() {
        return 2 * super.findArea() + 2 * Math.PI * super.getRadius() * length;
    }

}
