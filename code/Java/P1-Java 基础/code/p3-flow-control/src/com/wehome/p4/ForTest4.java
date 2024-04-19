package com.wehome.p4;

/*
  输出所有的水仙花数, 所谓水仙花数是指一个3位数, 其各个位上数字立方和等于其本身。
  例如: 153 = 1 * 1 * 1 + 3 * 3 * 3 + 5 * 5 * 5
*/
public class ForTest4 {
    public static void main(String[] args) {
        int count = 0; // 统计水仙花数

        // 获取所有三位数 [100-999]
        for (int i = 100; i <= 999; i++) {
            int ge = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i + "是水仙花数");
                count++;
            }
        }

        System.out.println("水仙花数共有" + count + "个");
    }
}