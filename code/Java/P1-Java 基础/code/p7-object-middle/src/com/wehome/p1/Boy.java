package com.wehome.p1;

public class Boy {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println(name + " marry with " + girl.getName());
    }

    public void shout() {
        System.out.println("shout");
    }

}
