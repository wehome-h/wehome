package com.wehome.p5;

public class YangHuiTest {
    public static void main(String[] args) {
        // 1.动态初始化的方式创建二维数组
        int[][] yangHui = new int[10][];

        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];

            // 2.给数组元素赋值
            // 2.1给内层数组元素中的首元素和末元素赋值
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;

            // 2.2给内层数组中的非首元素和非末元素赋值
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }

        // 3.遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
