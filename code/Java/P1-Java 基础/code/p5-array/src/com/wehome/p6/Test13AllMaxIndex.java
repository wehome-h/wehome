package com.wehome.p6;

/*
  找最值及其所有最值的下标
*/
public class Test13AllMaxIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9, 9, 3};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("最大值是: " + max);

        System.out.println("最大值的下标有: ");

        // 遍历数组, 看哪些元素和最大值是一样的
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(i + "\t");
            }
        }
    }
}
