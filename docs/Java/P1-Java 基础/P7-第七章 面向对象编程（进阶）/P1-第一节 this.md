# 第一节 关键字：this

## 1、this 是什么？

在 Java 中，this 关键字不算难理解，它的作用和其词义很接近。

- 它在方法（准确的说是实例方法或非 static 的方法）内部使用，表示调用该方法的对象

- 它在构造器内部使用，表示该构造器正在初始化的对象

<div class="br"></div>

this 可以调用的结构：成员变量、方法和构造器

## 2、什么时候使用 this

### ① 实例方法或构造器中使用当前对象的成员

在实例方法或构造器中，如果使用当前类的成员变量或成员方法可以在其前面添加 this，增强程序的可读性。不过，通常我们都习惯省略 this。

但是，当形参与成员变量同名时，如果在方法内或构造器内需要使用成员变量，必须添加 this 来表明该变量是类的成员变量。即：我们可以用 this 来区分<strong style="color: #f3514f;">成员变量</strong>和<strong style="color: #f3514f;">局部变量</strong>。比如：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426162025.png)

另外，使用 this 访问属性和方法时，如果在本类中未找到，会从父类中查找

<br>

1.  举例 1：

    ```java
    public class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void getInfo() {
            System.out.println("姓名: " + name);
            this.speak();
        }

        public void speak() {
            System.out.println("年龄: " + this.age);
        }

    }
    ```

<div class="br"></div>

2.  举例 2：

    ::: code-group

    ```java [Rectangle.java]
    public class Rectangle {

        int length;
        int width;

        public int area() {
            return this.length * this.width;
        }

        public int perimeter() {
            return 2 * (this.length + this.width);
        }

        public void print(char sign) {
            for (int i = 1; i <= this.width; i++) {
                for (int j = 1; j <= this.length; j++) {
                    System.out.print(sign);
                }
                System.out.println();
            }
        }

        public String getInfo() {
            return "长: " + this.length + ", 宽: " + this.width + ", 面积: " +
                    this.area() + ", 周长: " + this.perimeter();
        }

    }
    ```

    ```java [TestRectangle.java]
    public class TestRectangle {

        public static void main(String[] args) {
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();

            System.out.println("r1对象: " + r1.getInfo());
            System.out.println("r2对象: " + r2.getInfo());

            r1.length = 10;
            r1.width = 2;
            System.out.println("r1对象: " + r1.getInfo());
            System.out.println("r2对象: " + r2.getInfo());

            r1.print('#');
            System.out.println("---------------------");
            r1.print('&');

            System.out.println("---------------------");
            r2.print('#');
            System.out.println("---------------------");
            r2.print('%');
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426163813.png)

### ② 同一个类中构造器互相调用

this 可以作为一个类中构造器相互调用的特殊格式。

- `this()`：调用本类的无参构造器

- `this(实参列表)`：调用本类的有参构造器

```java
public class Student {

    private String name;
    private int age;

    // 无参构造
    public Student() { // [!code error]
        // 调用本类有参构造器
        this("", 18);
    }

    // 有参构造
    public Student(String name) { // [!code error]
        // 调用本类无参构造器
        this();
        this.name = name;
    }

    // 有参构造
    public Student(String name, int age) { // [!code error]
        this(name);
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

    public String getInfo() {
        return "姓名: " + name + ", 年龄: " + age;
    }
}
```

> [!WARNING] 注意
>
> - 不能出现递归调用。比如，调用自身构造器。
>
>   推论：如果一个类中声明了 n 个构造器，则最多有 n-1 个构造器中使用了“this(形参列表)”
>
> - this() 和 this(实参列表) 只能声明在构造器首行。
>
>   推论：在类的一个构造器中，最多只能声明一个“this(参数列表)”

## 3、练习

1.  练习 1：添加必要的构造器，综合应用构造器的重载，this 关键字。

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426164638.png)

    :::code-group

    ```java [Girl.java]
    public class Girl {

        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void marry(Boy boy) {
            System.out.println(name + " marry with " + boy.getName());
        }

        public void compare(Girl girl) {
            int age = this.age - girl.age;
            if (age > 0) {
                System.out.println(name + "比" + girl.getName() + "大" + age + "岁");
            } else if (age < 0) {
                System.out.println(name + "比" + girl.getName() + "小" + age + "岁");
            } else {
                System.out.println(name + "和" + girl.getName() + "一样大");
            }
        }

    }
    ```

    ```java [Boy.java]
    public class Boy {

        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void marry(Girl girl) {
            System.out.println(name + " marry with " + girl.getName());
        }

        public void shout() {
            System.out.println("shout");
        }

    }
    ```

    :::

<div class="br"></div>

2.  练习 2：

    1.  按照如下的 UML 类图，创建相应的类，提供必要的结构：

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426165214.png)

        在提款方法 withdraw() 中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。deposit() 方法表示存款。

    2.  按照如下的 UML 类图，创建相应的类，提供必要的结构：

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426165251.png)

    3.  按照如下的 UML 类图，创建相应的类，提供必要的结构：

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426165323.png)

        - addCustomer() 方法必须依照参数（姓，名）构造一个新的 Customer 对象，然后把它放到 customer 数组中。还必须把 numberOfCustomer 属性的值加 1。

        - getNumOfCustomers() 方法返回 numberOfCustomers 属性值。

        - getCustomer() 方法返回与给出的 index 参数相关的客户。

    4.  创建 BankTest 类，进行测试。

        内存解析图：

        ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426165444.png)

    ::: code-group

    ```java [Account.java]
    public class Account {

        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amt) {
            if (amt > 0) {
                balance += amt;
                System.out.println("成功存入: " + amt);
            } else {
                System.out.println("存入失败: " + amt);
            }
        }

        public void withdraw(double amt) {
            if (amt > 0 && amt <= balance) {
                balance -= amt;
                System.out.println("成功取出: " + amt);
            } else {
                System.out.println("取款失败: balance = " + balance + ", amt = " + amt);
            }
        }

    }
    ```

    ```java [Customer.java]
    public class Customer {

        private String firstName;
        private String lastName;
        private Account account;

        public Customer(String f, String l) {
            firstName = f;
            lastName = l;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account acct) {
            account = acct;
        }

    }
    ```

    ```java [Bank.java]
    public class Bank {

        private Customer[] customers;
        private int numberOfCustomer;

        public Bank() {
        }

        public void addCustomer(String f, String l) {
            customers = new Customer[++numberOfCustomer];
            Customer customer = new Customer(f, l);
            customers[customers.length - 1] = customer;
        }

        public int getNumOfCustomers() {
            return numberOfCustomer;
        }

        public Customer getCustomer(int index) {
            if (customers.length > 0 && index >= 0 && index < customers.length) {
                return customers[index];
            } else {
                System.out.println("customers长度为: " + customers.length);
                return null;
            }
        }

    }
    ```

    ```java [BankTest.java]
    public class BankTest {

        public static void main(String[] args) {
            Bank bank = new Bank();
            bank.addCustomer("Jane", "Smith");
            bank.getCustomer(0).setAccount(new Account(3000));

            double balance = bank.getCustomer(0).getAccount().getBalance();
            String firstName = bank.getCustomer(0).getFirstName();
            String lastName = bank.getCustomer(0).getLastName();

            System.out.println("name: " + firstName + " " + lastName + ", balance: " + balance);
        }

    }
    ```

    :::

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426165850.png)
