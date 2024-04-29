package com.wehome.p8;

public class OrderTest {

    public static void main(String[] args) {
        Order order1 = new Order(100, "phone");
        Order order2 = new Order(100, "phone");

        System.out.println(order1 == order2); // false
        System.out.println(order1.equals(order2)); // true

    }

}
