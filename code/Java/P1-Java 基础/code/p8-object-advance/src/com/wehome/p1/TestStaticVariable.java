package com.wehome.p1;

public class TestStaticVariable {

    public static void main(String[] args) {
        // 静态变量total的默认值是0
        System.out.println("Employee.total = " + Employee.getTotal());

        Employee e1 = new Employee("张三");
        Employee e2 = new Employee("李四");
        // 静态变量company的默认值是null
        System.out.println(e1);
        // 静态变量company的默认值是null
        System.out.println(e2);
        // 静态变量total值是2
        System.out.println("Employee.total = " + Employee.getTotal());

        Employee.company = "wehome we are home";
        // 静态变量company的值是 wehome we are home
        System.out.println(e1);
        // 静态变量company的值是 wehome we are home
        System.out.println(e2);

        // 只要权限修饰符允许, 虽然不推荐, 但是也可以通过 对象.静态变量 的形式来访问
        e1.company = "we are home";
        // 静态变量company的值是 we are home
        System.out.println(e1);
        // 静态变量company的值是 we are home
        System.out.println(e2);
    }

}