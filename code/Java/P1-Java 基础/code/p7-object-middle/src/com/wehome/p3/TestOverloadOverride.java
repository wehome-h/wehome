package com.wehome.p3;

public class TestOverloadOverride {

    public static void main(String[] args) {
        Son s = new Son();
        // 只有一个形式的 method 方法
        s.method(1);

        Daughter d = new Daughter();
        d.method(1);
        // 有两个形式的 method 方法
        d.method(1, 2);
    }
}

class Father {
    public void method(int i) {
        System.out.println("Father.method");
    }
}

class Son extends Father {
    // 重写
    public void method(int i) {
        System.out.println("Son.method");
    }
}

class Daughter extends Father {
    // 重载
    public void method(int i, int j) {
        System.out.println("Daughter.method");
    }
}