# 第七节 运算符（Operator）【掌握】

- 运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等。

- 运算符的分类：

  - 按照<strong style="color: #f3514f;">功能</strong>分为：算术运算符、赋值运算符、比较（或关系）运算符、逻辑运算符、条件运算符、Lambda 运算符。

    |             分类             | 运算符                                                                          |
    | :--------------------------: | ------------------------------------------------------------------------------- |
    |      算术运算符（7 个）      | \+、\-、\*、\/、\%、\+\+、\-\-                                                  |
    |     赋值运算符（12 个）      | \=、\+\=、\-\=、\*\=、\/\=、\%\=、\>\>\=、\<\<\=、\>\>\>\=、\&\=、\|\=、\^\= 等 |
    | 比较（或关系）运算符（6 个） | \>、\>\=、\<、\<\=、\=\=、\!\=                                                  |
    |      逻辑运算符（6 个）      | \&、\|、\^、\!、\&\&、\|\|                                                      |
    |       位运算符（7 个）       | \&、\|、\^、\~、\<\<、\>\>、\>\>\>                                              |
    |      条件运算符（1 个）      | (条件表达式) ? 结果 1 : 结果 2                                                  |

  - 按照<strong style="color: #f3514f;">操作数个数</strong>分为：一元运算符（单目运算符）、二元运算符（双目运算符）、三元运算符（三目运算符）

    |           分类           | 运算符                                   |
    | :----------------------: | ---------------------------------------- |
    | 一元运算符（单目运算符） | \+、\-、\+\+、\-\-、\!、\~               |
    | 二元运算符（双目运算符） | 除了一元和三元运算符剩下的都是二元运算符 |
    | 三元运算符（三目运算符） | (条件表达式) ? 结果 1 : 结果 2           |

## 1、算术运算符

### ① 基本语法

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240415162130.png)

- 举例 1：加减乘除模

  ```java
  public class ArithmeticTest1 {
      public static void main(String[] args) {
          int a = 3;
          int b = 4;

          System.out.println(a + b); // 7
          System.out.println(a - b); // -1
          System.out.println(a * b); // 12
          System.out.println(a / b); // 0
          System.out.println(a % b); // 3

          System.out.println(5 % 2); // 1
          System.out.println(5 % -2); // 1
          System.out.println(-5 % 2); // -1
          System.out.println(-5 % -2); // -1
      }
  }
  ```

  ::: tip 取模小技巧：
  `a % b = a - a / b * b`

  结果与 a（被取模数）符号相同
  :::

- 举例 2：+ 号的两种用法

  - 第一种：对于 + 两边都是数值的话，+ 就是加法的意思

  - 第二种：对于 + 两边至少有一边是字符串的话，+ 就是拼接的意思

    ```java
    public class ArithmeticTest2 {
        public static void main(String[] args) {
            String str1 = "Java";
            System.out.println(str1 + 520); // Java520
            System.out.println(str1 + 5 + 20); // Java520
            System.out.println(5 + 20 + str1); // 25Java
            System.out.println(5 + "Java" + 20); // 5Java20
        }
    }
    ```

- 举例 3：自加自减运算

  理解：++ 运算，表示自增 1。同理，-- 运算，表示自减 1，用法与 ++ 一致。

  1.  单独使用

      - 变量在单独运算的时候，变量前++和变量后++，是没有区别的。

      - 变量前 ++，例如：++a。

      - 变量后++，例如：a++。

      ```java
      public class ArithmeticTest3 {
          public static void main(String[] args) {
              int a = 3;
              // ++a;
              a++;

              // 无论是变量前 ++ 还是变量后 ++, 结果都是 4
              System.out.println(a);
          }
      }
      ```

  2.  复合使用

      - 和其他变量放在一起使用或者输出语句放在一起使用，前 ++ 和后 ++ 就产生了不同。

      - 变量前 ++：变量先自增 1，然后再运算。

      - 变量后 ++：变量先运算，然后再自增 1。

      ```java
      public class ArithmeticTest4 {
          public static void main(String[] args) {
              int x = 3;
              // int y = ++x; // y = 4, x = 4
              int y = x++; // y = 3, x = 4

              System.out.println(x);
              System.out.println(y);

              System.out.println("============");

              int z = 5;

              // System.out.println(++z); // 输出结果是6, z的值也是6
              System.out.println(z++); // 输出结果是5, z的值是6

              System.out.println(z); // 6
          }
      }
      ```

