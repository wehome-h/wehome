# 第五节 方法（method）

## 1、方法的引用

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424141901.png)

《街霸》游戏中，每次人物出拳、出脚或跳跃等动作都需要编写 50-80 的代码，在每次出拳、出脚或跳跃的地方都需要重复地编写这 50-80 行代码，这样程序会变得很臃肿，可读性也非常差。为了解决代码重复编写的问题，可以将出拳、出脚或跳跃的代码提取出来放在一个 {} 中，并为这段代码起个名字，这样在每次的出拳、出脚或跳跃的地方通过这个名字来调用这个 {} 的代码就可以了。

上述过程中，所提取出来的代码可以被看作是程序中定义的一个方法，程序在需要出拳、出脚或跳跃时调用该方法即可。

## 2、方法（method、函数）的理解

方法是类或对象行为特征的抽象，用来完成某个功能操作。在某些语言中也称为函数或过程。

将功能封装为方法的目的是，可以实现代码重用，减少冗余，简化代码。

Java里的方法不能独立存在，所有的方法必须定义在类里。

<div class="br"></div>

举例 1：

- Math.random() 的 random() 方法

- Math.sqrt(x) 的 sqrt(x) 方法

- System.out.println(x) 的 println(x) 方法

- new Scanner(System.in).nextInt() 的 nextInt() 方法

- Arrays 类中的 binarySearch() 方法、sort() 方法、equals() 方法

<div class="br"></div>

举例 2：

```java
public class Person {

    private int age;

    public int getAge() { // 声明方法 getAge()
        return age;
    }

    public void setAge(int i) { // 声明方法 setAge()
        age = i; // 将参数 i 的值赋值给类的成员变量 age
    }

}
```

## 3、如何声明方法

::: raw

<h6>
  <span class="title">声明方法的语法格式</span>
</h6>

```java
[修饰符] 返回值类型 方法名([形参列表]) [throws 异常列表] {
    方法体的功能代码
}
```

一个完整的方法 = 方法头 + 方法体

- 方法头就是 `[修饰符] 返回值类型 方法名([形参列表]) [throws 异常列表]`，也称为<strong style="color: #f3514f;">方法签名</strong>。通常调用方法时只需要关注方法头就可以，从方法头可以看出这个方法的功能和调用格式。

  方法头可能包含 5 个部分

  1.  <strong style="color: #f3514f;">修饰符</strong>：可选的。方法的修饰符也有很多，例如：public、protected、private、static、abstract、native、final、synchronized 等。

      - 其中，权限修饰符有public、protected、private

      - 其中，根据是否有static，可以将方法分为静态方法和非静态方法。其中静态方法又称为类方法，非静态方法又称为实例方法

  2.  <strong style="color: #f3514f;">返回值类型</strong>：表示方法运行的结果的数据类型，方法执行后将结果返回到调用者。

      - 无返回值：则声明：void

      - 有返回值，则声明出返回值类型（可以是任意类型）。与方法体中“return 返回值”搭配使用

        > [!NOTE] 关于方法体中 return 语句的说明
        >
        > - return 语句的作用是结束方法的执行，并将方法的结果返回去
        >
        > - 如果返回值类型不是 void，方法体中必须保证一定有 return 返回值; 语句，并且要求该返回值结果的类型与声明的返回值类型一致或兼容
        >
        > - 如果返回值类型为 void 时，方法体中可以没有 return 语句，如果要用 return 语句提前结束方法的执行，那么 return 后面不能跟返回值，直接写 return; 就可以
        >
        > - return 语句后面就不能再写其它代码了，否则会报错：Unreachable code

      补充：方法的分类：按照是否有形参及返回值

      ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424144715.png)

  3.  <strong style="color: #f3514f;">方法名</strong>：属于标识符，命名时遵循标识符命名规则和规范，“见名知意”

  4.  <strong style="color: #f3514f;">形参列表</strong>：表示完成方法体功能时需要外部提供的数据列表。可以包含零个，一个或多个参数

      - 无论是否有参数，( ) 不能省略

      - 如果有参数，每一个参数都要指定数据类型和参数名，多个参数之间使用逗号分隔，例如：

        - 一个参数：(数据类型 参数名)

        - 二个参数：(数据类型1 参数1, 数据类型2 参数2)

      - 参数的类型可以是基本数据类型、引用数据类型

  5.  <strong style="color: #f3514f;">throws 异常列表</strong>：可选

