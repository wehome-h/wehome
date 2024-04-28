# 第五节 关键字：super

## 1、super 的理解

在 Java 类中使用 super 来调用父类中的指定操作：

- super 可用于访问父类中定义的属性

- super 可用于调用父类中定义的成员方法

- super 可用于在子类构造器中调用父类的构造器

<div class="br"></div>

注意：

- 尤其当子父类出现同名成员时，可以用 super 表明调用的是父类中的成员

- super 的追溯不仅限于直接父类

- super 和 this 的用法相像，this 代表本类对象的引用，super 代表父类的内存空间的标识

## 2、super 的使用场景

### ① 子类中调用父类被重写的方法

- 如果子类没有重写父类的方法，只要权限修饰符允许，在子类中完全可以直接调用父类的方法；

- 如果子类重写了父类的方法，在子类中需要通过 `super.` 才能调用父类被重写的方法，否则默认调用的子类重写的方法

<div class="br"></div>

举例：

::: code-group

```java [Phone.java]
public class Phone {

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void call() {
        System.out.println("打电话");
    }

    public void showNum() {
        System.out.println("来电显示号码");
    }

}
```

```java [SmartPhone.java]
// smartphone: 智能手机
public class SmartPhone extends Phone {

    // 重写父类的来电显式功能的方法
    public void showNum() {
        // 来电显式姓名和图片功能
        System.out.println("显示来电姓名");
        System.out.println("显示头像");

        // 保留父类来电显示号码的功能
        super.showNum(); // 此处必须加 super. 否则就是无限递归, 那么就会栈内存溢出
    }

}
```

:::

<div class="br"></div>

总结：

- 方法前面没有 super. 和 this.

  先从子类找匹配方法，如果没有，再从直接父类找，再没有，继续往上追溯

- 方法前面有 this.

  先从子类找匹配方法，如果没有，再从直接父类找，再没有，继续往上追溯

- 方法前面有 super.

  从当前子类的直接父类找，如果没有，继续往上追溯

### ② 子类中调用父类中同名的成员变量

- 如果实例变量与局部变量重名，可以在实例变量前面加 this. 进行区别

- 如果子类实例变量和父类实例变量重名，并且父类的该实例变量在子类仍然可见，在子类中要访问父类声明的实例变量需要在父类实例变量前加 super.，否则默认访问的是子类自己声明的实例变量

- 如果父子类实例变量没有重名，只要权限修饰符允许，在子类中完全可以直接访问父类中声明的实例变量，也可以用 this. 实例访问，也可以用 super. 实例变量访问

<div class="br"></div>

举例：

::: code-group

```java [Father.java]
public class Father {

    int a = 10;
    int b = 11;

}
```

```java [Son.java]
public class Son extends Father {

    int a = 20;

    public void test() {
        // 子类与父类的属性同名, 子类对象中就有两个 a
        System.out.println("子类的a: " + a); // 20 先从局部变量找, 没有再从本类成员变量找
        System.out.println("子类的a: " + this.a); // 20 先从本类成员变量找
        System.out.println("父类的a: " + super.a); // 10 直接从父类成员变量找

        // 子类与父类的属性不同名, 是同一个 b
        System.out.println("b = " + b); // 11 先从局部变量找, 没有再从本类成员变量找, 没有再从父类找
        System.out.println("b = " + this.b); // 11 先从本类成员变量找, 没有再从父类找
        System.out.println("b = " + super.b); // 11 直接从父类成员变量找
    }

    public void method(int a, int b) {
        // 子类与父类的属性同名, 子类对象中就有两个成员变量 a, 此时方法中还有一个局部变量 a
        System.out.println("局部变量的a: " + a); // 30 先从局部变量
        System.out.println("子类的a: " + this.a); // 20 先从本类成员变量找
        System.out.println("父类的a: " + super.a); // 10 直接从父类成员变量找

        System.out.println("b = " + b); // 13 先找局部变量
        System.out.println("b = " + this.b); // 11 先从本类成员变量找
        System.out.println("b = " + super.b); // 11 直接从父类成员变量找
    }

}
```

