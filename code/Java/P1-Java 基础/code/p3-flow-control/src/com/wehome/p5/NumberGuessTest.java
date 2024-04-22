package com.wehome.p5;

/*
  生成 1-100 之间的随机数, 直到生成了 97 这个数, 看看一共用了几次
  提示: 使用 (int) (Math.random() * 100) + 1
*/
public class NumberGuessTest {
    public static void main(String[] args) {
        int count = 0;

        while(true) {
            int random = (int) (Math.random() * 100) + 1;
            count++;
            if (random == 97) {
                break;
            }
        }

        System.out.println("直到生成随机数97, 一共用了" + count + "次");
    }
}
