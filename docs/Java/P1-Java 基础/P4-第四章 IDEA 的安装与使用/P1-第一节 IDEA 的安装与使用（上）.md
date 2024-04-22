# 第一节 IDEA 的安装与使用（上）

## 1、卸载与安装

### ① 卸载过程

这里以卸载 2022.1.2 版本为例说明。再【控制面板】找到【卸载程序】

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142540.png)

<div class="br"></div>

右键点击或左键双击 IntelliJ IDEA 2022.1.2 进行卸载：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142618.png)

<div class="br"></div>

如果需要保留下述数据，就不要打√。如果想彻底删除 IDEA 所有数据，那就打上 √。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142650.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142705.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142718.png)

<div class="br"></div>

软件卸载完成以后，还需要删除其它几个位置的残留：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142748.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142800.png)

### ② 安装前的准备

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422142855.png)

- 64 位 Microsoft Windows11、10、8

- 最低 2GB 可用 RAM，推荐 8GB 系统总 RAM

- 2.5GB 硬盘空间，推荐 SSD

- 最低屏幕分辨率 1024x768

从安装上来看，IntelliJ IDEA 对硬件的要求似乎不是很高。可是在实际开发中并不是这样的，因为 IntelliJ IDEA 执行时会有大量的缓存、索引文件，所以如果你正在使用 Eclipse / MyEclipse，想通过 IntelliJ IDEA 来解决计算机的卡、慢等问题，这基本上是不可能的，本质上你应该对自己的硬件设备进行升级。

### ③ 安装过程

1.  下载完安装包，双击直接安装

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143628.png)

<div class="br"></div>

2.  欢迎安装

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143649.png)

<div class="br"></div>

3.  是否删除电脑上低版本的 IDEA（如果有，可以选择忽略）

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143714.png)

    - 如果电脑上有低版本的 IDEA，可以选择删除或保留。

    - 这里没有卸载旧版本，如果需要卸载，记得勾选下面的保留旧的设置和配置。

<div class="br"></div>

4.  选择安装目录

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143802.png)

    选择安装目录，目录中要避免中文和空格。

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143822.png)

<div class="br"></div>

5.  创建桌面快捷图标等

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143846.png)

    确认是否与 .java、.groovy、.kt格式文件进行关联。这里建议不关联。

<div class="br"></div>

6.  在【开始】菜单新建一个文件夹（这里需要确认文件夹的名称），来管理 IDEA 的相关内容。

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143919.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143931.png)

<div class="br"></div>

7.  完成安装

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422143952.png)

    重启以后，打开：

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422144010.png)

### ④ 注册

首先，需要通过用户协议：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422144151.png)

<div class="br"></div>

是否同意发送用户数据（特性、使用的插件、硬件与软件配置等），建议选择：不发送。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422144217.png)

<div class="br"></div>

接着，会提示我们进行注册。

- 选择 1：试用 30 天。在 IDEA2022.1.2 版本中，需要先登录，才能开启试用。

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422144313.png)

<div class="br"></div>

- 选择 2：付费购买旗舰版

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422144335.png)

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422144349.png)

<div class="br"></div>

- 选择 3：【推荐】

  [jihuo-tool-2022.3.zip](jihuo-tool-2022.3.zip)

  下载附加，参照里面的说明操作即可。

### ⑤ 闪退问题

问题描述：2022.1 启动不了，双击桌面图标，没有响应。

解决办法：

打开 <strong style="color: #f3514f;">C:\Users\wehome\AppData\Roaming\JetBrains\IntelliJIdea2022.1\idea64.exe.vmoptions</strong> 这个文件。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145251.png)

<div class="br"></div>

内容如下所示：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145317.png)

<div class="br"></div>

删除红框的数据以后，再打开即可正常进入。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145341.png)

<div class="br"></div>

原因：之前使用过的比如 2021.2.2版本，破解了。新版 IDEA 太智能了，把现有的启运参数也都复制过去了。又因为最新的 IDEA，不兼容破解程序 javaagent:D:\develop_tools\IDEA\IntelliJ IDEA 2021.2.2\bin\jetbrains-agent.jar 了，所以报错了，所以 JVM 结束了，所以没有启动画面，凉凉了。

