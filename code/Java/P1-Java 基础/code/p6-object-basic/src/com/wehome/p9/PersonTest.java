package com.wehome.p9;

public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person();

        // 实例变量私有化, 跨类是无法直接使用的
        /*
          p.name = "张三";
          p.age = 23;
          p.marry = true;
        */

        p.setName("张三");
        System.out.println("p.name = " + p.getName());

        p.setAge(23);
        System.out.println("p.age = " + p.getAge());

        p.setMarry(true);
        System.out.println("p.marry = " + p.isMarry());
    }

}
