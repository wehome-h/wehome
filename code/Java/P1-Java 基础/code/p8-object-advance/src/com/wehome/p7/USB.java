package com.wehome.p7;

public interface USB {

    // 静态常量
    long MAX_SPEED = 500 * 1024 * 1024; // 500MB/s

    // 抽象方法
    void in();

    void out();

    // 默认方法
    default void start() {
        System.out.println("开始");
    }

    default void stop() {
        System.out.println("结束");
    }

    // 静态方法
    static void show() {
        System.out.println("USB 3.0可以同步全速地进行读写操作");
    }

}
