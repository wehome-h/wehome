# 第二点 switch-case 选择结构

## 1、基本语法

::: raw

<h6>
  <span class="title">格式</span>
</h6>

```java
switch (表达式) {
    case 常量值1:
        语句块1;
        [break;]
    case 常量值2:
        语句块2;
        [break;]
        // ...
    [default:
        语句块n+1;
        break;
    ]
}
```

<h6>
  <span class="title">格式</span>
</h6>

:::

::: raw

<h6>
  <span class="title">执行流程图</span>
</h6>

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419084705.png)

<h6>
  <span class="title">执行流程图</span>
</h6>

:::

::: raw

<h6>
  <span class="title">执行流程</span>
</h6>

1.  第一步：根据 switch 中表达式的值，一次匹配各个 case。如果表达式的值等于某个 case 中的常量值，则执行对应 case 中的执行语句。

2.  第二步：执行完此 case 的执行语句以后，

    1.  情况 1：如果遇到 break，则执行 break 并跳出当前的 switch-case 结构。

    2.  情况 2：如果没有遇到 break，则会继续执行当前 case 之后的其它 case 中的执行语句。（case 穿透）

    3.  ……

    4.  直到遇到 break 关键字或执行完所有的 case 及 default 的执行语句，跳出当前的 swtich-case 结构。

<h6>
  <span class="title">执行流程</span>
</h6>

:::

::: raw

<h6>
  <span class="title">使用注意点</span>
</h6>

- <strong style="color: #f3514f;">switch（表达式）</strong>中表达式的值必须是下述几种类型之一：`byte`、`short`、`char`、`int`、`枚举(JDK5.0)`、`String(JDK7.0)`；

- case 子句中的值必须是常量，不能是变量名或不确定的表达式值或范围；

- 同一个 switch 语句，所有 case 子句中的常量值互不相同；

- break 语句用来在执行完一个 case 分支后使程序跳出 switch 语句块；

  如果没有 break，程序会顺序执行到 switch 结尾；

- default 子句是可选的。同时，位置也是灵活的。当没有匹配的 case 时，执行 default 语句。

<h6>
  <span class="title">使用注意点</span>
</h6>

:::

## 2、应用举例

1.  案例 1

    ```java
    public class SwitchCaseTest1 {
        public static void main(String[] args) {
            int num = 1;
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println("other");
                    // break;
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419085944.png)

<div class="br"></div>

2.  案例 2

    ```java
    public class SwitchCaseTest2 {
        public static void main(String[] args) {
            String season = "summer";
                switch (season) {
                    case "spring":
                        System.out.println("春暖花开");
                        break;
                    case "summer":
                        System.out.println("夏日炎炎");
                        break;
                    case "autumn":
                        System.out.println("秋高气爽");
                        break;
                    case "winter":
                        System.out.println("冬雪皑皑");
                        break;
                    default:
                        System.out.println("季节输入有误");
                        break;
            }
        }
    }
    ```
    
    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419090408.png)

    <div class="br"></div>

    ```java
    // 错误举例
    int key = 10;
    switch (key) {
        case key > 0: // [!code error]
            System.out.println("正数");
            break;
        case key < 0: // [!code error]
            System.out.println("负数");
            break;
        default:
            System.out.println("零");
            break;
    }
    ```

<div class="br"></div>

3.  案例 3

    ```java
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
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419090959.png)

## 3、利用 case 的穿透性

在 switch 语句中，如果 case 的后面不写 break，将出现穿透现象，也就是一旦匹配成功，不会在判断下一个 case 的值，直接向后运行，直到遇到 braek 或者整个 switch 语句结束，执行终止。

<div class="br"></div>

案例 4：

```java
/*
  编写程序: 
  从键盘上输入 2023 年的"month"和"day", 要求通过程序输出输入的日期为2023年的第几天。
*/

public class SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入2024年的month: ");
        int month = scanner.nextInt();

        System.out.println("请输入2024年的day: ");
        int day = scanner.nextInt();

        int sumDays = 0;

        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }

        System.out.println(month + "月" + day + "日是2023年的第" + sumDays + "天");

        scanner.close();
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419091524.png)

<div class="br"></div>

扩展：

```java
/*
  从键盘分别输入年、月、日, 判断这一天是当年的第几天
  
  注: 判断一年是否是闰年的标准:
    1. 可以被4整除, 但不可被100整除
      或
    2. 可以被400整除
  
  例如: 1900, 2200等能被4整除, 但同时能被100整除, 但不能被400整除, 不是闰年
*/

