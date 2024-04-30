package com.wehome.p4;

public class User2 {

    private String username;
    private String password;
    private long registrationTime;

    {
        System.out.println("新用户注册");

        registrationTime = System.currentTimeMillis();
    }

    public User2() {
        username = registrationTime + "";
        password = "123456";
    }

    public User2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo() {
        return "用户名: " + username + ", 密码: " + password +
                ", 注册时间: " + registrationTime;
    }

}
