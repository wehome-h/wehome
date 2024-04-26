package com.wehome.p10;

public class Student2 {

    private String name;
    private int age;
    private String school;
    private String major;

    public Student2(String n, int a) {
        name = n;
        age = a;
    }

    public Student2(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    public Student2(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setSchool(String s) {
        school = s;
    }

    public String getSchool() {
        return school;
    }

    public void setMajor(String m) {
        major = m;
    }

    public String getMajor() {
        return major;
    }

}
