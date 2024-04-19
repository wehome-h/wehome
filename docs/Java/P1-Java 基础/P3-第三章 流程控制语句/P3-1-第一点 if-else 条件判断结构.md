# 第一点 if-else 条件判断结构

## 1、基本语句

::: raw

<h6>
	<span class="title">结构1：单分支条件判断：if</span>
</h6>

格式：

```java
if (条件表达式) {
  语句块;
}
```

> [!IMPORTANT] 说明
> 条件表达式必须是布尔表达式（关系表达式或逻辑表达式）或布尔变量。

<div class="br"></div>

执行流程：

1.  首先判断条件表达式看其结果是 true 还是 false

2.  如果是 true 就执行语句块

3.  如果是 false 就不执行语句块

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418230414.png)

<h6>
	<span class="title">结构1：单分支条件判断：if</span>
</h6>

:::

::: raw

<h6>
	<span class="title">结构2：双分支条件判断：if-else</span>
</h6>

格式：

```java
if (条件表达式) {
    语句块1;
} else {
    语句块2;
}
```

<div class="br"></div>

执行流程：

1.  首先判断条件表达式看其结果是 true 还是 false

2.  如果是 true 就执行语句块 1

3.  如果是 false 就执行语句块 2

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418230655.png)

<h6>
	<span class="title">结构2：双分支条件判断：if-else</span>
</h6>

:::

::: raw

<h6>
	<span class="title">结构3：多分支条件判断：if-else if-else</span>
</h6>

格式：

```java
if (条件表达式1) {
    语句块1;
} else if (条件表达式2) {
    语句块2;
}
    ...
} else if (条件表达式n) {
    语句块n;
} else {
    语句块n+1;
}
```

> [!IMPORTANT] 说明
> 一旦条件表达式为 true，则进入执行相应的语句块。执行完对应的语句块之后，就跳出当前结构。

<div class="br"></div>

执行流程：

1.  首先判断关系表达式 1 看其结果是 true 还是 false

2.  如果是 true 就执行语句块 1，然后结束当前多分支

3.  如果是 true 就执行语句块 1，然后结束当前多分支

4.  如果是 true 就执行语句块 2，然后结束当前多分支

5.  如果是 false 就继续判断关系表达式……看其结果是 true 还是 false

……

n. 如果没有任何关系表达式为 true，就执行语句块 n + 1，然后结束当前多分支

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418231103.png)

<h6>
	<span class="title">结构3：多分支条件判断：if-else if-else</span>
</h6>

:::

## 2、应用举例

1.  案例 1：成年人心率的正常范围是每分钟 60-100 次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。

    ```java
    public class IfElseTest1 {
        public static void main(String[] args) {
            int heartBeats = 89;

            if (heartBeats < 60 || heartBeats > 100) {
                System.out.println("你需要做进一步的检查");
            }

            System.out.println("体检结束");
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418231859.png)

<div class="br"></div>

2.  案例 2：定义一个整数，判定是偶数还是奇数。

    ```java
    public class IfElseTest2 {
        public static void main(String[] args) {
            int a = 10;

            if (a % 2 == 0) {
                System.out.println(a + "是偶数");
            } else {
                System.out.println(a + "是奇数");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418232054.png)

3.  案例 3：

    ```java
    /*
      岳小鹏参加 Java 考试, 他和父亲岳不群达成承诺:
      如果:
      成绩为 100 分时, 奖励一辆跑车;
      成绩为(80, 99]时, 奖励一辆山地自行车;
      当成绩为[60, 80]时, 奖励环球影城一日游;
      其它时, 胖揍一顿。

      说明: 默认成绩是在[0, 100]范围内
    */

    public class IfElseTest3 {
        public static void main(String[] args) {
            int score = 67;

            // 写法1:
            if (score >= 0 && score <= 100) {
                if (score == 100) {
                    System.out.println("奖励一辆跑车");
                } else if (score > 80 && score <= 99) {
                    System.out.println("奖励一辆山地自行车");
                } else if (score >= 60 && score <= 80) {
                    System.out.println("奖励环球影城一日游");
                } else {
                    System.out.println("胖揍一顿");
                }
            } else {
                System.out.println("成绩是在[0, 100]范围内");
            }

            // 写法2:
            if (score >= 0 && score <= 100) {
                if (score == 100) {
                    System.out.println("奖励一辆跑车");
                } else if (score > 80) {
                    System.out.println("奖励一辆山地自行车");
                } else if (score >= 60) {
                    System.out.println("奖励环球影城一日游");
                } else if (score < 60) {
                    System.out.println("胖揍一顿");
                }
            } else {
                System.out.println("成绩是在[0, 100]范围内");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418233138.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418232406.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418232431.png)

    > [!NOTE] 🚩
    > 当条件表达式之间是<strong style="color: #f3514f;">互斥</strong>关系时（即彼此没有交集），条件判断语句及执行语句间顺序无所谓。
    >
    > 当条件表达式之间时包含关系时，“<strong style="color: #f3514f;">小上大下/子上父下</strong>”，否则范围小的条件表达式不可能被执行。

## 3、if-else 嵌套

在 if 得语句块中，或者是在 else 语句块中，又包含了另外一个条件判断（可以是单分支、双分支、多分支），就构成了<strong style="color: #f3514f;">嵌套结构</strong>。

<div class="br"></div>

执行的特点：

1.  如果是嵌套在 if 语句块中的，只有当外部的 if 条件满足，才会去判断内部的条件

2.  如果是嵌套在 else 语句块中的，只有当外部的 if 条件不满足，进入 else 后，才会去判断内部的条件

<div class="br"></div>

案例 4：由键盘输入三个整数分别存入变量 num1、num2、num3 对它们进行排序（使用 if-else if-else），并且从小到大输出。

```java
public class IfElseTest4 {
    public static void main(String[] args) {
        int num1 = 23, num2 = 32, num3 = 12;

        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + " - " + num1 + " - " + num3);
            } else if (num3 >= num2) {
                System.out.println(num2 + " - " + num3 + " - " + num1);
            } else {
                System.out.println(num3 + " - " + num2 + " - " + num1);
            }
        } else {
            if (num1 >= num3) {
                System.out.println(num3 + " - " + num1 + " - " + num2);
            } else if (num3 >= num2) {
                System.out.println(num1 + " - " + num2 + " - " + num3);
            } else {
                System.out.println(num1 + " - " + num3 + " - " + num2);
            }
        }
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418233243.png)

