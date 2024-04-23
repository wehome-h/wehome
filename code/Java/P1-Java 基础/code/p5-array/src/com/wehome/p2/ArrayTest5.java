package com.wehome.p2;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("arr数组的长度: " + arr.length);

        System.out.print("存储数据到arr数组之前: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.println("]");

        // 初始化
        /*
          arr[0] = 2;
          arr[1] = 4;
          arr[2] = 6;
          arr[3] = 8;
          arr[4] = 10;
        */

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * (i + 1);
        }

        System.out.print("存储数据到arr数组之后: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.println("]");
    }
}
