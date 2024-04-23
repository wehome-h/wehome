package com.wehome.p6;

/*
  求数组元素中偶数的个数
*/
public class TestArrayElementEvenCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("evenCount = " + evenCount);
    }
}
