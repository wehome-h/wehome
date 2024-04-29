package com.wehome.p4;

public class Chinese {

    private static String country;
    private String name;

    {
        System.out.println("非静态代码块, country = " + country);
    }

    static {
        country = "中国";
        System.out.println("静态代码块");
    }

    public Chinese(String name) {
        this.name = name;
    }

}
