package com.wehome.p7;

public class ValueTransferTest1 {

    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);

        // 交换 m 和 n 的值
        /*
          int temp = m;
          m = n;
          n = temp;
        */

        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m, n);

        System.out.println("m = " + m + ", n = " + n);
    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }

}
