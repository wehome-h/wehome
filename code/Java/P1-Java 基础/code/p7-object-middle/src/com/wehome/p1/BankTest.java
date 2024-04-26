package com.wehome.p1;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).setAccount(new Account(3000));

        double balance = bank.getCustomer(0).getAccount().getBalance();
        String firstName = bank.getCustomer(0).getFirstName();
        String lastName = bank.getCustomer(0).getLastName();

        System.out.println("name: " + firstName + " " + lastName + ", balance: " + balance);
    }

}