### ② 案例与练习

- 案例 1

  ```java
  /*
    随意给出一个整数, 打印显示它的个位数, 十位数, 百位数的值。

    格式如下:
      数字 xxx 的情况如下:
      个位数:
      十位数:
      百位数:

    例如:
      数字 153 的情况如下:
      个位数: 3
      十位数: 5
      百位数: 1
  */
  public class ArithmeticExercise1 {
      public static void main(String[] args) {
          int num = 187;
          int bai = num / 100 % 10;
          int shi = num / 10 % 10;
          int ge = num % 10;

          System.out.println("百位数: " + bai); // 1
          System.out.println("十位数: " + shi); // 8
          System.out.println("个位数: " + ge); // 7
      }
  }
  ```

  ::: tip 求第几位数小技巧：
  求千位数：`num / 1000 % 10`

  求百位数：`num / 100 % 10`

  求十位数：`num / 10 % 10`

  求个位数：`num / 1 % 10`
  :::

- 案例 2：为抵抗洪水，战士连续作战 89 小时，编程计算共多少天零多少小时？

  ```java
  public class ArithmeticExercise2 {
      public static void main(String[] args) {
          int hours = 89;
          int day = 89 / 24;
          int hour = hours % 24;

          System.out.println(hours + "是" + day + "天" + hour + "小时");
      }
  }
  ```

- 练习 1：算术运算符：自加、自减

  ```java
  public class ArithmeticExercise3 {
      public static void main(String[] args) {
          int i1 = 10;
          int i2 = 20;
          int i = i1++;

          System.out.println("i = " + i); // 10
          System.out.println("i1 = " + i1); // 11

          i = ++i1;
          System.out.println("i = " + i); // 12
          System.out.println("i1 = " + i1); // 12

          i = i2--;
          System.out.println("i = " + i); // 20
          System.out.println("i2 = " + i2); // 19

          i = --i2;
          System.out.println("i = " + i); // 18
          System.out.println("i2 = " + i2); // 18
      }
  }
  ```

- 练习 2

  ```java
  System.out.println("5 + 5 = " + 5 + 5); // 5 + 5 = 55
  ```

- 练习 3

  ```java
  byte b1 = 127;
  b1++;
  System.out.println("b1 = " + b1); // -128
  ```

- 练习 4

  ```java
  int i = 1;
  int j = i++ + ++i * i++;

  System.out.println("j = " + j); // j = 10 → 1 + 3 * 3 = 10
  ```

- 练习 5：（企业真题）写出下列程序的输出结果

  ```java
  int i = 2;
  int j = i++;

  System.out.println(j); // 2

  int m = 2;
  m = m++;
  System.out.println(m); // 2

  /*
  * 1. 先取 m 的值 2 放操作数栈
  * 2. m 再自增, m = 3
  * 3. 再把操作数栈中的 2 赋值给 m
  */

  /* ⬇ */

  /**
  * 1. m = 2
  * 2. temp = m++
  * 3. m = temp
  */
  ```

## 2、赋值运算符

### ① 基本语法

- 符号：`=`

  - 当 = <strong style="color: #f3514f;">两侧数据类型不一致</strong>时，可以使用<strong style="color: #f3514f;">自动类型转换</strong>或使用<strong style="color: #f3514f;">强制类型转换</strong>原则进行处理。

  - 支持连续赋值。

- 扩展赋值运算符：`+=`、`-=`、`*=`、`/=`、`%=`

  | 扩展赋值运算符 | 符号解释                                                         |
  | :------------: | ---------------------------------------------------------------- |
  |      \+\=      | 将符号左边的值和右边的值进行相加操作，最后将结果赋值给左边的变量 |
  |      \-\=      | 将符号左边的值和右边的值进行相减操作，最后将结果赋值给左边的变量 |
  |      \*\=      | 将符号左边的值和右边的值进行相乘操作，最后将结果赋值给左边的变量 |
  |      \/\=      | 将符号左边的值和右边的值进行相除操作，最后将结果赋值给左边的变量 |
  |      \%\=      | 将符号左边的值和右边的值进行取余操作，最后将结果赋值给左边的变量 |

