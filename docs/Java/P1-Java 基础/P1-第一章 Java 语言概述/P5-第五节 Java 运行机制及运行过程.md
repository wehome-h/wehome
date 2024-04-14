# 第五节 Java 运行机制及运行过程

## 1、Java 语言的特点：跨平台性

- ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413152142.png)

## 2、核心机制 - Java 虚拟机

1.  JVM 是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器，包含在 JDK 中。

2.  对于不同的平台，有不同的虚拟机。

3.  Java 虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，到处运行”。

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413152511.png)
