package com.wehome.p6;

public class TestArrayOrderSearch {
    public static void main(String[] args) {
        // 查找value第一次在数组中出现的index

        int[] arr = {4, 5, 6, 1, 9};
        int value = 1;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(value + "不存在");
        } else {
            System.out.println(value + "的下标是: " + index);
        }
    }
}
