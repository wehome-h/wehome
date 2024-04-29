# 第一节 关键字：static

回顾类中的实例变量（即非 static 的成员变量）

```java
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
```

创建两个 Circle 对象：

```java
Circle c1 = new Circle(2.0); // c1.radius = 2.0
Circle c2 = new Circle(3.0); // c2.radius = 3.0
```

Circle 类中的变量 radius 是一个实例变量（instance variable），它属于类的每一个对象，c1 中的 radius 变量不会影响 c2 的 radius，反之亦然。

> [!IMPORTANT] 🚩
> 如果想要让一个成员变量被类的所有实例所共享，就用 static 修饰即可，称为类变量（或类属性）！

## 1、类属性、类方法的设计思想

当我们编写一个类时，其实就是在描述其对象的属性和行为，而并没有产生实质上的对象，只有通过 new 关键字才会产出对象，这时系统才会分配内存空间给对象，其方法才可以供外部调用。我们有时候希望无论是否产生了对象或无论产生了多少对象的情况下，<strong style="color: #f3514f;">某些特定的数据在内存空间里只有一份</strong>。例如，所有的中国人都有个国家名称，每一个中国人都共享这个国家名称，不必在每一个中国人的实例对象中都单独分配一个用于代表国家名称的变量。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429151031.png)

此外，在类中声明的实例方法，在类的外面必须要先创建对象，才能调用。但是有些方法的调用者和当前类的对象无关，这样的方法通常被声明为<strong style="color: #f3514f;">类方法</strong>，由于不需要创建对象就可以调用类方法，从而简化了方法的调用。

这里的类变量、类方法，只需要使用 static 修饰即可。所以也称为静态变量、静态方法。

## 2、static 关键字

使用范围：

在 Java 类中，可用 static 修饰属性、方法、代码块、内部类

<div class="br"></div>

被修饰后的成员具备以下特点：

- 随着类的加载而加载

- 优先于对象存在

- 修饰的成员，被所有对象所共享

- 访问权限允许时，可不创建对象，直接被类调用

## 3、静态变量

### ① 语法格式

使用 static 修饰的成员变量就是静态变量（或类变量、类属性）

```java
[修饰符] class 类 {
    [其他修饰符] static 数据类型 变量名;
}
```

### ② 静态变量的特点

- 静态变量的默认值规则和实例变量一样。

- 静态变量值是所有对象共享。

- 静态变量在本类中，可以在任意方法、代码块、构造器中直接使用。

- 如果权限修饰符允许，在其他类可以通过“类名.静态变量”直接访问，也可以通过“对象.静态变量”的方式访问（但是更推荐使用类名.静态变量的方式）。

- 静态变量的 get() / set() 方法也可以是静态的，当局部变量与静态变量<strong style="color: #f3514f;">重名</strong>时，使用“`类名.静态变量`”进行区分。

### ③ 举例

