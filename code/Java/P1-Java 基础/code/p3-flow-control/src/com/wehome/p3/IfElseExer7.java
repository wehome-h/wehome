package com.wehome.p3;

/**
 * USER wehome
 * DATE 2024/4/18 23:48
 */
public class IfElseExer7 {
    public static void main(String[] args) {
        int waterTemperature = 85;

        if (waterTemperature > 95) {
            System.out.println("开水");
        } else if (waterTemperature > 70) {
            System.out.println("热水");
        } else if (waterTemperature > 40) {
            System.out.println("温水");
        } else {
            System.out.println("凉水");
        }
    }
}
