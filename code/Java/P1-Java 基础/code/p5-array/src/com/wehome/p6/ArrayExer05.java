package com.wehome.p6;

public class ArrayExer05 {
    public static void main(String[] args) {
        String[] hua = {"黑桃", "红桃", "梅花", "方片"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        String[] pai = new String[hua.length * dian.length];

        int k = 0;

        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++) {
                pai[k++] = hua[i] + dian[j];
            }
        }

        for (int i = 0; i < pai.length; i++) {
            System.out.print(pai[i] + "\t");
            if (i % 13 == 12) {
                System.out.println();
            }
        }
    }
}
