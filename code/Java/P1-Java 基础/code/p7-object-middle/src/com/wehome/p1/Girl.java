package com.wehome.p1;

public class Girl {

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

    public void marry(Boy boy) {
        System.out.println(name + " marry with " + boy.getName());
    }

    public void compare(Girl girl) {
        int age = this.age - girl.age;
        if (age > 0) {
            System.out.println(name + "比" + girl.getName() + "大" + age + "岁");
        } else if (age < 0) {
            System.out.println(name + "比" + girl.getName() + "小" + age + "岁");
        } else {
            System.out.println(name + "和" + girl.getName() + "一样大");
        }
    }

}
