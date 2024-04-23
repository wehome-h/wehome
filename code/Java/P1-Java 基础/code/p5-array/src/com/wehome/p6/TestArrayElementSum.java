package com.wehome.p6;

/*
  数组统计: 求总和、均值
*/
public class TestArrayElementSum {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        // 求总和、均值
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("sum = " + sum); // 25
        System.out.println("avg = " + avg); // 5.0
    }
}