## 2、HelloWorld 的实现

### ① 新建 Project - Class

选择 "New Project"：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145654.png)

<div class="br"></div>

指明工程名、使用的 JDK 版本等信息。如下所示：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145728.png)

<div class="br"></div>

接着创建 Java 类：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145754.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145807.png)

### ② 编写代码

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422145940.png)

### ③ 运行

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150029.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150040.png)

## 3、JDK 相关设置

### ① 项目的 JDK 设置

File → Project Structure → Platform Settings → SDKs

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150117.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150129.png)

- 注 1：SDKs 全称是 Software Development Kit，这里一定是选择 JDK 的安装根目录，不是 JRE 的目录。

- 注 2：这里还可以从本地添加多个 JDK。使用 + 即可实现。

### ② out 项目和编译版本

File → Project Structure → Project Settings → Project

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150304.png)

## 4、详细设置

### ① 如何打开详细配置界面

1.  显示工具栏

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150350.png)

<div class="br"></div>

2.  选择详细配置菜单或按钮

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150423.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150435.png)

### ② 系统设置

#### ⑴ 默认启动项配置

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150740.png)

启动 IDEA 时，默认自动打开上次开发的项目？还是自己选择？

如果去掉 Reopen projects on startup 前面的对勾，每次启动 IDEA 就会出现如下界面：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422150828.png)

<br>

#### ⑵ 取消自动更新

Settings → Appearance & Behavior → System Settings → Updates

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151016.png)

默认都打 √ 了，建议检查 IDEA 更新的 √ 去掉，检查插件更新的 √ 选上。

### ③ 设置整体主题

#### ⑴ 选择主题

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151114.png)

<br>

#### ⑵ 设置菜单和窗口字体和大小

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151138.png)

<br>

#### ⑶ 设置 IDEA 背景图

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151215.png)

选择一张合适的图片作为背景，即可。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151231.png)

### ④ 设置编译器主题样式

#### ⑴ 编辑器主题

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151312.png)

<br>

#### ⑵ 字体大小

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151333.png)

更详细的字体与颜色如下：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151348.png)

::: tip 温馨提示
如果选择某个 font 字体，中文乱码，可以在 fallback font（备选字体）中选择一个支持中文的字体。
:::

#### ⑶ 注释的字体颜色

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151902.png)

- Block comment：修改多行注释的字体颜色

- Block comment：修改多行注释的字体颜色

- Line comment：修改单行注释的字体颜色

### ⑤ 显示行号与方法分隔符

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422151959.png)

### ⑥ 代码智能提示功能

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422152023.png)

IntelliJ IDEA 的代码提示和补充功能有一个特性：区分大小写。如果想不区分大小写的话，就把这个对勾去掉。<strong style="color: #f3514f;">建议去掉勾选</strong>。

### ⑦ 自动导包配置

- 默认需要自己手动导包，Alt + Enter 快捷键

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422152142.png)

<div class="br"></div>

- 自动导包设置

  - 动态导入明确的包：<strong style="color: #f3514f;">Add unambiguous imports on the fly</strong>，该设置具有全局性；

  - 优化动态导入的包：<strong style="color: #f3514f;">Optimize imports on the fly</strong>，该设置只对当前项目有效；

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422152234.png)

### ⑧ 设置项目文件编码（一定要改）

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422152456.png)

说明：Transparent native-to-ascii conversion 主要用于转换 ascii，显示原生内容。一般都要勾选。

### ⑨ 设置控制台的字符编码

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422152530.png)

### ⑩ 修改类头的文档注释信息

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422152604.png)

比如：

```java
/**
 * ClassName: ${NAME}
 * Package: ${PACKAGE_NAME}
 * Description: 
 * @Author wehome
 * @Create ${DATE} ${TIME}
 * @Version 1.0
 */
```

常用的预设的变量，这里直接贴出官网给的：

