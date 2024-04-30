package com.wehome.p4;

public class Zi extends Fu {
    private static int k = getNum("(6)k");
    private int h = getNum("(7)h");

    static {
        print("(8)子类静态代码块");
    }

    {
        print("(9)子类非静态代码块, 又称为构造代码块");
    }

    Zi() {
        print("(10)子类构造器");
    }

    public static void print(String str) {
        System.out.println(str + "->" + k);
    }

    public static int getNum(String str) {
        print(str);
        return ++k;
    }
}
