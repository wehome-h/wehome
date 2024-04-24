package com.wehome.p5.exercise;

import java.util.Scanner;

/**
 * 用户界面类 UserInterface:
 * <p>
 * 在用户界面类中添加 main 方法, 接收用户输入, 并调用用户类的登录方法进行验证
 * 输入:
 * 登录失败: 用户名或密码错误!
 * 登录成功: 欢迎你, 用户名!
 */
public class UserInterface {

    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "wehome";
        u1.password = "abc123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名: ");
        String name = scanner.next();
        System.out.print("请输入密码: ");
        String password = scanner.next();

        // 演示1:
        u1.login(name, password);

        // 演示2:
        boolean isLogin = u1.login1(name, password);
        if (isLogin) {
            System.out.println("登录成功: 欢迎你, " + u1.name);
        } else {
            System.out.println("登录失败: 用户名或密码错误!");
        }

        scanner.close();
    }

}