```java [Test.java]
public class Test {

    public static void main(String[] args) {
        Son son = new Son();
        son.test();
        son.method(30, 13);
    }

}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428170918.png)

<div class="br"></div>

总结：起点不同（就近原则）

- 变量前面没有 super. 和 this.

  - 在构造器、代码块、方法中如果出现使用某个变量，先查看是否是当前块声明的局部变量

  - 如果不是局部变量，先从当前执行代码的本类去找成员变量

  - 如果从当前执行代码的本类中没有找到，会往上找父类声明的成员变量（权限修饰符允许在子类中访问的）

- 变量前面有 this.

  - 通过 this 找成员变量时，先从当前执行代码的本类去找成员变量

  - 如果从当前执行代码的本类中没有找到，会往上找父类声明的成员变量（权限修饰符允许在子类中访问的）

- 变量前面 super.

  - 通过 super 找成员变量，直接从当前执行代码的直接父类去找成员变量（权限修饰符允许在子类中访问的）

  - 如果直接父类没有，就去父类的父类中找（权限修饰符允许在子类中访问的）

<div class="br"></div>

> [!NOTE] 特别说明
> 应该避免子类声明和父类重名的成员变量

在阿里的开发规范等文档中都做出明确说明：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428171150.png)

### ③ 子类构造器中调用父类构造器

1.  子类继承父类时，不会继承父类的构造器。只能通过“super(形参列表)”的方式调用父类指定的构造器。

2.  规定：“super(形参列表)”，必须声明在构造器的首行。

3.  我们前面讲过，在构造器的首行可以使用“this(形参列表)”，调用本类中重载的构造器，结合 2，结论：在构造器的首行，“this(形参列表)”和“super(形参列表)”只能二选一。

4.  如果在子类构造器的首行既没有显式调用“this(形参列表)”，也没有显式调用“super(形参列表)”，则子类此构造器默认调用“super()”，即调用父类中空参的构造器。

5.  由 3 和 4 得到结论：子类的任何一个构造器中，要么会调用本类中重载的构造器，要么会调用父类的构造器。只能是这两种情况之一。

6.  由 5 得到：一个类中声明有 n 个构造器，最多有 n-1 个构造器中使用了“this(形参列表)”，则剩下的那个一定使用“super(形参列表)”。

<div class="br"></div>

> 开发中常见错误：
>
> 如果子类构造器中既未显式调用父类或本类的构造器，且父类中又没有空参的构造器，则编译出错。

<br>

情景举例 1：

::: code-group

```java [A.java]
public class A {

}
```

```java [B.java]
public class B extends A {

}
```

```java [Test01.java]
public class Test01 {
    public static void main(String[] args) {
        B b = new B();

        /*
          A 类和 B 类都是默认有一个无参构造, B 类的默认无参构造中还会默认调用 A 类的默认无参构造
          但是因为都是默认的, 没有打印语句, 看不出来
        */
    }
}
```

:::

<div class="br"></div>

情景举例 2：

::: code-group

```java [A.java]
public class A {
    A() {
      System.out.println("A 类无参构造器");
    }
}
```

```java [B.java]
public class B extends A {

}
```

```java [Test02.java]
public class Test02 {
    public static void main(String[] args) {
        B b = new B();

        /*
          A 类显式声明一个无参构造, B 类默认有一个无参构造,
          B 类的默认无参构造中会默认调用 A 类的无参构造, 可以看到会输出 A 类无参构造器
        */
    }
}
```

:::

<div class="br"></div>

情景举例 3：

::: code-group

```java [A.java]
public class A {
    public A() {
        System.out.println("A 类无参构造器");
    }
}
```

```java [B.java]
public class B extends A {
    public B() {
        System.out.println("B 类无参构造器");
    }
}
```

```java [Test03.java]
public class Test03 {
    public static void main(String[] args) {
        B b = new B();

        /*
          A 类显式声明一个无参构造, B 类显式声明一个无参构造
          B 类的无参构造中虽然没有写 super(), 但是仍然会默认调用 A 类的无参构造
          可以看到输出 A 类无参构造器和 B 类无参构造器
        */
    }
}
```

:::

<div class="br"></div>

情景举例 4：

::: code-group

```java [A.java]
public class A {
    public A() {
        System.out.println("A 类无参构造器");
    }
}
```

```java [B.java]
public class B extends A {
    public B() {
        super();
        System.out.println("B 类无参构造器");
    }
}
```

```java [Test04.java]
public class Test04 {
    public static void main(String[] args) {
        B b = new B();

        /*
          A 类显式声明一个无参构造, B 类显式声明一个无参构造
          B 类的无参构造中明确写了 super(), 表示调用 A 类的无参构造
          可以看到会输出 A 类无参构造器和 B 类无参构造器
        */
    }
}
```

:::

<div class="br"></div>

情景举例 5：

::: code-group

```java [A.java]
public class A {
    public A(int a) {
        System.out.println("A 类有参构造器");
    }
}
```

```java [B.java]
public class B extends A {
    public B() {
        System.out.println("B 类无参构造器");
    }
}
```

```java [Test05.java]
public class Test05 {
    public static void main(String[] args) {
        B b = new B();

        /*
          A 类显式声明一个有参构造, 没有写无参构造, 那么 A 类就没有无参构造了
          B 类显式声明一个无参构造
          B 类的无参构造没有写 super(), 表示默认调用 A 类的无参构造
          编译报错, 因为 A 类没有无参构造
        */
    }
}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428172850.png)

