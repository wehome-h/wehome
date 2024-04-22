# 第五节 break 和 continue 的使用

## 1、break 和 continue 的说明

|          | 适用范围             | 在循环结构中适用的作用                 | 相同点                       |
| :------: | -------------------- | -------------------------------------- | ---------------------------- |
|  break   | switch-case 循环结构 | 一旦执行，就结束（或）跳出当前循环结构 | 此关键字的后面，不能声明语句 |
| continue | 循环结构             | 一旦执行，就结束（或跳出）当次循环结构 | 此关键字的后面，不能声明语句 |

此外，很多语言都有 goto 语句，goto 语句可以随意将控制转移到程序中的任意一条语句上，然后执行它，但使程序容易出错。Java 中的 break 和 continue 是不同于 goto 的。

## 2、应用举例

```java
public class BreakContinueTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                // break; 123
                continue; // 123567910
                // 如下的语句不可能被执行, 编译不通过
                // System.out.println("~~~");
            }
            System.out.print(i);
        }

        System.out.println();
        System.out.println("###");

        for (int i = 1; i <= 4; i ++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    // break; // 结束的是包裹 break 关键字的最近的一层循环
                    continue; // 结束的是包裹 continue 关键字的最近的一层循环的当次 
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422083941.png)

## 3、带标签的使用

::: raw

<h6>
  <span class="title">break</span>
</h6>

break 语句用于终止某个语句块的执行。

```java
{
    // code
    break;
}
```

<div class="br"></div>

break 语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块。

```java
label1: {
    // code
    label2: {
        // code
        label3: {
            // code
            break label2;
        }
    }
}
```

<h6>
  <span class="title">break</span>
</h6>

:::

::: raw

<h6>
  <span class="title">continue</span>
</h6>

continue 语句出现在多层嵌套的循环语句体中时，也可以通过标签指明要跳过的是哪一层循环。

标号语句必须紧接在循环的头部。标号语句不能用在非循环语句的前面。

举例：

```java
public class BreakContinueTest2 {
    public static void main(String[] args) {
        l:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    // break l;
                    continue l;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```

<h6>
  <span class="title">continue</span>
</h6>

:::

## 4、经典案例

题目：找出 100 以内所有的素数（质数）？100000 以内的呢？

目的：不同的代码的实现方式，可以效率差别很大。

分析：素数（质数）：只能被 1 和它本身整除的自然数。→ 从 2 开始，到这个数 -1 为止，此范围内没有这个数的约数。则此数是一个质数。

比如：2、3、5、7、11、13、17、19、23、……

实现方式 1

```java
public class PrimeNumberTest {
    public static void main(String[] args) {
        // 记录当前时间距离1970-1-1 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        int count = 0; // 记录质数的个数

        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true; // 用于标识i是否被除尽过
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) { // 表明i有约数
                    isFlag = false;
                }
            }

            // 判断i是否是质数
            if (isFlag) {
                count++;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("执行此程序花费的毫秒数为: " + (end - start));
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422104845.png)

<div class="br"></div>

实现方式 2：针对实现方式 1 进行优化

```java
public class PrimeNumberTest1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;

        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }

            if (isFlag) {
                count++;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("执行此程序花费的毫秒数为: " + (end - start));
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422104953.png)

<div class="br"></div>

实现方式 3（选做）：使用 continue + 标签

```java
public class PrimeNumberTest2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;

        label: 
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("执行此程序花费的毫秒数为: " + (end - start));
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422105041.png)

## 5、练习

1.  练习 1

    ```java
    /*
      生成 1-100 之间的随机数, 直到生成了 97 这个数, 看看一共用了几次
      提示: 使用 (int) (Math.random() * 100) + 1
    */
    public class NumberGuessTest {
        public static void main(String[] args) {
            int count = 0;

            while(true) {
                int random = (int) (Math.random() * 100) + 1;
                count++;
                if (random == 97) {
                    break;
                }
            }

            System.out.println("直到生成随机数97, 一共用了" + count + "次");
        }
    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422110245.png)