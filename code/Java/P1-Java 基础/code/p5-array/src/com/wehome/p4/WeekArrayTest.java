package com.wehome.p4;

import java.util.Scanner;

/*
  用一个数组, 保存星期一到星期天的7个英语单词, 从键盘输入1-7, 显示对应的单词
  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
*/
public class WeekArrayTest {
    public static void main(String[] args) {
        // 1.声明并初始化星期的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // 2.使用Scanner从键盘获取1-7范围的整数
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入 1-7 的整数：");

        int number = scanner.nextInt();

        if (number < 1 || number > 7) {
            System.out.println("请输入 1-7 的整数");
        } else {
            // 根据输入的整数, 到数组中相应的索引位置获取指定的元素（即: 星期几）
            System.out.println(weeks[number - 1]);
        }

        scanner.close();
    }
}