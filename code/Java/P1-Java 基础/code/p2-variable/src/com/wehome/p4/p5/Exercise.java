package com.wehome.p4.p5;

/**
 * USER wehome
 * DATE 2024/4/14 16:40
 */
public class Exercise {

    public static void main(String[] args) {

        /*
            设 x 为 float 型变量,
            y 为 double 型变量,
            a 为 int 型变量,
            b 为 long 型变量,
            c 为 char 型变量,
            则表达式 x + y * a / x + b / y + c 的值类型为:

            A.int    B.long    C.double    D.char
         */
        float x = 1.0F;
        double y = 2.0;
        int a = 1;
        long b = 2L;
        char c = 'c';

        System.out.println(x + y * a / x + b / y + c);
    }

}
