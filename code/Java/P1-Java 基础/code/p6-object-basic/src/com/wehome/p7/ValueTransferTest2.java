package com.wehome.p7;

public class ValueTransferTest2 {

    public static void main(String[] args) {
        Data d1 = new Data();

        d1.m = 10;
        d1.n = 20;

        System.out.println("m = " + d1.m + ", n = " + d1.n);

        // 实现 换序
        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(d1);
    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}
