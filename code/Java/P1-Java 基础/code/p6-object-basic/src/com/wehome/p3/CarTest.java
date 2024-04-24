package com.wehome.p3;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car(); // 建立对象 c1
        Car c2 = new Car(); // 建立对象 c2

        c1.color = "blue"; // 对对象的属性进行修改
        c1.show(); // 使用对象的方法
        c2.show();
    }

}