- ```java
  public class SetValueTest1 {
      public static void main(String[] args) {
          int i1 = 10;
          long l1 = i1; // 自动类型转换

          byte b1 = (byte) i1; // 强制类型转换

          int i2 = i1;

          /* 连续赋值的测试 */
          // 以前的写法
          int a1 = 10;
          int b1 = 10;

          // 连续赋值的写法
          int a2, b2;
          a2 = b2 = 10;

          int a3 = 10, b3 = 20;

          /* 举例说明 +=、-=、*=、/=、%= */
          int m1 = 10;
          m1 += 5; // 类似于 m1 = m1 + 5 的操作, 但不等同于
          System.out.println(m1); // 15

          /* 练习1: 开发中, 如何实现一个变量 +2 的操作 */

          // += 的操作不会改变变量本身的数据类型。其它扩展的运算符也如此。
          // 写法1: 推荐
          short s1 = 10;
          s1 += 2; // 编译通过, 因为在得到 int 类型的结果后, JVM 自动完成一步强制类型转换, 将 int 类型强转成 short
          System.out.println(s1); // 12

          // 写法2:
          short s2 = 10;
          // s2 = s2 + 2; // 编译报错, 因为将 int 类型的结果赋值给 short 类型的变量 s2 时, 可能损失精度
          s2 = (short) (s2 + 2);
          System.out.println(s2); // 12

          /* 练习2: 开发中, 如何实现一个变量 +1 的操作呢? */
          // 写法1: 推荐
          int num1 = 10;
          num1++;
          System.out.println(num1); // 11

          // 写法:
          int num2 = 10;
          num2 += 1;
          System.out.println(num2); // 11

          // 写法3:
          int num3 = 10;
          num3 = num3 + 1;
          System.out.println(num3); // 11
      }
  }
  ```

### ② 练习

- 练习 1

  ```java
  short s = 3;
  // s = s + 2; // ① 编译报错
  s += 2; // ② 正常执行

  /**
  * ① 和 ② 有什么区别?
  * ①: s 为 short 型 跟 int 型的 2 相加, 结果为 int 型, 赋值给了 short 型, 小装大, 编译报错
  * ②: s += 2, s + 2 的结果为 int 型, JVM 再自动完成强制类型转换, 把 int 型转成 short 型赋值给 s
  */
  ```

- 练习 2

  ```java
  int i = 1;
  i *= 0.1;
  System.out.println(i); // 0

  i++;
  System.out.println(i); // 1
  ```

- 练习 3

  ```java
  int m = 2;
  int n = 3;
  n *= m++; // n = n * m++;
  System.out.println("m = " + m); // 3
  System.out.println("n = " + n); // 6
  ```

- 练习 4

  ```java
  int n = 10;
  n += (n++) + (++n); // n = n + (n++) + (++n)
  System.out.println(n); // 32
  ```

- 练习 5

  ```java
  public class MinusTest {
      public static void main(String[] args) {
          // 练习1: 变量值减1
          short s1 = 10;
          // 方式1:
          // s1 = (short) (s1 - 1);

          // 方式2: 推荐
          s1--; // 或 --s;

          // 方式3:
          s1 -= 1;

          // 练习2: 变量值减2
          short s2 = 10;
          // 方式1:
          // s2 = (short) (s2 - 2);

          // 方式2: 推荐
          s2 -= 2;
      }
  }
  ```

## 3、比较（关系）运算符

- 比较运算符的结果都是 boolean 型，也就是要么 true，要么是 false。

- `>`、`<`、`>=`、`<=`：只适用于基本数据类型（除 boolean 类型之外）`==`、`!=`：适用于基本数据类型和引用数据类型。

- 比较运算符 `==` 不能误写成 `=`

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416090609.png)

