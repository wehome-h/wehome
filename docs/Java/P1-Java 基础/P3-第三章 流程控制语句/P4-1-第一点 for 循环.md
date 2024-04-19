# 第一点 for 循环

## 1、基本语法

语法格式：

```java
for (①初始化部分; ②循环条件部分; ④迭代部分) {
    ③循环体部分;
}
```

<div class="br"></div>

执行过程：① → ② → ③ → ④ → ② → ③ → ④ → ② → ③ → ④ → …… → ②

<div class="br"></div>

图示：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419100541.png)

<div class="br"></div>

说明：

- `for (;;)` 中的两个; 不能多也不能少

- ① 初始化部分可以声明多个变量，但必须是同一个类型，用逗号分隔

- ② 循环条件部分为 boolean 类型表达式，当值为 false 时，退出循环

- ④ 可以有多个变量更新，用逗号分隔

## 2、应用举例

1.  案例 1：使用 for 循环重复执行某些语句

    ```java
    /*
      输出5行Hello World
    */
    public class ForTest1 {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello World");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419100838.png)

<div class="br"></div>

2.  案例 2：格式的多样性

    ```java
    public class ForTest2 {
        public static void main(String[] args) {
            int num = 1;
            for (System.out.print("a"); num < 3; System.out.print("c"), num++) {
                System.out.println("b");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419101000.png)

<div class="br"></div>

3.  案例 3：累加的思想

    ```java
    /*
      遍历1-100以内的偶数, 并获取偶数的个数, 获取所有的偶数的和
    */
    public class ForTest3 {
        public static void main(String[] args) {
            int count = 0; // 记录偶数的个数
            int sum = 0; // 记录偶数的和

            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    count++;
                    sum += i;
                }
            }

            System.out.println("偶数的个数为: " + count);
            System.out.println("偶数的总和为: " + sum);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419101209.png)

<div class="br"></div>

4.  案例 4：结合分支结构使用

    ```java
    /*
      输出所有的水仙花数, 所谓水仙花数是指一个3位数, 其各个位上数字立方和等于其本身。
      例如: 153 = 1 * 1 * 1 + 3 * 3 * 3 + 5 * 5 * 5
    */
    public class ForTest4 {
        public static void main(String[] args) {
            int count = 0; // 统计水仙花数

            // 获取所有三位数 [100-999]
            for (int i = 100; i <= 999; i++) {
                int ge = i / 1 % 10;
                int shi = i / 10 % 10;
                int bai = i / 100 % 10;

                if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                    System.out.println(i + "是水仙花数");
                    count++;
                }
            }

            System.out.println("水仙花数共有" + count + "个");
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419101416.png)

<div class="br"></div>

拓展：

```java
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
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419101628.png)

<div class="br"></div>

5.  案例 5：结合 break 的使用

    ```java
    /*
    输入两个正整数 m 和 n, 求其最大公约数和最小公倍数。
    比如: 12和20的最大公约数是4, 最小公倍数是60
    */
    public class ForTest5 {
        public static void main(String[] args) {
            // 需求1: 最大公约数
            int m = 12, n = 20;

            // 取出两个数中的较小值
            int min = (m < n) ? m : n;

            for (int i = min; i >= 1; i--) {
                if (m % i == 0 && n % i == 0) {
                    System.out.println("最大公约数是: " + i);
                    break; // 跳出当前循环结构
                }
            }

            // 需求2: 最小公倍数
            // 取出两个数中的较大值
            int max = (m > n) ? m : n;

            for (int i = max; i <= m * n; i++) {
                if (i % m == 0 && i % n == 0) {
                    System.out.println("最小公倍数是: " + i);
                    break;
                }
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419101928.png)

    > [!NOTE] 说明
    >
    > 1.  我们可以在循环中使用 break。一旦执行 break，就跳出当前循环结构。
    >
    > 2.  小节：如何结束一个循环结构？
    >
    >     结束情况 1：循环结构中的循环条件部分返回 false
    >
    >     结束情况 2：循环结构中执行了 break。
    >
    > 3.  如果一个循环结构不能结束，那就是一个死循环！我们开发中要避免出现死循环。

## 3、练习

1.  练习 1

    ```java
    /*
      打印1-100之间所有奇数的和
    */
    public class ForExer1 {
        public static void main(String[] args) {
            int sum = 0;

            for (int i = 1; i < 100; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }

            System.out.println("奇数总和为: " + sum);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419102454.png)

<div class="br"></div>

2.  练习 2

    ```java
    /* 打印1-100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）*/
    public class ForExer2 {
        public static void main(String[] args) {
            int sum = 0;
            int count = 0;

            for (int i = 1; i <= 100; i++) {
                if (i % 7 == 0) {
                    sum += i;
                    count++;
                }
            }

            System.out.println("1-100之间所有是7的倍数的整数的和为: " + sum);
            System.out.println("1-100之间所有是7的倍数的整数的个数为: " + count);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419102624.png)

<div class="br"></div>

3.  练习 3

    ```
    /*
      编写程序从 1 循环到 150, 并在每行打印一个值, 另外在每个 3 的倍数行上打印出 "foo",
      在每个 5 的倍数行上打印 "jbiz", 在每个 7 的倍数行上打印输出 "baz"
    */
    ```
    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419102738.png)

    ```java
    public class ForExer3 {
        public static void main(String[] args) {
            for (int i = 1; i <= 150; i++) {
                System.out.print(i + "\t");
                if (i % 3 == 0) {
                    System.out.println("foo\t");
                }
                if (i % 5 == 0) {
                    System.out.println("biz\t");
                }
                if (i % 7 == 0) {
                    System.out.println("baz\t");
                }

                System.out.println();
            }
        }
    }
    ```