<div class="br"></div>

- 方法体就是方法被调用后要执行的代码。对于调用者来说，不了解方法体如何实现的，并不影响方法的使用。

  方法体：方法体必须由 { } 括起来，在 { } 中编写完成方法功能的代码


<h6>
  <span class="title">声明方法的语法格式</span>
</h6>

:::

类比举例

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424144852.png)

<div class="br"></div>

代码示例

```java
public class MethodDefineDemo {

    /**
     * 无参无返回值方法的演示
     */
    public void sayHello() {
        System.out.println("hello");
    }

    /**
     * 有参无返回值方法的演示
     *
     * @param length int 第一个参数, 表示矩形的长
     * @param width  int 第二个参数, 表示矩形的宽
     * @param sign   char 第三个参数, 表示填充矩形图形的符号
     */
    public void printRectangle(int length, int width, char sign) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    /**
     * 无参有返回值方法的演示
     *
     * @return
     */
    public int getIntBetweenOneToHundred() {
        return (int) (Math.random() * 100 + 1);
    }

    /**
     * 有参有返回值方法的演示
     *
     * @param a int 第一个参数, 要比较大小的整数之一
     * @param b int 第二个参数, 要比较大小的整数之二
     * @return int 比较大小的两个整数中较大的值
     */
    public int max(int a, int b) {
        return a > b ? a : b;
    }

}
```

## 4、如何调用实例方法

方法通过方法名被调用，且只有被调用才会执行。

方法调用语法格式：

```java
对象.方法名([实参列表]);
```

<div class="br"></div>

示例：

1.  举例 1

    ::: code-group

    ```java [MethodDefineDemo.java]
    public class MethodDefineDemo {

        /**
         * 无参无返回值方法的演示
        */
        public void sayHello() {
            System.out.println("hello");
        }

        /**
         * 有参无返回值方法的演示
        *
        * @param length int 第一个参数, 表示矩形的长
        * @param width  int 第二个参数, 表示矩形的宽
        * @param sign   char 第三个参数, 表示填充矩形图形的符号
        */
        public void printRectangle(int length, int width, char sign) {
            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <= width; j++) {
                    System.out.print(sign);
                }
                System.out.println();
            }
        }

        /**
         * 无参有返回值方法的演示
        *
        * @return
        */
        public int getIntBetweenOneToHundred() {
            return (int) (Math.random() * 100 + 1);
        }

        /**
         * 有参有返回值方法的演示
        *
        * @param a int 第一个参数, 要比较大小的整数之一
        * @param b int 第二个参数, 要比较大小的整数之二
        * @return int 比较大小的两个整数中较大的值
        */
        public int max(int a, int b) {
            return a > b ? a : b;
        }

    }
    ```

    ```java [MethodInvokeDemo.java]
    public class MethodInvokeDemo {

        public static void main(String[] args) {
            // 创建对象
            MethodDefineDemo md = new MethodDefineDemo();

            // 调用 MethodDefineDemo 类中无参无返回值的方法 sayHello
            md.sayHello();
            md.sayHello();
            md.sayHello();
            // 调用一次, 执行一次, 不调用不执行

            // 调用 MethodDefineDemo 类中有参无返回值的方法 printRectangle
            md.printRectangle(5, 10, '@');

            // 调用 MethodDefineDemo 类中无参有返回值的方法 getIntBetweenOneToHundred
            md.getIntBetweenOneToHundred(); // 语法没问题, 就是结果丢失

            int num = md.getIntBetweenOneToHundred();
            System.out.println("num = " + num);

            System.out.println(md.getIntBetweenOneToHundred());
            // 上面的代码调用了 getIntBetweenOneToHundred 三次, 这个方法执行了三次

            // 调用 MethodDefineDemo 类中有参有返回值的方法 max
            md.max(3, 6); // 语法没问题, 就是结果丢失

            int bigger = md.max(5, 6);
            System.out.println("bigger = " + bigger);

            System.out.println("8, 3中较大者是: " + md.max(8, 3));
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424145645.png)

<div class="br"></div>

2.  举例 2

    ```java
    // 1.创建 Scanner 的对象
    Scanner input = new Scanner(System.in); // System.in 默认代表键盘输入

    // 2.提示输入 xx
    System.out.print("请输入一个整数: "); // 对象.非静态方法(实参列表)

    // 3.接收输入内容
    int num = input.nextInt(); // 对象.非静态方法()
    ```

## 5、使用的注意点

1.  必须先声明后使用，且方法必须定义在类的内部。

2.  调用一次就执行一次，不调用不执行。

3.  方法中可以调用类中的方法或属性，不可以在方法内部定义方法。

<div class="br"></div>

正确示例：

```java
类 {

    方法1() {

    }

    方法2() {

    }

}
```

<div class="br"></div>

错误示例：

```java
类 {

    方法1() {
        方法2() { // 位置错误

        }
    }

}
```

## 6、关键字 return 的使用

return 在方法中的作用：

1.  作用 1：结束一个方法

2.  作用 2：结束一个方法的同时，可以返回数据给方法的调用者

<div class="br"></div>

注意点：在 return 关键字的直接后面不能声明执行语句

## 7、方法调用内存分析

方法<strong style="color: #f3514f;">没有被调用</strong>的时候，都在<strong style="color: #f3514f;">方法区</strong>中的字节码文件（.class）中存储。

方法被<strong style="color: #f3514f;">调用</strong>的时候，需要进入到<strong style="color: #f3514f;">栈内存中</strong>运行。方法每调用一次就会在栈中有一个<strong style="color: #f3514f;">入栈</strong>动作，即给当前方法开辟一块独立的内存区域，用于存储当前方法的局部变量的值。

当<strong style="color: #f3514f;">方法执行结束</strong>后，会释放该内存，称为<strong style="color: #f3514f;">出栈</strong>，如果方法有返回值，就会把结果返回调用处，如果没有返回值，就直接结束，回到调用处继续执行下一条指令。

栈结构：<strong style="color: #f3514f;">先进后出，后进先出</strong>。

<div class="br"></div>

举例分析：

```java
public class Person {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
    }

    public static void eat() {
        sleep();
        System.out.println("人: 吃饭");
    }

    public static void sleep() {
        System.out.println("人: 睡觉");
        doSport();
    }

    public static void doSport() {
        System.out.println("人: 运动");
    }

}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424151403.png)

