package com.wehome.p1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Father.method();
        Son.method(); // 继承静态方法

        Father f = new Son();
        f.method(); // 执行Father类中的method
    }
}
