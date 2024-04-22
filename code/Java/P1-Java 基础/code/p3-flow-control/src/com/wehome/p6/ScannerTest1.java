package com.wehome.p6;

/*
  小明注册某交友网站, 要求录入个人相关信息。如下：
  请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况
*/
// ① 导包

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        /* ② 创建Scanner的对象
             Scanner 是一个引用数据类型, 它的全名称是java.util.Scanner
             scanner 就是一个引用数据类的变量了, 赋给它的值是一个对象
             new Scanner(System.in)是一个new表达式, 该表达式的结果是一个对象
             引用数据类型 变量 = 对象;
             这个等式的意思可以理解为用一个引用数据类型的变量代表一个对象,
              所以这个变量的名称又称为对象名
             我们也把scanner变量叫做scanner对象
         */
        Scanner scanner = new Scanner(System.in); // System.in默认代表键盘输入

        // ③ 根据提示, 调用Scanner的方法, 获取不同类型的变量
        System.out.println("欢迎光临你好我好交友网站!");

        System.out.println("请输入你的网名: ");
        String name = scanner.next();

        System.out.println("请输入你的年龄: ");
        int age = scanner.nextInt();

        System.out.println("请输入你的体重: ");
        double weight = scanner.nextDouble();

        System.out.println("你是否单身（true/false）: ");
        boolean isSingle = scanner.nextBoolean();

        System.out.println("请输入你的性别: ");
        char gender = scanner.next().charAt(0); // 先按照字符串接收, 然后再取字符串的第一个字符（下标为0）

        System.out.println("你的基本情况如下: ");
        System.out.println("网名: " + name + "\n年龄: " + age + "\n体重: " +
                weight + "\n单身: " + isSingle + "\n性别: " + gender);

        // ④ 关闭资源
        scanner.close();
    }
}
