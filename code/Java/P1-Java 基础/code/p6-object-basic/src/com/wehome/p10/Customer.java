package com.wehome.p10;

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account a) {
        account = a;
    }

    public void printInfo() {
        System.out.println("Customer [" + firstName + ", " + lastName + "] has a account : id is " +
                account.getInfo());
    }

}