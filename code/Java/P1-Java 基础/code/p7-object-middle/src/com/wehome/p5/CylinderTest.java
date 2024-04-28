package com.wehome.p5;

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(2.0);
        cylinder.setLength(4.0);

        System.out.println("圆柱的表面积: " + cylinder.findArea() + ", 体积: " + cylinder.findVolume());

        Circle circle = new Circle();
        circle.setRadius(2.0);
        System.out.println("圆的面积: " + circle.findArea());
    }

}
