package com.wehome.p10;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("成功取出: " + amount);
        } else if (amount < 0) {
            System.out.println("取钱: 输入的金额有误!");
        } else {
            System.out.println("余额不足, 取款失败");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入: " + amount);
        } else {
            System.out.println("存钱: 输入的金额有误!");
        }
    }

    public String getInfo() {
        return "id is " + id + ", annualInterestRate is " + annualInterestRate * 100 + "%, balance is " + balance;
    }

}
