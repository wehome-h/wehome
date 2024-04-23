package com.wehome.p6;

/*
  求数组元素的总乘积
*/
public class TestArrayElementMul {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};

        // 求总乘积
        long result = 1;

        for (int i = 0; i < arr.length; i++) {
            result *= arr[i];
        }

        System.out.println("result = " + result);
    }
}
