package com.wehome.p2;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // 打印数组的长度, 输出结果是5
        System.out.println("数组的长度: " + arr.length);

        // 遍历输出数组中元素
        System.out.println("数组的元素有: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
