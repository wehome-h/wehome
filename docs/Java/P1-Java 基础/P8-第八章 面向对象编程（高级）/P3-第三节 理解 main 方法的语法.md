# 第三节 理解 main() 方法的语法

由于 JVM 需要调用类的 main() 方法，所以该方法的访问权限必须是 public，又因为 JVM 在执行 main() 方法时不必创建对象，所以该方法必须是 static 的，该方法接收一个 String 类型的数组参数，该数组中保存执行 Java 命令时传递给所运行的类的参数。

又因为 main() 方法是静态的，我们不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的静态成员，这种情况，我们在之前的例子中很多次碰到。

<br>

命令行参数用法举例：

```java
public class CommandPara {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }

}
```

```
// 运行程序CommandPara.java
Java CommandPara "wehome" "Jerry" "Tom"
```

```
// 输出结果
args[0] = wehome
args[1] = Jerry
args[2] = Tom
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429160507.png)

IDEA 工具：

1.  配置运行参数

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429160538.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429160552.png)

<div class="br"></div>

2.  运行程序

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240429160625.png)

<div class="br"></div>

笔试题：

```java
// 此处, something 类的文件名叫 OtherThing.java
class Something {

    public static void main(String[] something_to_do) {
        System.out.println("Do something ...");
    }

}

// 上述程序是否可以正常编译、运行? 可以正确编译运行, 因为 Something 的修饰符不是 public
```