public class SwitchCaseTest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入year: ");
        int year = scanner.nextInt();

        System.out.println("请输入month: ");
        int month = scanner.nextInt();

        System.out.println("请输入day: ");
        int day = scanner.nextInt();

        int sumDays = 0;

        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sumDays++;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }

        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + sumDays + "天");

        scanner.close();
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419092029.png)

<div class="br"></div>

案例 5：

```java
/*
  根据指定的月份输出对应季节
*/
public class SwitchCaseTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入月份:");
        int month = scanner.nextInt();

        switch (month) {      
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你输入的月份有误");
        }

        scanner.close();
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419092319.png)

使用 if-esle 实现：

```java
if (month == 1 || month == 2 || month == 12) {
    System.out.println("冬季");
} else if (month == 3 || month == 4 || month == 5) {
    System.out.println("春季");
} else if (month == 6 || month == 7 || month == 8) {
    System.out.println("夏季");
} else if (month == 9 || month == 10 || month == 11) {
    System.out.println("秋季");
} else {
    System.out.println("你输入的月份有误");
}
```

## 4、if-else 语句与 switch-case 语句比较

结论：凡是使用 switch-case 的结构都可以转换为 if-else 结构。反之，不成立。

<div class="br"></div>

开发经验：如果既可以使用 switch-case，又可以使用 if-else，建议使用 switch-case。因为效率稍高。

<div class="br"></div>

细节对比：

- if-else语句优势

  - `if` 语句的条件是一个布尔类型值，if 条件表达式为 true 则进入分支，可以用于范围的判断，也可以用于等值的判断，<strong style="color: #f3514f;">使用范围更广</strong>。

  - `switch` 语句的条件是一个常量值（byte、short、int、char、枚举、String），只能判断某个变量或表达式的结果是否等于某个常量值，<strong style="color: #f3514f;">使用场景较狭窄</strong>。

- switch 语句优势

  - 当条件是判断某个变量或表达式是否等于某个固定的常量值时，使用 if 和 switch 都可以，习惯上使用 `switch` 更多。因为<strong style="color: #f3514f;">效率稍高</strong>。当条件是区间范围的判断时，只能使用if语句。

  - 使用 `switch` 可以利用<strong style="color: #f3514f;">穿透性</strong>，同时执行多个分支，而 if-else 没有穿透性。

<div class="br"></div>

案例：只能使用 if-else

从键盘输入一个整数，判断是正数、负数、还是零。

```java
public class IfOrSwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入整数: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + "是正数");
        } else if (num < 0) {
            System.out.println(num + "是负数");
        } else {
            System.out.println(num + "为零");
        }

        input.close();
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419093116.png)

## 5、练习

1.  练习 1

    ```java
    /*
      从键盘输入星期的整数值，输出星期的英文单词
    */
    public class SwitchCaseExer1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入星期值: ");
            int weekday = scanner.nextInt();

            switch (weekday) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("你输入的星期值有误");
                    break;
            }

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419093429.png)

<div class="br"></div>

2.  练习 2

    ```java
    /*
      使用 switch 把小写类型的 char 型转为大写。只转换 a、b、c、d、e 其它的输出 other
    */
    char word = 'c';

    switch (word) {
        case 'a':
            System.out.println("A");
            break;
        case 'b':
            System.out.println("B");
            break;
        case 'c':
            System.out.println("C");
            break;
        case 'd':
            System.out.println("D");
            break;
        case 'e':
            System.out.println("E");
            break;
        default:
            System.out.println("other");
            break;
    }
    ```

<div class="br"></div>

3.  练习 3

    ```java
    /*
      编写程序: 从键盘上读入一个学生成绩, 存放在变量 score 中, 
      根据 score 的值输出其对应的成绩等级:
      score >= 90         等级: A
      70 <= score < 90    等级: B
      60 <= score < 70    等级: C
      score < 60          等级: D
    */

    // 方式一: 使用 if-else
    // 方式二: 使用 switch-case:    score / 10 : 0 - 10
    public class SwitchCaseExer3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入学生成绩: ");
            int score = scanner.nextInt();

            char grade;

            // 方式一:
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 70) {
                grade = 'B';
            } else if (score >= 60) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            // 方式二:
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                break;
                case 8:
                case 7:
                    grade = 'B';
                break;
                case 6:
                    grade = 'C';
                break;
                default:
                    grade = 'D';
                break;
            }

            System.out.println("学生成绩为: " + score + ", 对应的等级为: " + grade);

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419094025.png)