```java
${PACKAGE_NAME} - the name of the target package where the new class or interface will be created. 
${PROJECT_NAME} - the name of the current project. 
${FILE_NAME} - the name of the PHP file that will be created. 
${NAME} - the name of the new file which you specify in the New File dialog box during the file creation. 
${USER} - the login name of the current user. 
${DATE} - the current system date. 
${TIME} - the current system time. 
${YEAR} - the current year. 
${MONTH} - the current month. 
${DAY} - the current day of the month. 
${HOUR} - the current hour. 
${MINUTE} - the current minute. 
${PRODUCT_NAME} - the name of the IDE in which the file will be created. 
${MONTH_NAME_SHORT} - the first 3 letters of the month name. Example: Jan, Feb, etc. 
${MONTH_NAME_FULL} - full name of a month. Example: January, February, etc.
```

### ①① 设置自动编译

Settings → Build, Execution, Deployment → Compiler

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422160556.png)

### ①② 设置为省电模式（可忽略）

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422160631.png)

IntelliJ IDEA 有一种叫做省电模式的状态，开启这种模式之后 IntelliJ IDEA 会关掉代码检查和代码提示等功能。所以一般也可认为这是一种阅读模式，如果你在开发过程中遇到突然代码文件不能进行检查和提示，可以来看看这里是否有开启该功能。

### ①③ 取消双击 Shift 搜索

因为我们按 Shift 切换中英文输入方式，经常被按到，总是弹出搜索框，太麻烦了。可以取消它。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422160817.png)

- 方式 1：使用于 IDEA 2022.1.2 版本

  在 2022.1 版本中，采用如下方式取消双击 Shift 出现搜索框：搜索 double 即可，勾选 <strong style="color: #f3514f;">Disable double modifier key shortcuts</strong>，禁用这个选项。

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422160923.png)

<div class="br"></div>

- 方式 2：适用于 IDEA 2022.1.2 之前版本

  双击 Shift 或 Ctrl+Shift+A，打开如下搜索窗口：

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422160958.png)

  选择 registry...，找到 ide.suppress.double.click.handler，把复选框打上勾就可以取消双击 Shift 出现搜索框了。

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422161035.png)

## 5、工程与模块管理

### ① IDEA 项目结构

层级关系：

- project（工程）

- module（模块）

- package（包）

- class（类）

<div class="br"></div>

具体的：

- 一个 project 中可以创建多个 module

- 一个 module 中可以创建多个 package

- 一个 package 中可以创建多个 class

<div class="br"></div>

这些结构的划分，是为了方便管理功能代码。

### ② Project 和 Module 的概念

在 IntelliJ IDEA 中，提出了 Project 和 Module 这两个概念。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422161439.png)

在 IntelliJ IDEA 中 Project 是最顶级的结构单元，然后就是 Module。目前，主流的大型项目结构基本都是多 Module 的结构，这类项目一般是按功能划分的，比如：user-core-module、user-facade-module和user-hessian-module 等等，模块之间彼此可以相互依赖，有着不可分割的业务关系。因此，对于一个 Project 来说：

- 当为单 Module 项目的时候，这个单独的 Module 实际上就是一个 Project。

- 当为多 Module 项目的时候，多个模块处于同一个 Project 之中，此时彼此之间具有相互依赖的关联关系。

- 当然多个模块没有建立依赖关系的话，也可以作为单独一个“小项目”运行。

### ③ Module 和 Package

在一个 module 下，可以声明多个包（package），一般命名规范如下：

1.  不要中文

2.  不要以数字开头

3.  给包取名时一般都是公司域名倒着写，而且都是小写

    比如：淘宝网址是 www.taobao.com

    那么我们的 package 包名应该写成：com.taobao.子名字

### ④ 创建 Module

建议创建“Empty 空工程”，然后创建多模块，每一个模块可以独立运行，相当于一个小项目。

<div class="br"></div>

步骤：

1.  选择创建模块

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422161824.png)

<div class="br"></div>

2.  选择模块类型：这里选择创建 Java 模块，给模块命名，确定存放位置

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422161954.png)

<div class="br"></div>

3.  模块声明在工程下面

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162052.png)

### ⑤ 删除模块

1.  移除模块

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162149.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162206.png)