- 举例

  ```java
  public class CompareTest {
      public static void main(String[] args) {
          int i1 = 10;
          int i2 = 20;

          System.out.println(i1 == i2); // false
          System.out.println(i1 != i2); // true
          System.out.println(i1 >= i2); // false

          System.out.println("============");

          int m = 10;
          int n = 20;

          System.out.println(m == n); // false
          System.out.println(m = n); // 20 把 n 的变量值赋值给 m, 并输出 m 变量的值

          System.out.println("============");

          boolean b1 = false;
          boolean b2 = true;

          System.out.println(b1 == b2); // false
          System.out.println(b1 = b2); // true 把 b2 的变量值赋值给 b1 变量, 并输出 b1 变量的值
      }
  }
  ```

- 思考

  ```java
  boolean b1 = false;
  // 区分好 == 和 = 的区别
  if (b1 == true) // if (b1 = true)
    System.out.println("结果为真");
  else
    System.out.println("结果为假");
  ```

## 4、逻辑运算符

### ① 基本语法

- 逻辑运算符，操作的都是 boolean 类型的变量或常量，而且运算的结果也是 boolean 类型的值。

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416091401.png)

- 运算符说明：

  - **`&`** 和 **`&&`**：表示<strong style="color: #f3514f;">且</strong>关系，当符号左右<strong style="color: #f3514f;">两边布尔值都是 true</strong> 时，结果才能为 <strong style="color: #f3514f;">true</strong>。否则，为 false。

  - **`|`** 和 **`||`**：表示<strong style="color: #f3514f;">或</strong>关系，当符号两边布尔值有<strong style="color: #f3514f;">一边为 true</strong> 时，结果为 <strong style="color: #f3514f;">true</strong>。当<strong style="color: #f3514f;">两边都为 false</strong> 时，结果为 <strong style="color: #f3514f;">false</strong>。

  - **`!`**：表示<strong style="color: #f3514f;">非</strong>关系，当变量<strong style="color: #f3514f;">布尔值为 true</strong> 时，结果为 <strong style="color: #f3514f;">false</strong>。当变量<strong style="color: #f3514f;">布尔值为 false</strong> 时，结果为 <strong style="color: #f3514f;">true</strong>。

  - **`^`**：当符号左右<strong style="color: #f3514f;">两边布尔值不同</strong>时，结果为 <strong style="color: #f3514f;">true</strong>。当<strong style="color: #f3514f;">两边布尔值相同</strong>时，结果为 <strong style="color: #f3514f;">false</strong>。

    理解：异或，追求的是异

- 逻辑运算符用于连接布尔型表达式，在 Java 中不可以写成 3 < x < 6，应该写成 x > 3 & x < 6。

- 区分 **`&`** 和 **`&&`**：

  - 相同点：如果符号左边是 true，则二者都执行符号右边的操作。

  - 不同点：

    - `&`：如果符号左边是 false，则继续执行符号右边的操作。

    - `&&`：如果符号左边是 false，则不再继续执行符号右边的操作。

  ::: tip 建议：
  开发中，推荐使用 **`&&`**
  :::

- 区分 **`|`** 和 **`||`**：

  - 相同点：如果符号左边是 false，则二者都执行符号右边的操作。

  - 不同点：

    - `|`：如果符号左边是 true，则继续执行符号右边的操作。

    - `||`：如果符号左边是 true，则不再继续执行符号右边的操作。

  ::: tip 建议
  开发中，推荐使用 **`||`**
  :::

- 代码举例

  ```java
  public class LoginTest {
      public static void main(String[] args) {
          int a = 3;
          int b = 4;
          int c = 5;

          // & 与, 且; 有 false 则 false
          System.out.println((a > b) & (a > c)); // false
          System.out.println((a > b) & (a < c)); // false
          System.out.println((a < b) & (a > c)); // false
          System.out.println((a < b) & (a < c)); // true

          System.out.println("============");

          // | 或; 有 true 则 true
          System.out.println((a > b) | (a > c)); // false
          System.out.println((a > b) | (a < c)); // true
          System.out.println((a < b) | (a > c)); // true
          System.out.println((a < b) | (a < c)); // true

          System.out.println("============");

          // ^ 异或; 相同为 false, 不同为 true
          System.out.println((a > b) ^ (a > c)); // false
          System.out.println((a > b) ^ (a < c)); // true
          System.out.println((a < b) ^ (a > c)); // true
          System.out.println((a < b) ^ (a < c)); // false

          // ! 非; 非 false 则 true, 非 true 则 false
          System.out.println(!false); // true
          System.out.println(!true); // false

          // & 和 && 的区别
          System.out.println((a > b) & (a++ > c)); // false
          System.out.println("a = " + a); // 4
          System.out.println((a > b) || (a++ > c)); // false
          System.out.println("a = " + a); // 5
          System.out.println((a == b) || (a++ > c)); // false
          System.out.println("a = " + a); // 6
      }
  }
  ```

