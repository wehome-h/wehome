package com.wehome.p4;

public class Son extends Father {

    static {
        System.out.println("4");
    }

    {
        System.out.println("5");
    }

    public Son() {
        System.out.println("6");
    }

    public static void main(String[] args) {
        System.out.println("7");

        System.out.println("******");
        new Son();

        System.out.println("******");
        new Son();

        System.out.println("******");
        new Father();
    }

}
