package com.wehome.p7;

public class MathTools {

    // 求两个整数的最大值
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    // 求两个小数的最大值
    public double max(double a, double b) {
        return a > b ? a : b;
    }

    // 求三个整数的最大值
    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // 求n个整数的最大值
    public int max(int... nums) {
        // 如果没有传入整数或者传入null, 这句代码会报异常
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    // 求n个整数的最大值 ======= 编译就报错, 与 (int... nums) 无法区别
  /*
  public int max(int[] nums) {
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    return max;
  }
  */

    // 求n个整数的最大值
    public int max(int first, int... nums) {
        int max = first;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

}