## 4、其它说明

语句块<strong style="color: #f3514f;">只有一条执行语句</strong>时，一对 <strong style="color: #f3514f;">{} 可以省略</strong>，但建议保留。

当 if-else 结构是“<strong style="color: #f3514f;">多选一</strong>”时，<strong style="color: #f3514f;">最后的 else 是可选</strong>的，根据需要可以省略。

## 5、练习

1.  练习 1：对下列代码，若有输出，指出输出结果

    ```java
    int x = 4;
    int y = 1;

    if (x > 2) {
        if (y > 2) {
            System.out.println(x + y);
            System.out.println("wehome");
        }
    } else {
        System.out.println("x is " + x);
    }

    // 无输出
    ```

<div class="br"></div>

2.  练习 2

    ```java
    boolean b = true;

    if (b == false) {
        System.out.println("a");
    } else if (b) {
        System.out.println("b");
    } else if (!b) {
        System.out.println("c");
    } else {
        System.out.println("d");
    }

    // b

    /* 如果 if (b == false) 写成 if (b = false) 能编译通过吗? 如果能, 结果是 */
    // 能编译通过, 结果是 c
    ```

<div class="br"></div>

3.  练习 3

    ```java
    /*
      定义两个整数, 分别为 small 和 big, 如果第一个整数 small 大于第二个整数 big,
      就交换。输出显示 small 和 big 变量的值。
    */

    public class IfElseExer3 {
        public static void main(String[] args) {
            int small = 10;
            int big = 9;

            if (small > big) {
                System.out.println("交换前: small = " + small + ", big = " + big);

                int temp = small;
                small = big;
                big = temp;
            }
            System.out.println("small = " + small + ", big = " + big);
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418234020.png)

<div class="br"></div>

4.  练习 4

    ```java
    /*
      小明参加期末 Java 考试, 通过考试成绩, 判断其 Java 等级, 成绩范围 [0, 100]
      90 - 100 优秀
      80 - 89 好
      70 - 79 良
      60 - 69 及格
      60 以下 不及格
    */

    public class IfElseExer4 {
        public static void main(String[] args) {
            System.out.println("小明的期末 Java 成绩是: [0, 100]");

            int score = 89;

            if (score < 0 || score > 100) {
                System.out.println("你的成绩是错误的");
            } else {
                if (score >= 90) {
                    System.out.println("优秀");
                } else if (score >= 80) {
                    System.out.println("好");
                } else if (score >= 70) {
                    System.out.println("良");
                } else if (score >= 60) {
                    System.out.println("及格");
                } else {
                    System.out.println("不及格");
                }
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418234300.png)

<div class="br"></div>

5.  练习 5

    ```java
    /*
      编写程序, 声明 2 个 int 型变量并赋值。
      判断两数之和, 如果大于等于 50, 打印 Hello World
    */

    public class IfElseExer5 {
        public static void main(String[] args) {
            int num1 = 12, num2 = 32;

            if (num1 + num2 >= 50) {
                System.out.println("Hello World");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418234500.png)

<div class="br"></div>

6.  练习 6

    ```java
    /*
      编写程序, 声明 2 个 double 型变量并赋值。
      判断第一个数大于 10.0, 且第 2 个数小于 20.0, 打印两数之和。
      否则, 打印两数的乘积。
    */

    public class IfElseExer6 {
        public static void main(String[] args) {
            double d1 = 21.2, d2 = 12.3;

            if (d1 > 10.0 && d2 < 20.0) {
                System.out.println("两数之和为: " + (d1 + d2));
            } else {
                System.out.println("两数乘积为: " + (d1 * d2));
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418234740.png)

7.  练习 7

    ```java
    /*
      判断水的温度
      如果大于 95℃, 则打印"开水";
      如果大于 70℃ 且小于等于 95℃, 则打印"热水";
      如果大于 40℃ 且小于等于 70℃, 则打印"温水";
      如果小于等于 40℃, 则打印"凉水"。
    */
    public class IfElseExer7 {
        public static void main(String[] args) {
            int waterTemperature = 85;

            if (waterTemperature > 95) {
                System.out.println("开水");
            } else if (waterTemperature > 70) {
                System.out.println("热水");
            } else if (waterTemperature > 40) {
                System.out.println("温水");
            } else {
                System.out.println("凉水");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240418234907.png)
