package com.wehome.p1;

public class StaticTest {

    public static void main(String[] args) {
        Chinese c1 = new Chinese("张飞", 20);
        c1.nation = "中国";

        Chinese c2 = new Chinese("关羽", 23);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(Chinese.nation);
    }

}
