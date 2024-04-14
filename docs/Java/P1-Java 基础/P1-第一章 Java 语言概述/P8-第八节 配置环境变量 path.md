# 第八节 配置环境变量 path

## 1、为什么要配置 path

- 看一个现象：在 DOS 命令行中敲入 `javac`，出现错误提示。

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413160224.png)

  错误原因分析：当前执行的程序在当前目录下如果不存在，Windows 10 系统会在系统中已有的一个名为 path 的环境变量指定的目录中查找。如果仍未找到，会出现以下的错误提示。所以进入到 JDK 安装路径 `bin` 目录下，执行 `javac`，会看到 javac 参数提示信息。

## 2、配置环境变量 path 的步骤

### ① 步骤 1

- 设置 → 系统 → 关于 → 高级系统设置

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413160657.png)

### ② 步骤 2

- 进入系统属性界面

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413160839.png)

### ③ 步骤 3

- 进入环境变量配置界面

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413160922.png)

### ④ 步骤 4

- 新建系统变量

  增加 **`JAVA_HOME`** 环境变量，<strong style="color: #f3514f;">指向 JDK 的安装目录</strong>

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413161151.png)

### ⑤ 步骤 5

- 编辑 path

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413161228.png)

### ⑥ 步骤 6

- 增加 **`%JAVA_HOME%\bin`**

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413161334.png)
