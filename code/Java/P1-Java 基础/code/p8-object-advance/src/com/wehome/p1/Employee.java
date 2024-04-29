package com.wehome.p1;

public class Employee {

    // 私有化, 在类的外面必须使用 get() / set() 方法的方式来访问静态变量
    private static int total;

    // 缺省权限修饰符, 是为了方便类以 类名.静态变量 的方式访问
    static String company;

    private int id;

    private String name;

    public Employee() {
        total++;
        // 使用total静态变量的值为id属性赋值
        id = total;
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Employee.total = total;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "total=" + total +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
