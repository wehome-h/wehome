package com.wehome.p9;

/**
 * 自定义的操作数组的工具类
 */

public class ArrayUtils {

    /**
     * 求 int 型数组的最大值
     *
     * @param arr
     * @return
     */
    public int max(int[] arr) {
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    /**
     * 求 int 型数组的最小值
     *
     * @param arr
     * @return
     */
    public int min(int[] arr) {
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    /**
     * 求 int 型数组的总和
     *
     * @param arr
     * @return
     */
    public int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    /**
     * 求 int 型数组的元素的平均值
     *
     * @param arr
     * @return
     */
    public int avg(int[] arr) {
        int sumValue = sum(arr);

        return sumValue / arr.length;
    }

    /* 创建一系列重载的上述方法 */
    // public double max(double[] arr) {}
    // public float max(float[] arr) {}
    // public byte max(byte[] arr) {}


    /**
     * 遍历数组
     *
     * @param arr
     */
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 复制数组 arr
     *
     * @param arr
     * @return
     */
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        return arr1;
    }

    /**
     * 反转数组
     *
     * @param arr
     */
    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j ; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 数组的排序
     *
     * @param arr
     * @param desc 指明排序的方式. ascend: 升序 descend: 降序
     */
    public void sort(int[] arr, String desc) {
        if ("ascend".equals(desc)) {
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
        } else if ("descend".equals(desc)) {
            for (int i = 0; i < arr.length - 1; i++) {
                boolean isFlag = true;

                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
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
        } else {
            System.out.println("您输入的排序方式有误!");
        }
    }

    /**
     * 查找指定的 value 值在 arr 数组中出现的位置
     *
     * @param arr
     * @param value
     * @return 返回 value 值出现的位置 或 -1: 未找到
     */
    public int getValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }

        return -1;
    }

}