1.  举例 1：

    ::: code-group

    ```java [Chinese.java]
    public class Chinese {

        // 实例变量
        public String name;
        public int age;

        // 类变量
        public static String nation; // 国籍

        public Chinese() {
        }

        public Chinese(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Chinese{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    ```

    ```java [StaticTest.java]
    public class StaticTest {

        public static void main(String[] args) {
            Chinese c1 = new Chinese("张飞", 20);
            c1.nation = "中国";

            Chinese c2 = new Chinese("关羽", 23);

            System.out.println(c1);
            System.out.println(c2);

            System.out.println(Chinese.nation);
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429152126.png)

    对应的内存结构：（以金典的 JDK6 内存解析为例，此时静态变量存储在方法区）

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429152152.png)

<div class="br"></div>

2.  举例 2：

    ::: code-group

    ```java [Employee.java]
    public class Employee {

        // 私有化, 在类的外面必须使用 get() / set() 方法的方式来访问静态变量
        private static int total;

        // 缺省权限修饰符, 是为了方便类以 类名.静态变量 的方式访问
        static String company;

        private int id;

        private String name;

        public Employee() {
            total++;
            // 使用total静态变量的值为id属性赋值
            id = total;
        }

        public Employee(String name) {
            this();
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getTotal() {
            return total;
        }

        public static void setTotal(int total) {
            Employee.total = total;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "total=" + total +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    ```

    ```java [TestStaticVariable.java]
    public class TestStaticVariable {

        public static void main(String[] args) {
            // 静态变量total的默认值是0
            System.out.println("Employee.total = " + Employee.getTotal());

            Employee e1 = new Employee("张三");
            Employee e2 = new Employee("李四");
            // 静态变量company的默认值是null
            System.out.println(e1);
            // 静态变量company的默认值是null
            System.out.println(e2);
            // 静态变量total值是2
            System.out.println("Employee.total = " + Employee.getTotal());

            Employee.company = "wehome we are home";
            // 静态变量company的值是 wehome we are home
            System.out.println(e1);
            // 静态变量company的值是 wehome we are home
            System.out.println(e2);

            // 只要权限修饰符允许, 虽然不推荐, 但是也可以通过 对象.静态变量 的形式来访问
            e1.company = "we are home";
            // 静态变量company的值是 we are home
            System.out.println(e1);
            // 静态变量company的值是 we are home
            System.out.println(e2);
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429152549.png)

### ④ 内存解析

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429152656.png)

## 4、静态方法

### ① 语法格式

用 static 修饰的成员方法就是静态方法。

```java
[修饰符] class 类 {

    [其他修饰符] static 返回值类型 方法名(形参列表) {
        方法体
    }

}
```

### ② 静态方法的特点

- 静态方法在本类的任意方法、代码块、构造器中都可以直接被调用。

- 只要权限修饰符允许，静态方法在其他类中可以通过“类名.静态方法”的方式调用。也可以通过“对象.静态方法”的方式调用（但是更推荐使用类名.静态方法的方式）。

- 在 static 方法内部只能访问类的 static 修饰的属性或方法，不能访问类的非 static 的结构。

- 静态方法可以被子类继承，但不能被子类重写。

- 静态方法的调用都只看编译时类型。

- 因为不需要实例就可以访问 static 方法，因此 static 方法内部不能有 this，也不能有 super。如果有重名问题，使用“类名.”进行区别。

### ③ 举例

::: code-group

```java [Father.java]
public class Father {

    public static void method() {
        System.out.println("Father.method");
    }

    public static void fun() {
        System.out.println("Father.fun");
    }

}
```

```java [Son.java]
public class Son extends Father {

    // @Override 尝试重写静态方法, 加上 @Override 编译报错,
    // 去掉Override不报错, 但是也不是重写
    public static void fun() {
        System.out.println("Son.fun");
    }

}
```

```java [TestStaticMethod.java]
public class TestStaticMethod {
    public static void main(String[] args) {
        Father.method();
        Son.method(); // 继承静态方法

        Father f = new Son();
        f.method(); // 执行Father类中的method
    }
}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429153143.png)

## 5、练习

笔试题：如下程序执行会不会报错

::: code-group

```java [Demo.java]
public class Demo {
    public static void hello() {
        System.out.println("hello!");
    }
}
```

```java [StaticTest.java]
public class StaticTest {
    public static void main(String[] args) {
        Demo test = null;
        test.hello(); // 不会报错, 输出 hello!
    }
}
```

:::

<div class="br"></div>

练习：

编写一个类实现银行账户的概念，包含的属性有“账号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。账号要自动生成。

编写主类，使用银行账户类，输入、输出 3 个储户的上述信息。

考虑：哪些属性可以设计成 static 属性。【利率、最小余额】

```java
public class Account {

    public static double rate;
    public static double minBalance;

    private int id;
    private String password;
    private double balance;

    private static int total;

    public Account() {
        total++;
        id = total;
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
```
