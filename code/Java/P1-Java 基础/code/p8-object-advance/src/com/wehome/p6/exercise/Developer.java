package com.wehome.p6.exercise;

public class Developer extends Employee {

    private int workExperiences;

    public Developer(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println("work... 开发项目");
    }

    public double calMoney(int days) {
        if (days > 60) {
            return 60 * 500 + (days - 60) * 400;
        }
        return days * 500;
    }

}
