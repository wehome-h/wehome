package com.wehome.p7;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 6};

        System.out.println("排序前: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后: " + Arrays.toString(arr));
    }
}
