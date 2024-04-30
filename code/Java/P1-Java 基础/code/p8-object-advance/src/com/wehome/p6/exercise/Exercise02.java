package com.wehome.p6.exercise;

public class Exercise02 {

    public static void main(String[] ages) {
        Employee[] emps = new Employee[3];
        Employee d1 = new Developer("jack", 25);
        Employee d2 = new Developer("tom", 26);
        Employee m1 = new Manager("smith", 34);

        emps[0] = d1;
        emps[1] = d2;
        emps[2] = m1;

        double sum = 0;
        for (int i = 0; i < emps.length; i++) {
            sum += emps[i].calMoney(90);
        }

        System.out.println("需要付给软件公司的总金额: " + sum);
    }

}
