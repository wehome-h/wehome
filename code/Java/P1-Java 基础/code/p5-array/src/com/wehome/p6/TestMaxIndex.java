package com.wehome.p6;

/*
  找最值及其第一次出现的下标
*/
public class TestMaxIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("max = " + max);
        System.out.println("index = " + index);
    }
}
