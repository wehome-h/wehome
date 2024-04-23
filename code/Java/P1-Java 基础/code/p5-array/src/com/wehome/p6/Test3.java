package com.wehome.p6;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 43, 65, 3, -8, 64, 2};

        /*
          for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / arr[0];
          }
        */

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }

        // 遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}