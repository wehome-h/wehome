# 第三点 do-while 循环

## 1、基本语法

语法格式：

```java
① 初始化部分;
do {
  ③ 循环体部分;
  ④ 迭代部分;
} while (② 循环条件部分);
```

执行过程：① → ③ → ④ → ② → ③ → ④ → ② → ③ → ④→ …… → ②

<div class="br"></div>

图示：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240421131809.png)

<div class="br"></div>

说明：

- 结尾 while（循环条件）中循环条件必须是 boolean 类型。

- `do{} while();` 最后有一个分号。

- do-while 结构的循环体语句是至少会执行一次，这个和 for 和 while 是不一样的。

- 循环的三个结构 for、while、do-while 三者是可以相互转换的。

## 2、应用举例

1.  案例 1

    ```java
    /*
      遍历 1-100 的偶数, 并计算所有偶数的和、偶数的个数（累加的思想）
    */
    public class DoWhileTest1 {
        public static void main(String[] args) {
            int num = 1;
            int sum = 0;
            int count = 0;

            do {
                if (num % 2 == 0) {
                    sum += num;
                    count++;
                }
                num++;
            } while (num <= 100);

            System.out.println("偶数的总和为: " + sum);
            System.out.println("偶数的个数为: " + count);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240421132253.png)

<div class="br"></div>

2.  案例 2

    ```java
    /*
      体会do-while至少会执行一次循环体
    */
    public class DoWhileTest2 {
        public static void main(String[] args) {
            // while循环:
            int num1 = 10;
            while (num1 > 10) {
                System.out.println("hello:while");
                num1--;
            }

            // do-while循环:
            int num2 = 10;
            do {
                System.out.println("hello:do-while");
                num2--;
            } while (num2 > 10);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240421132440.png)

<div class="br"></div>

3.  案例 3

    ```java
    /*
        声明遍历 balance 并初始化为 0, 用以表示银行账户的余额, 下面通过 ATM 机程序实现存款,
        取款等功能

        ========== ATM ==========
        1、存款
        2、取款
        3、显示余额
        4、退出
        请选择（1-4）:
    */
    public class ATM {
        public static void main(String[] args) {
            double balance = 0.0; // 表示银行账户的余额

            Scanner scanner = new Scanner(System.in);

            boolean isFlag = true; // 用于控制循环的结束

            do {
                System.out.println("========== ATM ==========");
                System.out.println("\t1、存款");
                System.out.println("\t2、取款");
                System.out.println("\t3、显示余额");
                System.out.println("\t4、退出");

                System.out.print("欢迎使用 ATM 机, 请输入相关的数字进行操作: ");

                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        System.out.print("请输入存款金额: ");
                        double addMoney = scanner.nextDouble();
                        if (addMoney > 0) {
                            balance += addMoney;
                        }
                        break;
                    case 2:
                        System.out.print("要取款的额度为: ");
                        double minusMoney = scanner.nextDouble();
                        if (minusMoney > 0 && balance >= minusMoney) {
                            balance -= minusMoney;
                        } else {
                            System.out.println("您输入的数据非法或余额不足");
                        }
                        break;
                    case 3:
                        System.out.println("当前的余额为: " + balance);
                        break;
                    case 4:
                        System.out.println("欢迎下次进入此系统");
                        isFlag = false;
                        break;
                    default:
                        System.out.println("请重新选择");
                        break;
                }
            } while (isFlag);

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240421133543.png)

## 3、练习

1.  练习 1

    ```java
    /*
      随机生成一个100以内的数, 猜这个随机数是多少?
      从键盘输入数, 如果大了提示, 大了; 如果小了, 提示小了;
      如果对了, 就不再猜了, 并统计一共猜了多少次
    */
    public class DoWhileExer {
        public static void main(String[] args) {
            int num = (int) (Math.random() * 100);

            int count = 0; // 记录次数

            Scanner scanner = new Scanner(System.in);
            int guess;

            do {
                System.out.print("请输入100以内的正数: ");
                guess = scanner.nextInt();  
                count++;
                if (guess > num)
                    System.out.println("大了");
                else if (guess < num)
                    System.out.println("小了");
            } while (guess != num);

            System.out.println("一共猜了: " + count + "次");

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240421133920.png)