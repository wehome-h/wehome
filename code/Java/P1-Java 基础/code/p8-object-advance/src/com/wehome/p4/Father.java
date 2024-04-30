package com.wehome.p4;

public class Father {

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public Father() {
        System.out.println("3");
    }

}