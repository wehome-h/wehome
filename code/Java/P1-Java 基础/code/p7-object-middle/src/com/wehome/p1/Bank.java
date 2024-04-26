package com.wehome.p1;

public class Bank {

    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
    }

    public void addCustomer(String f, String l) {
        customers = new Customer[++numberOfCustomer];
        Customer customer = new Customer(f, l);
        customers[customers.length - 1] = customer;
    }

    public int getNumOfCustomers() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (customers.length > 0 && index >= 0 && index < customers.length) {
            return customers[index];
        } else {
            System.out.println("customers长度为: " + customers.length);
            return null;
        }
    }

}
