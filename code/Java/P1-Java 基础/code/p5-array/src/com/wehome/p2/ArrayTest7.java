package com.wehome.p2;

public class ArrayTest7 {
    public static void main(String[] args) {
        // 存储26个字母
        char[] letters = new char[26];
        System.out.println("letters数组的长度: " + letters.length);
        System.out.print("存储字母到letters数组之前: [");
        for (int i = 0; i < letters.length; i++) {
            if (i == 0) {
                System.out.print(letters[i]);
            } else {
                System.out.print(", " + letters[i]);
            }
        }
        System.out.println("]");

        // 存储5个姓名
        String[] names = new String[5];
        System.out.println("names数组的长度: " + names.length);
        System.out.print("存储姓名到names数组之前: [");
        for (int i = 0; i < names.length; i++) {
            if (i == 0) {
                System.out.print(names[i]);
            } else {
                System.out.print(", " + names[i]);
            }
        }
        System.out.println("]");
    }
}
