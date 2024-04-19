# 第三点 基本数据类型与 String 的运算

## 1、字符串类型：String

String 不是基本数据类型，属于引用数据类型。

<div class="br"></div>

使用一对 `""` 来表示一个字符串，内部可以包含 0 个、1 个或多个字符。

<div class="br"></div>

声明方式与基本数据类型类似。例如：String str = "hello world";

## 2、运算规则

1.  任意八种基本数据类型的数据与 String 类型只能进行连接 + 运算，且结果一定也是 String 类型。

    ```java
    System.out.println("" + 1 + 2); // 12

    int num = 10;
    boolean b1 = true;
    String s1 = "abc";

    String s2 = s1 + num + b1;
    System.out.println(s2); // abc10true

    //String s3 = num + b1 + s1; // 编译不通过, 因为 int 类型不能与 boolean 运算
    String s4 = num + (b1 + s1); // 编译通过
    ```

    <div class="br"></div>

2.  String 类型不能通过强制类型 ( ) 转换，转为其它的类型。

    ```java
    String str = "123";
    int num = (int) str; // 编译不通过

    int num = Integer.parseInt(str); // 123
    ```

## 3、案例与练习

::: raw

<h6>
  <span class="title">案例</span>
</h6>

公安局身份登记

要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用 true 表示，单身用 false 表示）、联系方式等等。

```java
public class Info {
    public static void main(String[] args) {
        String name = "wehome";
        int age = 20;
        char gender = '男';
        double weight = 121.5;
        boolean isMarried = false;
        String phone = "13099999999";

        System.out.println("name = " + name + ", age = " + age +
        ", gender = " + gender + ", weight = " + weight +
        ", isMarried = " + isMarried + ", phone = " + phone);
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240414174156.png)

<h6>
  <span class="title">案例</span>
</h6>

:::

::: raw

<h6>
  <span class="title">练习</span>
</h6>

1.  练习 1

    ```java
    String str1 = 4; // 错误

    String str2 = 3.5f + ""; // 正确

    System.out.println(str2); // 3.5
    System.out.println(3 + 4 + "Hello!"); // 7Hello!
    System.out.println("Hello!" + 3 + 4); // Hello!34
    System.out.println('a' + 1 + "Hello!"); // 98Hello!
    System.out.println("Hello" + 'a' + 1); // Helloa1
    ```

    <div class="br"></div>

2.  练习 2

    ```java
    System.out.println("*   *"); // *   *
    System.out.println("*\t*"); // *    *
    System.out.println("*" + "\t" + "*"); // *  *
    System.out.println('*' + "\t" + "*"); // *  *
    System.out.println('*' + '\t' + "*"); // 51*
    System.out.println('*' + "\t" + '*'); // *  *
    System.out.println("*" + '\t' + '*'); // *  *
    System.out.println('*' + '\t' + '*'); // 93
    ```

<h6>
  <span class="title">练习</span>
</h6>