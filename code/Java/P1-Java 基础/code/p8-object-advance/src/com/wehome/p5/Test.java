package com.wehome.p5;

public final class Test {

    public static int totalNumber = 5;
    public final int ID;

    public Test() {
        ID = ++totalNumber; // 可在构造器中给final修饰的变量赋值
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.ID);
    }

}
