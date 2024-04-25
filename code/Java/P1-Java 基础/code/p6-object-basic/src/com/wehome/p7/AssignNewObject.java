package com.wehome.p7;

public class AssignNewObject {

    public static void main(String[] args) {
        AssignNewObject tools = new AssignNewObject();

        MyData data = new MyData();
        data.x = 1;
        data.y = 2;

        System.out.println("交换之前: x = " + data.x + ", y = " + data.y); // 交换之前: x = 1, y = 2

        tools.swap(data); // 调用完之后, x 与 y 的值交换?

        System.out.println("交换之后: x = " + data.x + ", y = " + data.y); // 交换之后: x = 1, y = 2
    }

    public void swap(MyData my) {
        my = new MyData(); // 考虑堆空间此新创建的对象, 和 main 中的 data 对象是否有关
        int temp = my.x;
        my.x = my.y;
        my.y = temp;
    }

}
