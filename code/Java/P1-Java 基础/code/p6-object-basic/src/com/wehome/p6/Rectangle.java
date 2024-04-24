package com.wehome.p6;

public class Rectangle {

    double length;
    double width;

    // 面积
    public double area() {
        return length * width;
    }

    // 周长
    public double perimeter() {
        return 2 * (length + width);
    }

    public String getInfo() {
        return "长: " + length + ", 宽" + width + ", 面积: " + area() +
                ", 周长: " + perimeter();
    }

}