<div class="br"></div>

2.  彻底删除模块

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162236.png)

### ⑥ 导入模块

1.  将 teacher_chapter04 整个模块复制到自己 IDEA 项目的路径下

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162401.png)

    接着打开自己 IDEA 的项目，会在项目目录下看到拷贝过来的 module，只不过不是以模块的方式呈现。

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162426.png)

<div class="br"></div>

2.  查看 Project Structure，选择 import module

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162505.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162523.png)

<div class="br"></div>

3.  选择要导入的 module

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162618.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162632.png)

<div class="br"></div>

4.  接着可以一路 Next 下去，最后选择 Overwrite

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162706.png)

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422162720.png)

    最后点击OK即可了。

### ⑦ 同时打开两个 IDEA 项目工程

#### ⑴ 新建一个 IDEA 项目

注意：第一次需要新建，之后直接打开项目工程即可

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422164950.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165005.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165019.png)

<br>

#### ⑵ 打开两个 IDEA 项目

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165124.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165140.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165153.png)

### ⑧ 导入前几章非 IDEA 工程代码

#### ⑴ 创建 chapter01、chapter02、chapter03 等章节的 module

将相应章节的源文件粘贴到 module 的 src 下。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165252.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165305.png)

<div class="br"></div>

打开其中各个源文件，会发现有乱码。比如：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165347.png)

#### ⑵ 设置编码

当前项目是 UTF-8。如果原来的 .java 文件都是 GBK 的（如果原来 .java 文件有的是 GBK，有的是 UTF-8 就比较麻烦了）。

可以单独把这两个模块设置为 GBK 编码的。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165522.png)

<div class="br"></div>

改为 GBK，确认即可。如图：

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165553.png)

## 6、代码模板的使用

### ① 查看 Postfix Completion 模板（后缀补全）

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165655.png)

### ② 查看 Live Templates 模板（实时模板）

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422165723.png)

### ③ 常用代码模板

#### ⑴ 非空判断

- 变量.null：`if (变量 == null)`

- 变量.nn：`if (变量 != null)`

- 变量.notnull：`if (变量 != null)`

- ifn：`if (xx == null)`

- inn：`if (xx != null)`

<br>

#### ⑵ 遍历数组和集合

- 数组或集合 `变量.fori`：for 循环

- 数组或集合 `变量.for`：增强 for 循环

- 数组或集合 `变量.forr`：反向 for 循环

- 数组或集合 `变量.iter`：增强 for 循环遍历数组或集合

<br>

#### ⑶ 输出语句

- sout：相当于 System.out.println

- soutm：打印当前方法的名称

- soutp：打印当前方法的形参及形参对应的实参值

- soutv：打印方法中声明的最近的变量的值

- 变量.sout：打印当前变量值

- 变量.soutv：打印当前变量名及变量值

<br>

#### ⑷ 对象操作

- 创建对象

  - Xxx.new    .var：创建 Xxx 类的对象，并赋给相应的变量

  - Xxx.new    .field：会将方法内刚创建的 Xxx 对象抽取为一个属性

<div class="br"></div>

- 强转

  - 对象.cast：将对象进行强转

  - 对象.castvar：将对象强转后，并赋给一个变量

<br>

#### ⑸ 

- psf：public static final

- psfi：public static final int

- psfs：public static final String

- prsf：private static final

### ④ 自定义代码模板

#### ⑴ 自定义后缀补全模板

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172532.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172545.png)

<br>

#### ⑵ 自定义 Live Templates

例如：定义 sop 代表 System.out.print(); 语句

1.  在 Live Templates 中增加模板

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172642.png)

<div class="br"></div>

2.  先定义一个模板的组，这样方便管理所有定义的代码模板

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172712.png)

<div class="br"></div>

3.  在模板组里新建模板

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172734.png)

<div class="br"></div>

4.  定义模板（以输出语句为例）

    ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172757.png)

    - Abbreviation：模板的缩略名称

    - Description：模板的描述

    - Template text：模板的代码片段

    - 模板应用范围。比如点击 Define。选择如下：应用在 Java 代码中。
      
      ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240422172849.png)