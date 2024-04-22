# 第六节 Scanner 键盘输入功能的实现

如何从键盘获取不同类型（基本数据类型、String 类型）的变量：使用 Scanner 类。

<div class="br"></div>

键盘输入代码的四个步骤：

1.  导报：`import java.util.Scanner;`

2.  创建 Scanner 类型的对象：`Scanner scanner = new Scanner(System.in);`

3.  调用 Scanner 类的相关方法（`next()` / `nextXxx()`），来获取指定类型的变量

4.  释放资源：`scanner.close();`

<div class="br"></div>

注意：需要根据相应的方法，来输入指定类型的值。如果输入的数据类型要求的类型不匹配时，会报异常导致程序终止。

## 1、各种类型的数据输入

案例：

```java
public class ScannerTest1 {
    public static void main(String[] args) {
        /* ② 创建 Scanner 的对象
             Scanner 是一个引用数据类型, 它的全名称是 java.util.Scanner
             scanner 就是一个引用数据类的变量了, 赋给它的值是一个对象
             new Scanner(System.in) 是一个 new 表达式, 该表达式的结果是一个对象
             引用数据类型 变量 = 对象;
             这个等式的意思可以理解为用一个引用数据类型的变量代表一个对象,
                所以这个变量的名称又称为对象名
             我们也把 scanner 变量叫做 scanner 对象
         */
        Scanner scanner = new Scanner(System.in); // System.in默认代表键盘输入

        // ③ 根据提示, 调用Scanner的方法, 获取不同类型的变量
        System.out.println("欢迎光临你好我好交友网站!");

        System.out.println("请输入你的网名: ");
        String name = scanner.next();

        System.out.println("请输入你的年龄: ");
        int age = scanner.nextInt();

        System.out.println("请输入你的体重: ");
        double weight = scanner.nextDouble();

        System.out.println("你是否单身（true/false）: ");
        boolean isSingle = scanner.nextBoolean();

        System.out.println("请输入你的性别: ");
        char gender = scanner.next().charAt(0); // 先按照字符串接收, 然后再取字符串的第一个字符（下标为0）

        System.out.println("你的基本情况如下: ");
        System.out.println("网名: " + name + "\n年龄: " + age + "\n体重: " +
                weight + "\n单身: " + isSingle + "\n性别: " + gender);

        // ④ 关闭资源
        scanner.close();
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422111354.png)

## 2、练习

1.  练习 1

    ```java
    /*
      大家都知道, 男大当婚, 女大当嫁。那么女方家长要嫁女儿, 当然要提出一定的条件:
      高: 180cm 以上; 富: 财富 1 千万以上; 帅: 是。

      如果这三个条件同时满足, 则: "我一定要嫁给他"
      如果三个条件有为真的情况, 则: "嫁吧, 比上不足, 比下有余"
      如果三个条件都不满足, 则: "不嫁"

      提示:
        System.out.println("身高(cm): ");
        scanner.nextInt();

        System.out.println("财富(千万): ");
        scanner.nextDouble();

        System.out.println("帅否(true/false): ");
        scanner.nextBoolean();
    */
    public class ScannerExer1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入你的身高(cm): ");
            int height = scanner.nextInt();

            System.out.println("请输入你的财富(以千万为单位): ");
            double wealth = scanner.nextDouble();

            System.out.println("帅否(true/false): ");
            boolean isHandsome = scanner.nextBoolean();

            if (height >= 180 && wealth >= 1.0 && isHandsome) {
                System.out.println("我一定要嫁给他");
            } else if (height >= 180 || wealth >= 1.0 || isHandsome) {
                System.out.println("嫁吧, 比上不足, 比下有余");
            } else {
                System.out.println("不嫁");
            }
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422111812.png)

<div class="br"></div>

2.  练习 2

    ```java
    /*
      我家的狗 5 岁了, 5 岁的狗相当于人类多大呢? 其实, 狗的前两年每一年相当于人类的 10.5 岁,
      之后每增加一年就增加四岁。那么 5 岁的狗相当于人类多少年龄呢?
      应该是: 10.5 + 10.5 + 4 + 4 + 4 = 33 岁

      编写一个程序, 获取用户输入的狗的年龄, 通过程序显示其相当于人类的年龄。
      如果用户输入负数, 请显示一个提示信息。
    */
    public class ScannerExer2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入狗狗的年龄: ");
            int dogAge = scanner.nextInt();

            if (dogAge < 0) {
                System.out.println("你输入的狗狗的年龄不合法");
            } else if (dogAge <= 2) {
                System.out.println("相当于人的年龄: " + (dogAge * 10.5));
            } else {
                System.out.println("相当于人的年龄: " + (2 * 10.5 + (dogAge - 2) * 4));
            }

            scanner.close();
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422112417.png)