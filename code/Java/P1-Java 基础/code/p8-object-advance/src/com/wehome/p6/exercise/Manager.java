package com.wehome.p6.exercise;

public class Manager extends Employee {

    private int manageExperiences;

    public Manager(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println("work... 项目管理");
    }

    public double calMoney(int days) {
        if (days > 60) {
            return 60 * 800 + (days - 60) * 700;
        }
        return days * 800;
    }

}
