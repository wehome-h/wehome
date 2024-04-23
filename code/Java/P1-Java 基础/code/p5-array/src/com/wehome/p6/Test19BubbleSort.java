package com.wehome.p6;

/*
  1.冒泡排序（最经典）
    思想: 每一次比较相邻（位置相邻）元素, 如果它们不符合目标顺序（例如: 从小到大）,
          就交换它们, 经过多轮比较, 最终实现排序。
          （例如: 从小到大）每一轮可以把最大的沉底, 或最小的冒顶。
    过程: arr{6, 9, 2, 9, 1} 目标: 从小到到

    第一轮:
      第1次, arr[0] 与 arr[1], 6 > 9 不成立, 满足目标要求, 不交换
      第2次, arr[1] 与 arr[2], 9 > 2 成立, 不满足目标要求,
            交换 arr[1] 与 arr[2] {6, 2, 9, 9, 1}
      第3次, arr[2] 与 arr[3], 9 > 9 不成立, 满足目标要求, 不交换
      第4次, arr[3] 与 arr[4], 9 > 1 成立, 不满足目标要求,
            交换 arr[3] 与 arr[4] {6, 2, 9, 1, 9}

      第一轮的结果: 第一最大值9沉底（本次是后面的9沉底）,
                  即到 {6, 2, 9, 1, 9} 元素的最右边

    第二轮:
      第1次, arr[0] 与 arr[1], 6 > 2 成立, 不满足目标要求,
            交换 arr[0] 与 arr[1] {2, 6, 9, 1, 9}
      第2次, arr[1] 与 arr[2], 6 > 9 不成立, 满足目标要求, 不交换
      第3次, arr[2] 与 arr[3], 9 > 1 成立, 不满足目标要求,
            交换 arr[2] 与 arr[3] {2, 6, 1, 9, 9}

      第二轮的结果: 第二最大值9沉底（本次是前面的9沉底）,
                  即到 {2, 6, 1, 9} 元素的最右边

    第三轮:
      第1次, arr[0] 与 arr[1], 2 > 6 不成立, 满足目标要求, 不交换
      第2次, arr[1] 与 arr[2], 6 > 1 成立, 不满足目标要求,
            交换 arr[1] 与 arr[2] {2, 1, 6, 9, 9}

      第三轮未排序的所有元素 {2, 6, 1} 已经都参与了比较, 结束。

      第三轮的结果: 第三大值6沉底, 即到 {2, 1, 6} 元素的最右边

    第四轮:
      第1次, arr[0] 与 arr[1], 2 > 1 成立, 不满足目标要求,
            交换 arr[0] 与 arr[1] {1, 2, 6, 9, 9}

      第四轮未排序的所有元素 {2, 1} 已经都参与了比较, 结束。

      第四轮的结果: 第四最大值2沉底, 即到 {1, 2} 元素的最右边
*/
public class Test19BubbleSort {
    public static void main(String[] args) {
    /*
      目标: 从小到大
      冒泡排序的轮数 = 元素的总个数 - 1
      轮数是多轮, 每一轮比较的次数是多次, 需要用到双重循环, 即循环嵌套
      外循环控制轮数, 内循环控制每一轮的比较次数和过程
    */
        int[] arr = {6, 9, 2, 9, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true; // 假设数组已经是有序的

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = false; // 如果元素发生了交换, 那么说明数组还没有排好序
                }
            }

            if (flag) {
                break;
            }
        }

        // 完成排序, 遍历结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}