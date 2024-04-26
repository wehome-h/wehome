package com.wehome.p10;

public class CustomerTest {

    public static void main(String[] args) {
        Customer janeSmith = new Customer("Jane", "Smith");

        janeSmith.setAccount(new Account(1000, 2000, 0.0123));

        janeSmith.getAccount().deposit(100.0);
        janeSmith.getAccount().withdraw(960.0);

        janeSmith.printInfo();
    }

}
