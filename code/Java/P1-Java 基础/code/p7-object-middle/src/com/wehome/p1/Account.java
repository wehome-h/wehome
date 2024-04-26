package com.wehome.p1;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("成功存入: " + amt);
        } else {
            System.out.println("存入失败: " + amt);
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("成功取出: " + amt);
        } else {
            System.out.println("取款失败: balance = " + balance + ", amt = " + amt);
        }
    }

}