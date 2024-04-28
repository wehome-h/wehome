package com.wehome.p2;

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(2);
        cylinder.setLength(2);

        System.out.println("圆柱的体积: " + cylinder.findVolume());
    }

}