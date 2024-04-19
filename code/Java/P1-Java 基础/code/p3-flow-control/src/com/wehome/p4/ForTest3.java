package com.wehome.p4;

/*
  遍历1-100以内的偶数, 并获取偶数的个数, 获取所有的偶数的和
*/
public class ForTest3 {
    public static void main(String[] args) {
        int count = 0; // 记录偶数的个数
        int sum = 0; // 记录偶数的和

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("偶数的个数为: " + count);
        System.out.println("偶数的总和为: " + sum);
    }
}