<div class="br"></div>

情景举例 6：

::: code-group

```java [A.java]
public class A {
    public A(int a) {
        System.out.println("A 类有参构造器");
    }
}
```

```java [B.java]
public class B extends A {
    public B() {
        super();
        System.out.println("B类无参构造器");
    }
}
```

```java [Test06.java]
public class Test06 {
    public static void main(String[] args) {
        B b = new B();

        /*
          A 类显式声明一个有参构造, 没有写无参构造, 那么 A 类就没有无参构造了
          B 类显式声明一个无参构造
          B 类无参构造明确写 super(), 表示调用 A 类的无参构造
          编译报错, 因为 A 类没有无参构造
        */
    }
}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428173159.png)

<div class="br"></div>

情景举例 7：

::: code-group

```java [A.java]
public class A {
    public A(int a) {
        System.out.println("A 类有参构造器");
    }
}
```

```java [B.java]
public class B extends A {
    public B(int a) {
        super(a);
        System.out.println("B 类有参构造器");
    }
}
```

```java [Test07.java]
public class Test07 {
    public static void main(String[] args) {
        B b = new B(10);

        /*
          A 类显式声明一个有参构造, 没有写无参构造, 那么 A 类就没有无参构造了
          B 类显式声明一个有参构造
          B 类的有参构造明确写 suepr(a), 表示调用 A 类的有参构造
          会打印 A 类有参构造器和 B 类有参构造器
        */
    }
}
```

:::

<div class="br"></div>

情景举例 8：

::: code-group

```java [A.java]
public class A {
    public A() {
        System.out.println("A 类无参构造器");
    }

    public A(int a) {
        System.out.println("A 类有参构造器");
    }
}
```

```java [B.java]
public class B extends A {
    public B() {
        super(); // 可以省略, 调用父类的无参构造
        System.out.println("B 类无参构造器");
    }

