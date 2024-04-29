package com.wehome.p7;

public class Pet {

    private String nickname; //昵称

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println(nickname + "吃东西");
    }

}
