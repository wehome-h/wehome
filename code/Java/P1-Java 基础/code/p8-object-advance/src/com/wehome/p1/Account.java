package com.wehome.p1;

public class Account {

    public static double rate;
    public static double minBalance;

    private int id;
    private String password;
    private double balance;

    private static int total;

    public Account() {
        total++;
        id = total;
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
