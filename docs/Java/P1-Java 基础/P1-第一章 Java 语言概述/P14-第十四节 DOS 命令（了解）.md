# 第十四节 DOS 命令（了解）

## 1、DOS 介绍

DOS：Disk Operating System 磁盘操作系统。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413222530.png)

## 2、相对路径和绝对路径

- `相对路径`：从当前目录开始定位，形成的一个路径。

- `绝对路径`：从顶级目录开始定位，形成的路径。

- `../` 返回上一级目录

## 3、常用的 DOS 命令

1.  查看当前目录有什么内容

    ```sh
    dir d:\temp
    ```

2.  切换到其它盘符下（cd：change directory）

    ```sh
    cd /D e:
    ```

3.  切换到当前盘符下的其它目录下（使用相对路径和绝对路径）

    ```sh
    cd d:\temp
    cd ..\temp
    ```

4.  切换到上一级

    ```sh
    cd ..
    ```

5.  切换到根目录

    ```sh
    cd \
    ```

6.  查看指定的目录下所有的自己目录

    ```sh
    tree
    tree d:\temp
    ```

7.  清屏

    ```sh
    cls
    ```

8.  退出 DOS

    ```sh
    exit
    ```

9.  md（创建目录）、rd（删除目录）、copy（拷贝文件）、echo（输入内容到文件）、type（输入一个空文件）、move（剪切）

    ```sh
    # 创建 在 d 盘下创建 temp 目录
    md d:\\temp

    # 删除 d 盘下的 temp 目录
    rd d:\\temp

    # 创建 hello.txt 并输入 ok
    echo ok > hello.txt

    # 创建 null.txt 文件
    type nul > null.txt

    # 删除 hello.txt
    del hello.txt

    # 拷贝 把 hello.txt 拷贝到 e 盘下 名称为 copy_ok
    copy ok.txt e:\copy_ok.txt

    # 剪切 把 ok.txt 移动到 e 盘下
    move ok.txt e:\ok.txt
    ```

## 4、用 DOS 命令技巧

help 指令查看参数，例如：

- `help del`

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413223922.png)

- `help cd`

  ![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413224022.png)
