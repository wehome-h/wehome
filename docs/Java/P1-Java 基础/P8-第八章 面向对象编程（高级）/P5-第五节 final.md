# 第五节 final

## 1、final 的意义

final：最终的，不可更改的

## 2、final 的使用

### ① final 修饰符

表示这个类不能被继承，没有子类。提高安全性，提供程序的可读性。

例如：String 类、System 类、StringBuffer 类

```java
final class Eunuch { // 太监类

}

class Son extends Eunuch { // 错误

}
```

### ② final 修饰方法

表示这个方法不能被子类重写。

例如：Object 类中的 getClass()

```java
class Father {

    public final void method() {
        System.out.println("father");
    }

}


class Son extends Father {

    public void method() { // 错误 // [!code error]
        System.out.println("Son");
    }

}
```

### ③ final 修饰变量

final 修饰某个变量（成员变量或局部变量），一旦赋值，它的值就不能被修改，即常量，常量名建议使用大写字母。

例如：final double MY_PI = 3.14;

> 如果某个成员变量用 final 修饰后，没有 set() 方法，并且必须初始化（可以显式赋值、或在初始化块赋值、实例变量还可以在构造器中赋值）

<br>

修饰成员变量：

```java
public final class Test {

    public static int totalNumber = 5;
    public final int ID;

    public Test() {
        ID = ++totalNumber; // 可在构造器中给final修饰的变量赋值
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.ID);
    }

}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240430090008.png)

<div class="br"></div>

修饰局部变量：

```java
public class TestFinal {

    public static void main(String[] args) {
        final int MIN_SCORE;
        MIN_SCORE = 0;
        final int MAX_SCORE = 100;
        MAX_SCORE = 200; // 非法 // [!code error]
    }

}
```

<div class="br"></div>

错误演示：

```java
public class A {

    private final String INFO = "wehome"; // 声明常量

    public void print() {
        // The final field A.INFO cannot be assigned
        INFO = "黄子"; // [!code error]
    }

}
```

## 3、笔试题

1.  题目 1：排错

    ```java
    public class Something {

        public int addOne(final int x) {
            // return ++x; // ❌
            return x + 1; // ✔
        }

    }
    ```

<div class="br"></div>

2.  题目 2：排错

    ```java
    public class Something {

        public static void main(String[] args) {
            Other o = new Other();
            new Something().addOne(o);
        }

        public void addOne(final Other o) {
            // o = new Other(); // ❌
            o.i++; // ✔
        }

    }


    class Other {
        public int i;
    }
    ```
