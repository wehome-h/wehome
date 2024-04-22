# 第二节 IDEA 的安装与使用（下）

## 1、快捷键的使用

### ① 常用快捷键

[IntelliJ IDEA 常用快捷键一览表](./IntelliJ%20IDEA%20常用快捷键一览表.md)

### ② 查看快捷键

#### ⑴ 已知快捷键操作名，未知快捷键

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422173646.png)

<br>

#### ⑵ 已知快捷键，不知道对应的操作名

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422173716.png)

### ③ 自定义快捷键

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422173740.png)

### ④ 使用其它平台快捷键

苹果电脑或者是用惯 Eclipse 快捷键的，可以选择其它快捷键插件。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422173809.png)

## 2、IDEA 断点调试（Debug）

### ① 为什么需要 Debug

编好的程序在执行过程中如果出现错误，该如何查找或定位错误呢？简单的代码直接就可以看出来，但如果代码比较复杂，就需要借助程序调试工具（Debug）来查找错误了。

<div class="br"></div>

运行编好的程序时，可能出现的几种情况：

1.  情况 1：没有任何 bug，程序执行正常。

2.  如果出现如下的三种情况，都又必要使用 debug

    1.  情况 2：运行以后，出现了错误或异常信息。但是通过日志文件或控制台，显示了异常信息的位置。

    2.  情况 3：运行以后，得到了结果，但是结果不是我们想要的。

    3.  情况 4：运行以后，得到了结果，结果大概率时我们想要的。但是多次运行的话，可能会出现不是我们想要的情况。

        比如：多线程情况下，处理线程安全问题。

### ② Debug 的步骤

Debug（调试）程序步骤如下：

1.  添加断点

2.  启动调试

3.  单步执行

4.  观察变量和执行流程，找到并解决问题

<br>

#### ⑴ 添加断点

在源代码文件中，在想要设置断点的代码行的前面的标记行处，单击鼠标左键就可以设置断点，在相同位置再次单击即可取消断点。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174142.png)

<br>

#### ⑵ 启动调试

IDEA 提供多种方式来启动程序（Launch）的调试，分别是通过菜单（Run → Debug）、图标（“绿色臭虫”等等）

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174223.png)

<br>

#### ⑶ 单步调试工具介绍

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174251.png)

或

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174306.png)

<div class="br"></div>

- Step Over（F8）：进入下一步，如果当前行断点是调用一个方法，则不进入当前方法体内

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174347.png)

<div class="br"></div>

- Step Into（F7）：进入下一步，如果当前行断点是调用一个自定义方法，则进入该方法体内

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174409.png)

<div class="br"></div>

- Force Step Into（Alt + Shift + F7）：进入下一步，如果当前行断点是调用一个核心库方法，则进入该方法体内

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174436.png)

<div class="br"></div>

- Step Out（Shift + F8）：跳出当前方法体

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174454.png)

<div class="br"></div>

- Run to Cursor（Alt + F9）：直接跳到光标处继续调试

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174523.png)

<div class="br"></div>

- Resume Program（F9）：恢复程序运行，但如果该断点下面代码还有断点则停在下一个断点上

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174543.png)

<div class="br"></div>

- Stop（Ctrl + F2）：结束调试

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174609.png)

<div class="br"></div>

- View Breakpoints（Ctrl + Shift + F8）：查看所有断点

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174629.png)

<div class="br"></div>

- Mute Breakpoints：使得当前代码后面所有的断点失效，一下执行到底

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174652.png)

<div class="br"></div>

::: tip 说明
在 Debug 过程中，可以动态的下断点。
:::

### ③ 多种 Debug 情况介绍

#### ⑴ 行断点

断点打在代码所在的行上。执行到此行时，会停下来。

<br>

#### ⑵ 方法断点

- 断点设置在方法的签名上，默认当进入时，断点可以被唤醒。

- 也可以设置在方法退出时，断点也被唤醒

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422174941.png)

- 在多态的场景下，在父类或接口的方法上打断点，会自动调入到子类或实现类的方法

<br>

#### ⑶ 字段断点

- 在类的属性声明上打断点，默认对属性的修改操作进行监控

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175044.png)

<br>

#### ⑷ 条件断点

```java
public class Debug {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            System.out.println(target);
        }
    }
}
```

针对上述代码，在满足 arr[i] % 3 == 0 的条件下，执行断点。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175235.png)

<br>

#### ⑸ 异常断点（暂略）

对异常进行跟踪。如果程序出现指定异常，程序就会执行断点，自动停住。

通过下图的方式，对指定的异常进行监控：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175314.png)

<br>

#### ⑹ 线程调试（暂略）

```java
public class Debug {
    public static void main(String[] args) {
        test("Thread1");
        test("Thread2");
    }

    public static void test(String threadName) {
        new Thread(() -> System.out.println(Thread.currentThread().getName()), threadName)
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175444.png)

#### ⑺ 强制结束

```java
public class Debug {
    public static void main(String[] args) {
        System.out.println("获取请求的数据");
        System.out.println("调用写入数据库的方法");
        insert();
        System.out.println("程序结束");
    }

    private static void insert() {
        System.out.println("进入insert()方法");
        System.out.println("获取数据库连接");
        System.out.println("将数据写入数据表中");
        System.out.println("写出操作完成");
        System.out.println("断开连接");
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175549.png)

### ④ 自定义调试数据试图（暂略）

设置如下：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175619.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422175631.png)

### ⑤ 常见问题

问题：使用 Step Into 时，会出现无法进入源码的情况。如何解决？

方案1：使用 <strong style="color: #f3514f;">force step into</strong> 即可。

方案2：点击 <strong style="color: #f3514f;">Setting → Build, Execution, Deployment → Debugger → Stepping</strong>，把 <strong style="color: #f3514f;">Do not step into the classess</strong> 的 <strong style="color: #f3514f;">java.* </strong>、<strong style="color: #f3514f;">javax.* </strong> 取消勾选即可。