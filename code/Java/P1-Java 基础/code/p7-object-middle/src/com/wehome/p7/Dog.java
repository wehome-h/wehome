package com.wehome.p7;

public class Dog extends Pet {

    // 子类重写父类的方法
    @Override
    public void eat() {
        System.out.println("狗子" + getNickname() + "啃骨头");
    }

    // 子类扩展的方法
    public void watchHouse() {
        System.out.println("看家");
    }

}
