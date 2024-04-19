package com.wehome.p3;

/*
  使用 switch-case 实现:
  对学生成绩大于60分的, 输出"合格"。低于60分的, 输出"不合格"
*/
public class SwitchCaseTest3 {
    public static void main(String[] args) {
        int score = 67;
        // 写法1:
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }

        // 写法2:
        switch (score / 60) {
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }
    }
}
