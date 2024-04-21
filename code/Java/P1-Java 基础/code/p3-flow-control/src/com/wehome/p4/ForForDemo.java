package com.wehome.p4;

/**
 * USER wehome
 * DATE 2024/4/21 14:17
 */
/*
  将一天中的时间打印到控制台
*/
public class ForForDemo {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.println(hour + "时" + min + "分");
            }
        }
    }
}
