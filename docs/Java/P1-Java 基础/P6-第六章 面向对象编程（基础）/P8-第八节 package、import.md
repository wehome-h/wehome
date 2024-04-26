# 第八节 package、import

## 1、package（包）

package、称为包，用于指明该文件中定义的类、接口等结构所在的包。

### ① 语法格式

```java
package 顶层包名.子包名;
```

<div class="br"></div>

举例：pack1\pack2\PackageTest.java

```java
// 指定类 PackageTest 属于包 pack1.pack2
package pack1.pack2;

public class PackageTest {
    public void display() {
        System.out.println("in method display()");
    }
}
```

<div class="br"></div>

说明：

- 一个源文件只能有一个声明包的 package 语句

- package 语句作为 Java 源文件的第一条语句出现。若缺省该语句，则指定为无名包

- 包名，属于标识符，满足标识符命名的规则和规范（全部小写）、见名知意

  - 包通常使用所在公司域名的倒置：com.wehome.xxx

  - 大家取包名时<strong style="color: #f3514f;">不要使用 "java.xx" 包</strong>

- 包对应于文件系统的目录，package 语句中用 "`.`" 来指明包（目录）的层次，每 `.` 一次就表示一层文件目录

- 同一个包下可以声明多个结构（类、接口），但是不能定义同名的结构（类、接口）。不同的包下可以定义同名的结构（类、接口）

### ② 包的作用

- 包可以包含类和子包，<strong style="color: #f3514f;">划分项目层次</strong>，便于管理

- 帮助<strong style="color: #f3514f;">管理大型软件系统</strong>：将功能相近的类划分到同一个包中。比如：MVC 的设计模式

- 解决<strong style="color: #f3514f;">类命名冲突</strong>的问题

- 控制<strong style="color: #f3514f;">访问权限</strong>

### ③ 应用举例

1.  举例 1：某航运软件系统包括：一组域对象、GUI 和 reports 子系统

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426092345.png)

<div class="br"></div>

2.  举例 2：MVC 设计模式

    MVC 是一种软件构件模式，目的是为了降低程序开发中代码业务的耦合度。

    MVC 设计模式将整个程序分为三个层次：<strong style="color: #f3514f;">视图模型（Viewer）层，控制器（Controller）层，与数据模型（Model）层</strong>。这种将程序输入输出、数据处理，以及数据的展示分离开来的设计模式使程序结构变得灵活而且清晰，同时也描述了程序各个对象间的通信方式，降低了程序的耦合性。

    ```
    视图层 Viewer: 显示数据, 为用户提供使用界面, 与用户直接进行交互.
      > 相关工具类 view.utils
      > 自定义 view view.ui

    控制层 controller: 解析用户请求, 处理业务逻辑, 给予用户响应
      > 应用界面相关 controller.activity
      > 存放 fragment controller.fragment
      > 显示列表的适配器 controller.adapter
      > 服务相关的 controller.service
      > 抽取的基类 controller.base

    模型层 model: 主要承载数据、处理数据
      > 数据对象封装 model.bean/domain
      > 数据库操作类 model.dao
      > 数据库 model.db
    ```

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240426092918.png)

### ④ JDK 中主要的包介绍

- <strong style="color: #f3514f;">java.lang</strong>：包含一些 Java 语言的核心类，如 String、Math、Integer、System 和 Thread，提供常用功能

- <strong style="color: #f3514f;">java.net</strong>：包含执行与网络相关的操作的类和接口

- <strong style="color: #f3514f;">java.io</strong>：包含能提供多种输入/输出功能的类

- <strong style="color: #f3514f;">java.util</strong>：包含一些实用工具类，比如定义系统特性、接口的集合框架类、使用与日期日历相关的函数

- <strong style="color: #f3514f;">java.text</strong>：包含了一些 Java 格式化相关的类

- <strong style="color: #f3514f;">java.sql</strong>：包含了 Java 进行 JDBC 数据库编程的相关类/接口

- <strong style="color: #f3514f;">java.awt</strong>：包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面（GUI）

## 2、import（导入）

为了使用定义在其它包中的 Java 类，需用 import 语句来显式引入指定包下所需的类。相当于 <strong style="color: #f3514f;">import 语句告诉编译器到哪里去寻找这个类</strong>。

### ① 语法格式

```java
import 包名.类名;
```

### ② 应用举例

```java
// import pack1.pack2.*; 表示引入 pack1.pack2 包中的所有结构
import pack1.pack2.Test;

public class PackTest {

    public static void main(String[] args) {
        // Test 类在 pack1.pack2 包中定义
        Test t = new Test();
        t.display();
    }

}
```

### ③ 注意事项

- import 语句，声明在包的声明和类的声明之间

- 如果需要导入多个类或接口，那么就并列显示多个 import 语句即可

- 如果使用 a._ 导入结构，表示可以导入 a 包下的所有的结构。举例：可以使用 java.util._ 的方式，一次性导入 util 包下所有的类或接口

- 如果导入的类或接口是 java.lang 包下的，或者是当前包下的，则可以省略此 import 语句

- 如果已经导入 java.a 包下的类，那么如果需要使用 a 包的子包下的类的话，仍然需要导入

- 如果在代码中使用不同包下的同名的类，那么就需要使用类的全类名的方式指明调用的是哪个类

- （了解）<strong style="color: #f3514f;">import static</strong> 组合的使用：调用指定类或接口下的静态的属性或方法

  ```java
  import static java.lang.Math.*;

  public class ImportStaticTest {

      private static final double MATH_PI = PI;

      public static void main(String[] args) {
          System.out.println("MATH_PI = " + MATH_PI);
      }

  }
  ```
