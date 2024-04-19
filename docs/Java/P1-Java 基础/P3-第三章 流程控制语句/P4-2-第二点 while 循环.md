# 第二点 while 循环

## 1、基本语法

语法格式：

```java
① 初始化部分
while (② 循环条件部分) {
    ③ 循环体部分;
    ④ 迭代部分;
}
```

<div class="br"></div>

执行过程：① → ② → ③ → ④ → ② → ③ → ④ → ② → ③ → ④ → …… → ②

<div class="br"></div>

图示：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419141242.png)

<div class="br"></div>

说明：

- while（循环条件）中循环条件必须是 boolean 类型。

- 注意不要忘记声明 ④ 迭代部分。否则，循环将不能结束，变成死循环。

- for 循环和 while 循环可以相互转换。二者没有性能上的差别。实际开发中，根据具体结构的情况，选择哪个格式更合适、美观。

- for 循环与 while 循环的区别：初始化条件部分的作用域不同。

## 2、应用举例

1. 案例 1

    ```java
    /*
      输出5行Hello World
    */
    public class WhileTest1 {
        public static void main(String[] args) {
            int i = 1;
            while (i <= 5) {
                System.out.println("Hello World");
                i++;
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419141658.png)

<div class="br"></div>

2.  案例 2

    ```java
    /*
      遍历1-100的偶数, 并计算所有偶数的和、偶数的个数（累加的思想）
    */
    public class WhileTest2 {
        public static void main(String[] args) {
            int count = 0;
            int sum = 0;

            int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            // 迭代条件
            i++;
        }

            System.out.println("偶数的总和为: " + sum);
            System.out.println("偶数的个数为: " + count);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419141849.png)

<div class="br"></div>

3.  案例 3

    ```java
    /*
      随机生成一个100以内的数, 猜这个随机数是多少
      从键盘输入数, 如果大了, 提示大了; 如果小了, 提示小了; 如果对了, 就不再猜了,
      并统计一共猜了多少次

      提示: 生成一个[a,b]范围的随机数的方式:
      (int) (Math.random() * (b - a + 1) + a)
    */
    public class GuessNumber {
        public static void main(String[] args) {
            // 获取一个随机数
            int random = (int) ((Math.random() * 100) + 1);

            int count = 1;

            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入一个整数（1-100）: ");
            int guess = scanner.nextInt();

            while (guess != random) {
                if (guess > random) {
                    System.out.println("猜大了");
                } else if (guess < random) {
                    System.out.println("猜小了");
                }

                System.out.println("请输入一个整数（1-100）: ");
                guess = scanner.nextInt();

                count++;
            }

            System.out.println("猜中了！");
            System.out.println("一共猜了" + count + "次");
        }
    }
    ```
    
    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419142135.png)

<div class="br"></div>

4.  案例 4

    ```java
    /*
      世界最高山峰是珠穆朗玛峰, 它的高度是8848.86米, 加入我们有一张足够大的纸,
      它的厚度是0.1毫米
      请问, 我折叠多少次, 可以折成珠穆朗玛峰的高度?
    */
    public class ZFTest {
        public static void main(String[] args) {
            int count = 0;
            int zf = 8848860;

            double paper = 0.1;

            while (paper < zf) {
                count++;
                paper *= 2;
            }

            System.out.println("需要折叠: " + count + "次");
            System.out.println("折纸的高度为" + paper / 1000 + "米, 超过了珠峰的高度");
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419142322.png)

## 3、练习

```java
/*
  从键盘输入整数, 输入0结束, 统计输入的正数、负数的个数。
*/
public class Test05While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0; // 记录正数的个数
        int negative = 0; // 记录负数的个数
        int num = 1; // 初始化为特殊值, 使得第一次循环条件成立

        while (num != 0) {
            System.out.println("请输入整数（0表示结束）");

            num = scanner.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("正数个数: " + positive);
        System.out.println("负数个数: " + negative);

        scanner.close();
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419142539.png)