内存分析：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424151432.png)

## 8、练习

1.  练习 1：创建一个 Person 类，其定义如下：

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424151539.png)

    要求：

    1.  创建 Person 类的对象，设置该对象的 name、age 和 sex 属性，调用 study 方法，输出字符串“studying”，调用 showAge() 方法显示 age 值，调用 addAge() 方法给对象的 age 属性值增加 2 岁。

    2.  创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。

    ::: code-group

    ```java [Person.java]
    public class Person {
        String name;
        int age;
        int sex;

        public void study() {
            System.out.println("studying");
        }

        public void showAge() {
            System.out.println("age = " + age);
        }

        public int addAge(int i) {
            age += i;
            return age;
        }
    }
    ```

    ```java [PersonTest.java]
    // 测试类
    public class PersonTest {

        public static void main(String[] args) {
            Person p1 = new Person();
            p1.name = "wehome";
            p1.age = 20;
            p1.sex = 1;

            p1.study();
            p1.showAge();
            System.out.println(p1.name + "原来" + p1.age + "岁, 增加两岁后是" + p1.addAge(2) + "岁");

            System.out.println();

            Person p2 = new Person();
            p2.name = "jerry";
            p2.age = 18;
            p2.sex = 0;

            p2.study();
            p2.showAge();
            System.out.println(p2.name + "原来" + p2.age + "岁, 增加两岁后是" + p2.addAge(2) + "岁");
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424152412.png)

<div class="br"></div>

2.  练习 2：利用面向对象的编程方法，设计圆类 Circle，包含属性（半径）和计算圆面积的方法。定义测试类，创建该 Circle 类的对象，并进行测试。

    ::: code-group

    ```java [Circle.java]
    public class Circle {

        double radius;

        public double getCircleArea() {
            return Math.PI * Math.pow(radius, 2.0);
        }

    }
    ```

    ```java [CircleTest.java]
    public class CircleTest {

        public static void main(String[] args) {
            Circle c1 = new Circle();
            c1.radius = 2;
            double area1 = c1.getCircleArea();
            System.out.println("半径为" + c1.radius + "圆的面积为 = " + area1);

            Circle c2 = new Circle();
            c2.radius = 4;
            double area2 = c2.getCircleArea();
            System.out.println("半径为" + c2.radius + "圆的面积为 = " + area2);
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424152745.png)

<div class="br"></div>

3.  练习 3

    1.  编写程序，声明一个 method 方法，在方法中打印一个 10 x 8 的 ★ 矩形外，在 main 方法中调用该方法。

    2.  修改上一个程序，在 method 方法中，除打印一个 10 x 8 的 ★ 矩形外，再计算该矩形的面积，并将其作为方法返回值。在 main 方法中调用该方法，接收返回的面积值并打印。

    3.  修改上一个程序，在 method 方法提供 m 和 n 两个参数，方法中打印一个 m x n 的 ★ 矩形，并计算该矩形的面积，将其作为方法返回值。在 main 方法中调用该方法，接收返回的面积值并打印。

    ```java
    public class printRectangleTest {

        public static void main(String[] args) {
            // 1
            method1();

            // 2
            int area = method2();
            System.out.println("长为10宽为8的矩形面积为: " + area);

            // 3
            int m = 5;
            int n = 5;
            int area2 = method3(m, n);
            System.out.println("长为" + n + "宽为" + m + "的矩形面积为: " + area2);
        }

        /* 1: */
        public static void method1() {
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("★");
                }
                System.out.println();
            }
        }

        /* 2: */
        public static int method2() {
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("★");
                }
                System.out.println();
            }

            return 8 * 10;
        }

        /* 3: */
        public static int method3(int m, int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("★");
                }
                System.out.println();
            }

            return n * m;
        }

    }
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424153507.png)

<div class="br"></div>

4.  练习 4：声明一个日期类型 MyDate：有属性：年 year，月 month，日 day。创建 2 个日期对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。

    ::: code-group

    ```java [MyDate.java]
    public class MyDate {

        int year;
        int month;
        int day;

        public void showMessage() {
            System.out.println(year + "年" + month + "月" + day + "日");
        }

    }
    ```

    ```java [MyDateTest.java]
    public class MyDateTest {

        public static void main(String[] args) {
            MyDate myDate = new MyDate();
            myDate.year = 1999;
            myDate.month = 2;
            myDate.day = 29;
            myDate.showMessage();

            System.out.println();

            MyDate youDate = new MyDate();
            youDate.year = 2000;
            youDate.month = 8;
            youDate.day = 12;
            youDate.showMessage();
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424153810.png)

<div class="br"></div>

5.  练习 5：用面向对象的方式编写用户登录程序。

    用户类：

    - 属性：用户名，密码

    - 方法：登录

    界面类：

    - 在界面类中添加 main 方法，接收用户输入，并调用用户类的登录方法进行验证。

      - 输出：

        登录失败：用户名或密码错误！

        登录成功：欢迎你，用户名！

    ::: code-group

    ```java [User.java]
    public class User {

        String name; // 用户名
        String password; // 密码

        /**
         * 实现用户登录的判断
        *
        * @param inputName 输入的用户名
        * @param inputPwd  输入的密码
        */
        public void login(String inputName, String inputPwd) {
            if (name.equals(inputName) && password.equals(inputPwd)) {
                System.out.println("登录成功: 欢迎你, " + name);
            } else {
                System.out.println("登录失败: 用户名或密码错误!");
            }
        }

        /**
         * 实现用户登录的判断
        *
        * @param inputName 输入的用户名
        * @param inputPwd  输入的密码
        * @return true: 登录成功 false: 登录失败
        */
        public boolean login1(String inputName, String inputPwd) {
            return name.equals(inputName) && password.equals(inputPwd);
        }

    }
    ```

    ```java [UserInterface.java]
    /**
     * 用户界面类 UserInterface:
    * <p>
    * 在用户界面类中添加 main 方法, 接收用户输入, 并调用用户类的登录方法进行验证
    * 输入:
    * 登录失败: 用户名或密码错误!
    * 登录成功: 欢迎你, 用户名!
    */
    public class UserInterface {

        public static void main(String[] args) {
            User u1 = new User();
            u1.name = "wehome";
            u1.password = "abc123";

            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入用户名: ");
            String name = scanner.next();
            System.out.print("请输入密码: ");
            String password = scanner.next();

            // 演示1:
            u1.login(name, password);

            // 演示2:
            boolean isLogin = u1.login1(name, password);
            if (isLogin) {
                System.out.println("登录成功: 欢迎你, " + u1.name);
            } else {
                System.out.println("登录失败: 用户名或密码错误!");
            }

            scanner.close();
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424154511.png)