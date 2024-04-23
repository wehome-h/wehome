package com.wehome.p6;

public class Test13AllMaxIndex2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9, 9, 3};

        int max = arr[0];
        String index = "0";

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + "";
            } else if (arr[i] == max) {
                index += ", " + i;
            }
        }

        System.out.println("最大值是" + max);
        System.out.println("最大值的下标是[" + index + "]");
    }
}
