package com.wehome.p3;

/**
 * USER wehome
 * DATE 2024/4/18 23:18
 */
public class IfElseTest1 {
    public static void main(String[] args) {
        int heartBeats = 89;

        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("你需要做进一步的检查");
        }

        System.out.println("体检结束");
    }
}
