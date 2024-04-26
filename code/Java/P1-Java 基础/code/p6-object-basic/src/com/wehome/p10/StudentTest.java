package com.wehome.p10;

public class StudentTest {

    public static void main(String[] args) {
        // 使用第一个构造器创建对象
        Student2 s1 = new Student2("张三", 23);
        System.out.println("s1.name: " + s1.getName() + ", s1.age: " + s1.getAge());

        // 使用第二个构造器创建对象
        Student2 s2 = new Student2("张三", 23, "新东方");
        System.out.println("s2.name: " + s2.getName() + ", s2.age: " + s2.getAge() + ", s2.school: " + s2.getSchool());

        // 使用第三个构造器创建对象
        Student2 s3 = new Student2("张三", 23, "新东方", "烹饪");
        System.out.println("s3.name: " + s3.getName() + ", s3.age: " + s3.getAge() +
                ", s3.school: " + s3.getSchool() + ", s3.major: " + s3.getMajor());
    }

}