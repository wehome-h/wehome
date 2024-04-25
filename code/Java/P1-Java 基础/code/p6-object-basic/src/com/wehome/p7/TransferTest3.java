package com.wehome.p7;

/* 栈: 每个方法在调用时, 都会有以栈帧的方法压入栈中. 栈帧中保存了当前方法中声明的变量:
        方法内声明的, 形参
*/

/* 堆: 存放 new 出来的 "东西": 对象(成员变量在对象中)、数组实体(数组元素). */

/* 注意: 变量前如果声明有类型, 那么这就是一个新的刚要定义的变量.
    如果变量前没有声明类型, 那就说明此变量在之前已经声明过.
*/

public class TransferTest3 {

    public static void main(String[] args) {
        TransferTest3 test = new TransferTest3();

        test.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i); // 20
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i); // 15 0
    }

}
