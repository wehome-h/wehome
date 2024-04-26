package com.wehome.p7;

public class RecursionDemo {

    public static void main(String[] args) {
        RecursionDemo demo = new RecursionDemo();

        // 计算 1 ~ num 的和, 使用递归完成
        int num = 5;

        // 调用求和的方法

        int sum = demo.getSum(num);

        // 输出结果
        System.out.println(sum);
    }

    /**
     * 通过递归算法实现.
     * 参数列表: int
     * 返回值类型: int
     */
    public int getSum(int num) {
        /*
          num 为 1 时, 方法返回 1.
          相当于是方法的出口, num 总有是 1 的情况
        */
        if (num == 1) {
            return 1;
        }

        /*
          num 不为 1 时, 方法返回 num + (num - 1) 的累和
          递归调用 getSum() 方法
        */
        return num + getSum(num - 1);
    }
}
