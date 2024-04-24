package com.wehome.p5;

public class MethodInvokeDemo {

    public static void main(String[] args) {
        // 创建对象
        MethodDefineDemo md = new MethodDefineDemo();

        // 调用 MethodDefineDemo 类中无参无返回值的方法 sayHello
        md.sayHello();
        md.sayHello();
        md.sayHello();
        // 调用一次, 执行一次, 不调用不执行

        // 调用 MethodDefineDemo 类中有参无返回值的方法 printRectangle
        md.printRectangle(5, 10, '@');

        // 调用 MethodDefineDemo 类中无参有返回值的方法 getIntBetweenOneToHundred
        md.getIntBetweenOneToHundred(); // 语法没问题, 就是结果丢失

        int num = md.getIntBetweenOneToHundred();
        System.out.println("num = " + num);

        System.out.println(md.getIntBetweenOneToHundred());
        // 上面的代码调用了 getIntBetweenOneToHundred 三次, 这个方法执行了三次

        // 调用 MethodDefineDemo 类中有参有返回值的方法 max
        md.max(3, 6); // 语法没问题, 就是结果丢失

        int bigger = md.max(5, 6);
        System.out.println("bigger = " + bigger);

        System.out.println("8, 3中较大者是: " + md.max(8, 3));
    }

}
