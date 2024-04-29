# 第八节 Object 类的使用

## 1、如何理解根父类

类 `java.lang.Object` 是类层次结构的根类，即所有其它类的父类。每个类都使用 <strong style="color: #f3514f;">Object 作为超类</strong>。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429105529.png)

Object 类型的变量与除 Object 以外的任意引用数据类型的对象都存在多态引用

```java
method(Object) { // 可以接收任何类作为其参数
  ...
}

Person o = new Person();
method(o);
```

所有对象（包括数组）都实现这个类的方法。

如果一个类没有特别指定父类，那么默认则继承自 Object 类。例如：

```java
public class Person {
    ...
}

// 等价于

public class Person extends Object {
    ...
}
```

## 2、Object 类的方法

根据 JDK 源代码及 Object 类的 API 文档，Object 类当中包含的方法有 11 个。这里我们主要关注其中的 6 个：

### ① equals()（重点）

#### ⑴ ==

- 基本类型比较值：只要两个变量的值相等，即为 true

  ```java
  int a = 5;
  if (a == 6) {
      ...
  }
  ```

- 引用类型比较引用（是否指向同一个对象）：只有指向同一个对象时，== 才返回 true

  ```java
  Person p1 = new Person();
  Person p2 = new Person();

  if (p1 == p2) {
      ...
  }
  ```

  用“==”进行比较时，符号两边的数据类型必须兼容（可自动转换的基本数据类型除外），否则编译出错

<br>

#### ⑵ equals()

所有类都继承了 Object，也就获得了 equals() 方法。还可以重写

只能比较引用类型，Object 类源码中 equals() 的作用与“==”相同：比较是否指向同一个对象

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429110401.png)

格式：obj1.equals(obj2)

特例：当用 equals() 方法进行比较时，对类 File、String、Date 及包装类（Wrapper Class）来说，是比较类型及内容而不考虑引用的是否是同一个对象；

原因：在这些类中重写了 Object 类的 equals() 方法。

当自定义使用 equals() 时，可以重写。用于比较两个对象的“内容”是否都相等

重写 equals() 方法的原则

- <strong style="color: #f3514f;">对称性</strong>：如果 x.equals(y) 返回是“true”，那么 y.equals(x) 也应该返回是“true”

- <strong style="color: #f3514f;">自反性</strong>：x.equals(x) 必须返回是“true”

- <strong style="color: #f3514f;">传递性</strong>：如果 x.equals(y) 返回是“true”，而且 y.equals(z) 返回是“true”，那么 z.equals(x) 也应该返回是“true”

- <strong style="color: #f3514f;">一致性</strong>：如果 x.equals(y) 返回是“true”，只要 x 和 y 内容一直不变，不管你重复 x.equals(y) 多少次，返回都是“true”

- 任何情况下，x.equals(null)，永远返回是“false”

  x.equals(和 x 不同类型的对象) 永远返回是“false”

重写举例：

```java
public class User {

    private String host;
    private String username;
    private String password;

    public User(String host, String username, String password) {
        super();
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public User() {
        super();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [host = " + host + ", username = " + username +
                ", password = " + password + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        User other = (User) obj;
        if (host == null) {
            if (other.host != null) {
                return false;
            }
        } else if (!host.equals(other.host)) {
            return false;
        }

        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }

        if (username == null) {
            if (other.username != null) {
                return false;
            }
        } else if (!username.equals(other.username)) {
            return false;
        }

        return true;
    }

}
```

<div class="br"></div>

面试题：== 和 equals() 的区别

- == 既可以比较基本类型也可以比较引用类型。对于基本类型就是比较值，对于引用类型就是比较内存地址。

- equals() 的话，它是属于 java.lang.Object 类里面的方法，如果该方法没有被重写默认也是 ==；我们可以看到 String 等类的 equals() 方法是被重写过的，而且 String 类在日常开发中用的比较多，久而久之，形成了 equals() 是比较值的错误观点。

- 具体要看自定义类里有没有重写 Object 的 equals() 方法来判断。

