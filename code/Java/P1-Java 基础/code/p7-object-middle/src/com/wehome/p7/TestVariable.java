package com.wehome.p7;

public class TestVariable {

    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println("b.a = " + b.a); // 1
        System.out.println("((Sub) b).a = " + ((Sub) b).a); // 2

        Sub s = new Sub();
        System.out.println("s.a = " + s.a); // 2
        System.out.println("((Base) s).a = " + ((Base) s).a); // 1
    }

}