package com.wehome.p6;

public class TestArrayMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max = " + max);
    }
}