- 通常情况下，重写 equals() 方法，会比较类中的相应属性是否都相等。

<br>

1.  练习 1：

    ```java
    int it = 65;
    float f1 = 65.0f;

    System.out.println("65 和 65.0f 是否相等? " + (it == f1)); // true

    char ch1 = 'A';
    char ch2 = 12;
    System.out.println("12 和 ch2 是否相等? " + (12 == ch2)); // true
    System.out.println("ch1 和 ch2 是否相等? " + (ch1 == ch2)); // false
    System.out.println("65 和 'A' 是否相等? " + (it == ch1)); // true

    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println("str1 和 str2 是否相等? " + (str1 == str2)); // false
    System.out.println("str1 是否 equals str2? " + (str1.equals(str2))); // true
    System.out.println("hello" == new java.util.Date()); // 报异常 java: 不可比较的类型: java.lang.String 和 java.util.Date
    ```

<div class="br"></div>

2.  练习 2：

    编写 Order 类，有 int 型的 orderId，String 型的 orderName，相应的 getter() 和 setter() 方法，两个参数的构造器，重写父类的 equals() 方法：public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等。

    ::: code-group

    ```java [Order.java]
    public class Order {

        private int orderId;
        private String orderName;

        public Order() {
        }

        public Order(int orderId, String orderName) {
            this.orderId = orderId;
            this.orderName = orderName;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public String getOrderName() {
            return orderName;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Order order = (Order) obj;
            return orderId == order.orderId && Objects.equals(orderName, order.orderName);
        }

    }
    ```

    ```java [OrderTest.java]
    public class OrderTest {

        public static void main(String[] args) {
            Order order1 = new Order(100, "phone");
            Order order2 = new Order(100, "phone");

            System.out.println(order1 == order2); // false
            System.out.println(order1.equals(order2)); // true

        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429143316.png)

<div class="br"></div>

3.  练习 3：

    请根据以下代码自定义能满足需要的 MyDate 类，在 MyDate 类中覆盖 equals() 方法，使其判断当两个 MyDate 类型对象的年月日都相同时，结果为 true，否则为 false。public boolean equals(Object o)

    ::: code-group

    ```java [MyDate.java]
    public class MyDate {

        private int day;
        private int month;
        private int year;

        public MyDate() {
        }

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MyDate myDate = (MyDate) o;
            return day == myDate.day && month == myDate.month && year == myDate.year;
        }
    }
    ```

    ```java [EqualsTest.java]
    public class EqualsTest {

        public static void main(String[] args) {
            MyDate m1 = new MyDate(14, 3, 1976);
            MyDate m2 = new MyDate(14, 3, 1976);

            if (m1 == m2) {
                System.out.println("m1 == m2");
            } else {
                System.out.println("m1 != m2"); // m1 != m2
            }

            if (m1.equals(m2)) {
                System.out.println("m1 is equals to m2"); // m1 is equal to m2
            } else {
                System.out.println("m1 is not equal to m2");
            }
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429143643.png)

### ② toString()（重点）

方法签名：public String toString()

默认情况下，toString() 返回的是“对象的运行时类型@对象的 hashCode 值的十六进制形式”

在进行 String 与其它类型数据的连接操作时，自动调用 toString() 方法

```java
Date now = new Date();
System.out.println("now = " + now); // now = Wed Sep 20 15:06:40 CST 2023
System.out.println("now = " + now.toString()); // now = Wed Sep 20 15:06:40 CST 2023
```

如果我们直接 System.out.println(对象)，默认会自动调用这个对象的 toString()

> 因为 Java 的引用数据类型的变量中存储的实际上是对象的内存地址，但是 Java 对程序员隐藏内存地址信息，所以不能直接将内存地址显示出来，所以当你打印对象时，JVM 帮你调用了对象的 toString()

可以根据需要在用户自定义类型中重写 toString() 方法，如 String 类重写了 toString() 方法，返回字符串的值。

```java
s1 = "hello";
System.out.println(s1);
// 相当于
System.out.println(s1.toString());
```

例如：自定义的 Person 类：

```java
public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
    }

}
```

<br>

练习：定义两个类，父类 GeometricObject 代表几何形状，子类 Circle 代表圆形。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429144028.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429144041.png)

