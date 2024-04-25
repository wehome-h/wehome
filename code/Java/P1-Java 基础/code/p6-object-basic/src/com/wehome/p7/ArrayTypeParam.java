package com.wehome.p7;

public class ArrayTypeParam {

    public static void main(String[] args) {
        ArrayTypeParam tools = new ArrayTypeParam();

        int[] nums = {4, 3, 1, 6, 7};
        System.out.println("排序之前: ");
        tools.print(nums);

        // 对 nums 数组进行排序
        tools.sort(nums);

        System.out.println("排序之后: ");

        // 输出 nums 数组的元素
        tools.print(nums);
    }

    // 冒泡排序, 实现数组从小到大排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isFlag = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isFlag = false;
                }
            }

            if (isFlag) {
                break;
            }
        }
    }

    // 打印数组的元素
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
