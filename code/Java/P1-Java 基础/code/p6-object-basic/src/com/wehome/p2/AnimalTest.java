package com.wehome.p2;

// 声明测试类
public class AnimalTest {

    public static void main(String[] args) {
        Animal xb = new Animal();
        xb.legs = 4; // 访问属性

        System.out.println(xb.legs);

        xb.eat(); // 访问方法
        xb.move(); // 访问方法
    }

}
