# 第九节 Java 快速入门

## 1、需求说明

- 要求开发一个『Hello.java』程序，可以输出【HelloWorld!】

## 2、开发步骤

1.  将 Java 代码编写到扩展名为 HelloWorld.java 的文件中。

2.  通过 javac 命令对该 Java 文件进行编译，生成 .class 文件。

3.  通过 java 命令对生成的 class 文件进行运行。

## 3、HelloWorld

- ```java
  // public class Hello 表示 Hello 是一个类, 是一个 public 共有的类
  public class Hello {
      // 表示一个主方法, 即我们程序的入口
      public static void main(String[] args) {
          // 输出 HelloWorld 到屏幕
          System.out.println("Hello World!");
      }
  }
  ```

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413173219.png)

## 4、运行原理示意图

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413171657.png)

- ```sh
  # 编译
  javac Hello.java
  # 运行
  java Hello
  ```

- **什么是编译**

  `java Hello.java`

  1.  有了 Java 源文件，通过编译器将其编译成 JVM 可以识别的字节码文件。

  2.  在该源文件目录下，通过 `javac.exe` 编译工具对 Hello.java 文件进行编译。

  3.  如果程序没有错误，没有任何提示，但在当前目录下会出现一个 Hello.class 文件，该文件称为字节码文件，也是可以执行的 Java 程序。

- **什么是运行**

  1.  有了可执行的 Java 程序（Hello.class 字节码文件）

  2.  通过运行工具 `java.exe` 对字节码文件进行执行，本质就是 .class 装载到 JVM 机执行。

- **Java 程序开发注意事项**

  对修改后的 Hello.java 源文件需要<strong style="color: #f3514f;">重新编译</strong>，生成新的 class 文件后，再进行执行，才能剩下。

## 5、Java 执行流程分析

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413174442.png)

## 6、Java 开发注意事项和细节说明

1.  Java 源文件以 **`.java`** 为扩展名。源文件的基本组成部分是类『class』，如本类中的 Hello 类。

2.  Java 应用程序的执行入口是 main() 方法。它有固定的书写格式：

    ```java
    // public class Hello 表示 Hello 是一个类, 是一个 public 共有的类
    public class Hello {
    		// 表示一个主方法, 即我们程序的入口
    		public static void main(String[] args) { // [!code focus] // [!code highlight]
    				// 输出 HelloWorld 到屏幕
    				System.out.println("Hello World!");
    		}
    }
    ```

3.  Java 语言<strong style="color: #f3514f;">严格区分大小写</strong>。

4.  Java 方法由一条条语句构成，每个语句以 **`;`** 结束。

5.  大括号都是<strong style="color: #f3514f;">成对出现</strong>的，缺一不可。

6.  一个源文件中最多<strong style="color: #f3514f;">只能有一个 public 类</strong>。其它类的个数不限。

7.  如果源文件包含一个 <strong style="color: #f3514f;">public 类</strong>，则文件名<strong style="color: #f3514f;">
    必须按该类名命名</strong>。

8.  一个源文件中最多<strong style="color: #f3514f">只能有一个 public 类</strong>。<strong style="color: #f3514f;">其它类的个数不限</strong>，也可以将 main() 方法写在非 public 类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main() 方法。

9.  编译后，<strong style="color: #f3514f;">每一个类都对应一个 .class 文件</strong>。
