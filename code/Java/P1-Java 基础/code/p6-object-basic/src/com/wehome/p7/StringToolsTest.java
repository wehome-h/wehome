package com.wehome.p7;

public class StringToolsTest {

    public static void main(String[] args) {
        StringTools tools = new StringTools();

        System.out.println(tools.concat('-'));
        System.out.println(tools.concat('-', "hello", "world"));
        System.out.println(tools.concat('-', "hello", "world", "java"));
    }

}