    public B(int a) {
        super(a);
        System.out.println("B 类有参构造器");
    }
}
```

```java [Test08.java]
public class Test08 {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(10);
    }
}
```

:::

## 3、小结：this 与 super

1.  this 和 super 的意义

    this：当前对象

    - 在构造器和非静态代码块中，表示正在 new 的对象

    - 在实例方法中，表示调用当前方法的对象

    super：引用父类声明的成员

<div class="br"></div>

2.  this 和 super 的使用格式

    this

    - this.成员变量：表示当前对象的某个成员变量，而不是局部变量

    - this.成员方法：表示当前对象的某个成员方法，完全可以省略 this.

    - this() 或 this(实参列表)：调用另一个构造器协助当前对象的实例化，只能在构造器首行，只会找本类的构造器，找不到就报错

    super

    - super.成员变量：表示当前对象的某个成员变量，该成员变量在父类中声明的

    - super.成员方法：表示当前对象的某个成员方法，该成员方法在父类中声明的

    - super() 或 super(实参列表)：调用父类的构造器协助当前对象的实例化，只能在构造器首行，只会找直接父类的对应构造器，找不到就报错

## 4、练习

1.  练习 1：修改方法重写练习 2 中定义的类 Kids 中 employeed() 方法，在该方法中调用父类 ManKind 的 employeed() 方法，然后再输出“but Kids should study and no job.”

    ```java
    public class Kids extends ManKind {
        @Override
        public void employeed() {
            super.employeed();

            System.out.println("but Kids should study and no job.");
        }
    }
    ```

<div class="br"></div>

2.  修改继承中的练习 3 中定义的 Cylinder 类，在 Cylinder 类中覆盖 findArea() 方法，计算圆柱的表面积。考虑：findVolume() 方法怎样做相应的修改？

    在 CylinderTest 类中创建 Cylinder 类的对象，设置圆柱的底面半径和高，并输出圆柱的表面积和体积。

    附加题：在 CylinderTest 类中创建一个 Circle 类的对象，设置圆的半径，计算输出圆的面积。体会父类和子类成员的分别调用。

    ::: code-group

    ```java [Circle.java]
    public class Circle {

        private double radius;

        Circle() {
            radius = 1;
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

    }
    ```

    ```java [Cylinder.java]
    public class Cylinder extends Circle {

        private double length;

        Cylinder() {
            length = 1;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public double findVolume() {
            return super.findArea() * length;
        }

        @Override
        public double findArea() {
            return 2 * super.findArea() + 2 * Math.PI * super.getRadius() * length;
        }

    }
    ```

    ```java [CylinderTest.java]
    public class CylinderTest {

        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder();

            cylinder.setRadius(2.0);
            cylinder.setLength(4.0);

            System.out.println("圆柱的表面积: " + cylinder.findArea() + ", 体积: " + cylinder.findVolume());

            Circle circle = new Circle();
            circle.setRadius(2.0);
            System.out.println("圆的面积: " + circle.findArea());
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428174531.png)

<div class="br"></div>

3.  练习 3：

    1.  写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter() 和 setter() 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法 deposit()。

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428174634.png)

        写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、年利率 4.5%的 Account 对象。使用 withdraw() 方法提款 30000 元，并打印余额。

        再使用 withdraw() 方法提款 2500，使用 deposit() 方法存款 3000 元，然后打印余额和月利率。

        提示：在提款方法 withdraw() 中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。

        运行结果如图所示：

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428174728.png)

    2.  创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性 overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw() 方法，其算法如下：

        ```
        如果(取款金额 < 账户金额), 可直接取款
        如果(取款金额 > 账户余额), 计算需要透支的额度,
                        判断可透支额 overdraft 是否足够支付本次透支需要
                        如果可以: 将账户余额修改为 0, 冲减可透支金额
                        如果不可以: 提示用户超过可透支额的限额
        ```

        要求：写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账户为 1122、余额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。

        使用 withdraw() 方法提款 5000 元，并打印账户余额和可透支额。

        再使用 withdraw() 方法提款 18000 元，并打印账户余额和可透支额。

        再使用 withdraw() 方法提款 3000 元，并打印账户余额和可透支额。

        提示：

        1.  子类 CheckAccount 的构造方法需要将父类继承的 3 个属性和子类自己的属性全部初始化。

        2.  父类 Account 的属性 balance 被设置为 private，但在子类 CheckAccount 的 withdraw() 方法中需要修改它的值，因此应修改父类的 balance 属性，定义其为 protected。

        运行结果如下图所示：

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240428174947.png)
