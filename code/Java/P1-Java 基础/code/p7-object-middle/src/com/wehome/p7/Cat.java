package com.wehome.p7;

public class Cat extends Pet {

    // 子类重写父类的方法
    @Override
    public void eat() {
        System.out.println("猫咪" + getNickname() + "吃鱼仔");
    }

    // 子类扩展的方法
    public void catchMouse() {
        System.out.println("抓老鼠");
    }

}
