package com.wehome.p5;

// smartphone: 智能手机
public class SmartPhone extends Phone {

    // 重写父类的来电显式功能的方法
    public void showNum() {
        // 来电显式姓名和图片功能
        System.out.println("显示来电姓名");
        System.out.println("显示头像");

        // 保留父类来电显示号码的功能
        super.showNum(); // 此处必须加 super. 否则就是无限递归, 那么就会栈内存溢出
    }

}
