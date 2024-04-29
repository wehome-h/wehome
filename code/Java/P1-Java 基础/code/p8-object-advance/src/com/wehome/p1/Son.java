package com.wehome.p1;

public class Son extends Father {

    // @Override 尝试重写静态方法, 加上 @Override 编译报错,
    // 去掉Override不报错, 但是也不是重写
    public static void fun() {
        System.out.println("Son.fun");
    }

}
