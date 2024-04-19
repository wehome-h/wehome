package com.wehome.p4;

/*
  打印出四位数字中 "个位+百位" 等于 "十位+千位" 并且个位数为偶数,
  千位数为奇数的数字, 并打印符合条件的数字的个数。
*/
public class ForTest4Expand {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1000; i <= 9999; i++) {
            int ge = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            if ((ge + bai == shi + qian) && ge % 2 == 0 && qian % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