### ② 案例与练习

- 案例

  ```java
  /*
    1. 定义类 CompareLogicExer
    2. 定义 main 方法
    3. 定义一个 int 类型变量 a, 变量 b, 都赋值为 20
    4. 定义 boolean 类型变量 bo1, 判断 ++a 是否被 3 整除, 并且 a++ 是否被 7 整除,
      将结果赋值给 bo1
    5. 输出 a 的值, bo1 的值
    6. 定义 boolean 类型变量 bo2, 判断 b++ 是否被 3 整除, 并且 ++b 是否被 7 整除,
      将结果赋值给 bo2
    7. 输出 b 的值, bo2 的值
   */
  // 1.定义类 CompareLogicExer
  public class CompareLogicExer {

      // 2.定义 main 方法
      public static void main(String[] args) {

          // 3.定义一个 int 类型变量 a, 变量 b, 都赋值为 20
          int a = 20, b = 20;

          // 4.定义 boolean 类型变量 bo1, 判断 ++a 是否被 3 整除, 并且 a++ 是否被 7 整除,
          //   将结果赋值给 bo1
          boolean bo1 = ++a % 3 == 0 && a++ % 7 == 0;

          // 5.输出 a 的值, bo1 的值
          System.out.println("a = " + a); // a = 22
          System.out.println("bo1 = " + bo1); // bo1 = true

          // 6.定义 boolean 类型变量 bo2, 判断 b++ 是否被 3 整除, 并且 ++b 是否被 7 整除,
          //   将结果赋值给 bo2
          boolean bo2 = b++ % 3 == 0 && ++b % 7 == 0;

          // 7.输出 b 的值, bo2 的值
          System.out.println("b = " + b); // b = 21
          System.out.println("bo2 = " + bo2); // bo2 = false

      }
  }
  ```

- 练习 1：区分 & 和 &&

  ```java
  int x = 1;
  int y = 1;

  if (x++ == 2 & ++y == 2) {
      x = 7;
  }

  System.out.println("x = " + x + ", y = " + y); // x = 2, y = 2
  ```

  ```java
  int x = 1, y = 1;

  if (x++ == 2 && ++y == 2) {
      x = 7;
  }

  System.out.println("x = " + x + ", y = " + y); // x = 2, y = 1
  ```

- 练习 2：区分 | 和 ||

  ```java
  int x = 1, y = 1;

  if (x++ == 1 | ++y == 1) {
      x = 7;
  }

  System.out.println("x = " + x + ", y = " + y); // x = 7, y = 2
  ```

  ```java
  int x = 1, y = 1;

  if (x++ == 1 || ++y == 1) {
      x = 7;
  }

  System.out.println("x = " + x + ", y = " + y); // x = 7, y = 1
  ```

- 练习 3：程序输出

  ```java
  public class Test {
      public static void main(String[] args) {
          boolean x = true;
          boolean y = false;
          short z = 42;

          if ((z++ == 42) && (y = true)) {
          z++;
          }

          if ((x = false) || (++z == 45)) {
          z++;
          }

          System.out.println("z = " + z); // z = 46
      }
  }
  ```

## 5、位运算符（难点、非重点）

### ① 基本语法

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416094823.png)

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416094839.png)

- ::: info 🚩
  <strong style="color: #f3514f;">位运算符的运算过程都是基于二进制的补码运算</strong>
  :::

- 左移：**`<<`**

  运算规则：在一定范围内，数据每向左移动一位，相当于原数据 \* 2。（正数、负数都适用）

  ::: warning 注意
  当左移的位数 n 超过该数据类型的总位数时，相当于左移（n - 总位数）位
  :::

  - ```java
    3 << 4 类似于 3 * 2 的 4 次幂 => 3 * 16 = 48
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416100120.png)

  - ```java
    -3 << 4 类似于 -3 * 2 的 4 次幂 => -3 * 16 = -48
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416100215.png)

