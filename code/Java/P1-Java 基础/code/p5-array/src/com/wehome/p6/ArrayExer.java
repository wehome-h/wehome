package com.wehome.p6;

/*
  评委打分
  分析以下需求, 并用代码实现:
    1.在编程竞赛中, 有10位评委为参赛的选手打分, 分数分别为:
      5, 4, 6, 8, 9, 0, 1, 2, 7, 3
    2.求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
*/
public class ArrayExer {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};

        int max = scores[0];
        int min = scores[0];

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }

            if (min > scores[i]) {
                min = scores[i];
            }

            sum += scores[i];
        }

        double avg = (double) (sum - max - min) / (scores.length - 2);

        System.out.println("选手去掉最高分和最低分的平均分为: " + avg);
    }
}
