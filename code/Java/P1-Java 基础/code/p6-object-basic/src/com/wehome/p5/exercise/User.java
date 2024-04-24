package com.wehome.p5.exercise;

public class User {

    String name; // 用户名
    String password; // 密码

    /**
     * 实现用户登录的判断
     *
     * @param inputName 输入的用户名
     * @param inputPwd  输入的密码
     */
    public void login(String inputName, String inputPwd) {
        if (name.equals(inputName) && password.equals(inputPwd)) {
            System.out.println("登录成功: 欢迎你, " + name);
        } else {
            System.out.println("登录失败: 用户名或密码错误!");
        }
    }

    /**
     * 实现用户登录的判断
     *
     * @param inputName 输入的用户名
     * @param inputPwd  输入的密码
     * @return true: 登录成功 false: 登录失败
     */
    public boolean login1(String inputName, String inputPwd) {
        return name.equals(inputName) && password.equals(inputPwd);
    }

}