- 右移：**`>>`**

  运算规则：在一定范围内，数据每向右移动一位，相当于原数据 / 2。（正数、负数都适用）

  ::: warning 注意
  如果不能整数，向下取整。
  :::

  - ```java
    69 >> 4 类似于 69 / 2 的 4 次幂 => 69 / 16 = 4
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416100529.png)

  - ```java
    -69 >> 4 类似于 -69 / 2 的 4 次幂 => -69 / 16 = -5
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416100600.png)

- 无符号右移：**`>>>`**

  运算规则：往右移动后，左边空出来的位直接补 0。（正数、负数都适用）

  - ```java
    69 >>> 4 类似于 69 / 2 的 4 次幂 => 69 / 16 = 4
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416100835.png)

  - ```java
    -69 >>> 4 结果: 268435451
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416100912.png)

- 按位与：**`&`**

  运算规则：对应位都是 1 才为 1，否则为 0。

  - 1 & 1 结果为 1

  - 1 & 0 结果为 0

  - 0 & 1 结果为 0

  - 0 & 0 结果为 0

  - ```java
    9 & 7 = 1
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416103442.png)

  - ```java
    -9 & 7 = 7
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416104437.png)

- 按位或：**`|`**

  运算规则：对应位只要有 1 即为 1，否则为 0。

  - 1 | 1 结果为 1

  - 1 | 0 结果为 1

  - 0 | 1 结果 1

  - 0 & 0 结果为 1

  - ```java
    9 | 7 = 15
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416104752.png)

  - ```java
    -9 | 7 = -9
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105032.png)

- 按位异或：**`^`**

  运算规则：对应位一个为 1 一个为 0，才为 1，否则为 0。

  - 1 ^ 1 结果为 0

  - 1 ^ 0 结果为 1

  - 0 ^ 1 结果为 1

  - 0 ^ 1 结果为 1

  - ```java
    9 ^ 7 = 14
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105423.png)

  - ```java
    -9 ^ 7 = -16
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105450.png)

- 按位取反：**`~`**

  运算规则：对应位为 1，则结果为 0；对应位为 0，则结果为 1。

  - ~0 就是 1

  - ~1 就是 0

  - ```java
    ~9 = -10
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105618.png)

  - ```java
    ~-9 = 8
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105643.png)

### ② 举例

- 举例 1

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105717.png)

- 举例 2：体会 m = k ^ n = (m ^ n) ^ n

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416105833.png)

### ③ 案例

- 案例 1：高校的方式计算 2 \* 8 的值（经典面试题）

  ```java
  2 << 3 或 8 << 1
  ```

- 案例 2：如何交换两个 int 型变量的值？String 呢？

  ```java
  public class BitExer {
      public static void main(String[] args) {
          int m = 10;
          int n = 5;

          System.out.println("m = " + m + ", n = " + n);

          /* 推荐, 实现方式1:
          优点: 容易理解, 适用于不同数据类型
          缺点: 需要额外定义变量 */
          int temp = m;
          m = n;
          n = temp;

          System.out.println("m = " + m + ", n = " + n);

          /* 实现方式2:
          优点: 没有额外定义变量
          缺点: 可能超出 int 的范围; 只能适用于数值类型 */
          m = m + n;
          n = m - n;
          m = m - n;

          System.out.println("m = " + m + ", n = " + n);

          /* 实现方式3:
          优点: 没有额外定义变量
          缺点: 不易理解; 只能适用于数值类型 */
          m = m ^ n;
          n = m ^ n;
          m = m ^ n;

          System.out.println("m = " + m + ", n = " + n);
      }
  }
  ```

## 6、条件运算符

### ① 基本语法

- 条件运算符格式：

  ```java
  (条件表达式) ? 表达式1 : 表达式2
  ```

- 说明：条件表达式是 boolean 类型的结果，根据 boolean 的值选择表达式 1 或表达式 2

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240416110709.png)