::: code-group

```java [GeometricObject.java]
public class GeometricObject {

    protected String color;
    protected double weight;

    protected GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

}
```

```java [Circle.java]
public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
```

:::

### ③ clone()

::: code-group

```java [Animal.java]
public class Animal implements Cloneable {

    private String name;

    public Animal() {
        super();
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
```

```java [CloneTest.java]
// Object类的clone()的使用
public class CloneTest {

    public static void main(String[] args) {
        Animal a1 = new Animal("花花");

        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("原始对象: " + a1);

            a2.setName("毛毛");
            System.out.println("clone之后的对象: " + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429144539.png)

### ④ finalize()

当对象被回收时，系统自动调用该对象的 finalize() 方法。（不是垃圾回收器调用的，是本类对象调用的）

> 永远不要主动调用某个对象的 finalize() 方法，应该交给垃圾回收机制调用。

<div class="br"></div>

什么时候被回收：当某个对象没有任何引用时，JVM 就认为这个对象是垃圾对象，就会在之后不确定的时间使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用 finalize() 方法。

<div class="br"></div>

子类可以重写该方法，目的是在对象被清除之前执行必要的清理操作。比如，在方法内断开相关连接资源。

> 如果重写该方法，让一个新的引用变量重新引用该对象，则会重新激活对象。

<div class="br"></div>

在 JDK9 中此方法已经被<strong style="color: #f3514f;">标记为过时</strong>的。

::: code-group

```java [Person.java]
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 子类重写此方法, 可在释放对象前进行某些操作
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放 ————> " + this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
```

```java [FinalizeTest.java]
public class FinalizeTest {

    public static void main(String[] args) {
        Person p = new Person("Peter", 12);
        System.out.println(p);
        p = null; // 此时对象实体就是垃圾对象, 等待被回收. 但时间不确定
        System.gc(); // 强制性释放空间
    }

}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429144932.png)

### ⑤ getClass()

public final Class<?> getClass()：获取对象的运行时类型

> 因为 Java 有多态现象，所以一个引用数据类型的变量的编译时类型与运行时类型可能不一致，因此如果需要查看这个变量实际指向的对象的类型，需要用 getClass() 方法

```java
public static void main(String[] args) {
    Object obj = new Person();
    System.out.println(obj.getClass()); // 运行时类型 class com.wehome.java.Person
}
```

### ⑥ hashCode()

public int hashCode()：返回每个对象的 hash 值

```java
public static void main(String[] args) {
    System.out.println("AA".hashCode()); // 2080
    System.out.println("BB".hashCode()); // 2112
}
```

## 3、native 关键字的理解

使用 native 关键字说明这个方法是原生函数，也就是这个方法是用 <strong style="color: #f3514f;">C/C++</strong> 等非 Java 语言实现的，并且<strong style="color: #f3514f;">被编译成了 DLL</strong>，由 Java 去调用。

- 本地方法是有方法体的，用 C 语言编写。由于本地方法的方法体源码没有对我们开源，所以我们看不到方法体。

- 在 Java 中定义一个 native 方法时，并不提供实现体。

<br>

为什么要用 native 方法

> Java 使用起来非常方便，然而有些层次的任务用 Java 实现起来不容易，或者我们对程序的效率很在意时，例如：Java 需要与一些底层操作系统或某些硬件交换信息时的情况。native 方法正是这样一种交流机制：它为我们提供了一个非常简洁的接口，而且我们无需去了解 Java 应用之外的繁琐的细节。

<br>

native 声明的方法，对于调用者，可以当作和其它 Java 方法一样使用

> native method 的存在并不会对其他类调用这些本地方法产生任何影响，实际上调用这些方法的其他类甚至不知道它所调用的是一个本地方法。JVM 将控制调用本地方法的所有细节。
