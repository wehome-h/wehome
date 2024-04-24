package com.wehome.p7;

public class TestVarParam {

    public static void main(String[] args) {

        NumberTools tools = new NumberTools();

        System.out.println(tools.sum()); // 0个实参
        System.out.println(tools.sum(5)); // 1个实参
        System.out.println(tools.sum(5, 6, 2, 4)); // 4个实参
        System.out.println(tools.sum(new int[]{5, 6, 2, 4})); // 传入数组实参

        System.out.println("=======================");

        System.out.println(tools.total(new int[]{})); // 0个元素的数组
        System.out.println(tools.total(new int[]{5})); // 1个元素的数组
        System.out.println(tools.total(new int[]{5, 6, 2, 4})); // 传入数组实参

    }

}