- 如果运算后的结果赋给新的变量，要求表达式 1 和表达式 2 为同种或兼容的类型

  ```java
  int i = (1 == 2 ? 100 : 200);
  System.out.println(i); // 200

  boolean marry = false;
  System.out.println(marry ? "已婚" : "未婚"); // 未婚

  double d1 = (m1 > m2) ? 1 : 2.0;
  System.out.println(d1);

  int num = 12;
  System.out.println(num > 0 ? true : "num非正数");
  ```

### ② 案例

- 案例 1：获取两个数中的较大值

  ```java
  public class ConditionExer1 {
      public static void main(String[] args) {
          int m1 = 10;
          int m2 = 20;

          int max1 = (m1 > m2) ? m1 : m2
          System.out.println("m1 和 m2 中的较大值为" + max1);
      }
  }
  ```

- 案例 2：获取三个数中的最大值

  ```java
  public ConditionExer2 {
      public static void main(String[] args) {
          int n1 = 23;
          int n2 = 13;
          int n3 = 33;

          // 写法 1:
          int tempMax = (n1 > n2) ? n1 : n2;
          int finalMax = (tempMax > n3) ? tempMax : n3;
          System.out.println("三个数中最大值为：" + finalMax);

          // 写法 2: 不推荐, 可读性差
          int finalMax1 = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
          System.out.println("三个数中最大值为：" + finalMax1);
      }
  }
  ```

- 案例 3：今天是周 2，10 天以后是周几？

  要求：控制台输出“今天是周 2，10 天以后是周 x”。

  ```java
  public class ConditionExer3 {
      public static void main(String[] args) {
          int week = 2;
          week += 10;
          week %= 7;

          System.out.println("今天是周 2，10 天以后是周" + (week == 0 ? "日" : week));
      }
  }
  ```

### ③ 与 if-else 的转换关系

- 凡是可以使用条件运算符的地方，都可以改成为 if-else 结构。反之，不成立。

  ::: tip 🚩
  开发中，如果既可以使用条件运算符，又可以使用 if-else，<strong style="color: #f3514f;">推荐使用条件运算符</strong>。因为执行效率稍高。
  :::

  ```java
  // if-else 实现获取两个数的较大值
  int i1 = 10;
  int i2 = 20;

  int max; // 声明变量 max, 用于记录 i1 和 i2 的较大值

  if (i1 > i2) {
      max = i1；
  } else {
      max = i2;
  }

  System.out.println(max);
  ```

## 7、运算符优先级

- 运算符有不同的优先级，所谓优先级就是在表达式运算中的运算符顺序。

- 上一行中的运算符总是优先于下一行的。

  | 优先级 | 运算符说明       | Java 运算符                          |
  | :----: | ---------------- | ------------------------------------ |
  |   1    | 括号             | \(\)、\[\]、\{\}                     |
  |   2    | 正负号           | \+、\-                               |
  |   3    | 单元运算符       | \+\+、\-\-、\~、\!                   |
  |   4    | 乘法、除法、求余 | \*、\/、\%                           |
  |   5    | 加法、减法       | \+、\-                               |
  |   6    | 移位运算符       | \<\<、\>\>、\>\>\>                   |
  |   7    | 关系运算符       | \<、\<\=、\>\=、\>、instanceof       |
  |   8    | 等价运算符       | \=\=、\!\=                           |
  |   9    | 按位与           | \&                                   |
  |   10   | 按位异或         | \^                                   |
  |   11   | 按位或           | \|                                   |
  |   12   | 条件与           | \&\&                                 |
  |   13   | 条件或           | \|\|                                 |
  |   14   | 三元运算符       | \? \:                                |
  |   15   | 赋值运算符       | \=、\+\=、\-\=、\*\=、\/\=、\%\=     |
  |   16   | 位赋值运算符     | \&\=、\|\=、\<\<\=、\>\>\=、\>\>\>\= |

- ::: tip 开发建议
  1.  不要过多的依赖运算的优先级来控制表达式的执行顺序，这样可读性太差，尽量<strong style="color: #f3514f;">使用( )来控制</strong>表达式的执行顺序。

  2.  不要把一个表达式写得过于复杂，如果一个表达式过于复杂，则把它<strong style="color: #f3514f;">分成几步</strong>来完成。
    
      例如：`(num1 + num2) * 2 > num3 && num2 > num3 ? num3 : num1 + num2;`
  :::