<div class="br"></div>

4.  练习 4

    ```
    /*
      编写一个程序, 为一个给定的年份找出其对应的中国生效。中国生效基于12年一个周期,
      每年用一个动物代表: rat、ox、tiger、rabbit、dragon、snake、horse、sheep、
      monkey、rooster、dog、pig
      
      提示: 2022年: 虎    2022 % 12 == 6
    */
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419094205.png)

    
    ```java
    public class SwitchCaseExer4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入年份: ");
            int year = scanner.nextInt();

            switch (year % 12) {
                case 0:
                    System.out.println(year + "是猴年");
                    break;
                case 1:
                    System.out.println(year + "是鸡年");
                    break;
                case 2:
                    System.out.println(year + "是狗年");
                    break;
                case 3:
                    System.out.println(year + "是猪年");
                    break;
                case 4:
                    System.out.println(year + "是鼠年");
                    break;
                case 5:
                    System.out.println(year + "是牛年");
                    break;
                case 6:
                    System.out.println(year + "是虎年");
                    break;
                case 7:
                    System.out.println(year + "是兔年");
                    break;
                case 8:
                    System.out.println(year + "是龙年");
                    break;
                case 9:
                    System.out.println(year + "是蛇年");
                    break;
                case 10:
                    System.out.println(year + "是马年");
                    break;
                case 11:
                    System.out.println(year + "是羊年");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419094435.png)

<div class="br"></div>

5.  练习 5

    ```
    /*
      随机产生3个1-6的整数, 如果三个数相等, 那么称为"豹子", 如果三个数之和大于9, 称为"大",
      如果三个数之和小于等于9, 称为"小", 用户从键盘输入押的是"豹子"、"大"、"小",
      并判断是否猜对了
      
      提示: 随机数 Math.random() 产生 [0, 1) 范围内的小数
            如何获取 [a, b] 范围内的随机整数呢? 
            (int) (Math.random() * (b - a + 1)) + a
    */
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419094619.png)

    ```java
    public class SwitchCaseExer5 {
        public static void main(String[] args) {
            int a = (int) (Math.random() * 6 + 1);
            int b = (int) (Math.random() * 6 + 1);
            int c = (int) (Math.random() * 6 + 1);

            Scanner scanner = new Scanner(System.in);

            System.out.println("请押宝(豹子、大、小: )");
            String ya = scanner.next();

            boolean result = false;

            switch (ya) {
                case "豹子":
                    result = a == b && b == c;
                    break;
                case "大":
                    result = a + b + c > 9;
                    break;
                case "小":
                    result = a + b + c <= 9;
                    break;
                default:
                    System.out.println("输入有误");
                    break;
                }

            System.out.println("a, b, c分别是: " + a + ", " + b + ", " + c);

            System.out.println(result ? "猜中了" : "猜错了");

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240419094829.png)

<div class="br"></div>

6.  练习 6

    ```java
    /* 使用 switch 语句改写下列 if 语句: */
    int a = 3;
    int x = 100;
    if (a == 1)
        x += 5;
    else if (a == 2)
        x += 10;
    else if (a == 3)
        x += 16;
    else
        x += 34;

    switch (a) {
        case 1:
            x += 5;
            break;
        case 2:
            x += 10;
            break;
        case 3:
            x += 16;
            break;
        default:
            x += 34;
            break;
    }
    ```