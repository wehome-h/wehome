package com.wehome.p7;

public class Person {

    private Pet pet;

    public void adopt(Pet pet) { // 形参是父类类型, 实参是子类对象
        this.pet = pet;
    }

    public void feed() {
        pet.eat(); // pet实际引用对象类型不同, 执行的eat方法也不同
    }

}
