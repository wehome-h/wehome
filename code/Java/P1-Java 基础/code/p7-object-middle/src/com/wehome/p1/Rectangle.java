package com.wehome.p1;

public class Rectangle {

    int length;
    int width;

    public int area() {
        return this.length * this.width;
    }

    public int perimeter() {
        return 2 * (this.length + this.width);
    }

    public void print(char sign) {
        for (int i = 1; i <= this.width; i++) {
            for (int j = 1; j <= this.length; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public String getInfo() {
        return "长: " + this.length + ", 宽: " + this.width + ", 面积: " +
                this.area() + ", 周长: " + this.perimeter();
    }

}
