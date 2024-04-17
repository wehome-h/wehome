# 第十二节 注释（comment）

## 1、介绍

用于注释说明解释程序的文字就是注释，注释提高了代码的阅读性（可读性）；注释是一个程序员必须要具有的良好编程习惯。将来自己的思想通过注释先整理出来，再用代码去体现。

## 2、Java 中的注释类型

### ① 单行注释

::: raw

<h6>
  <span class="title">基本格式</span>
</h6>

```java
  // 注释文字
```

<h6>
  <span class="title">基本格式</span>
</h6>

:::

### ② 多行注释

::: raw

<h6>
  <span class="title">基本格式</span>
</h6>

```java
/* 注释文字 */
```

<h6>
  <span class="title">基本格式</span>
</h6>

:::

### ③ 文档注释

::: raw

<h6>
  <span class="title">基本格式</span>
</h6>

```java
/**
 * @author wehome
 * @version 1.0
 */
public class Comments {

}
```

<h6>
  <span class="title">基本格式</span>
</h6>

:::

::: raw

<h6>
  <span class="title">生成对应的文档注释</span>
</h6>

```sh
# javadoc -d 文件夹名 -xx -yy Xxx.java
javadoc -d d:\\temp -author -version Comments.java
```

<h6>
  <span class="title">生成对应的文档注释</span>
</h6>

:::

::: raw

<h6>
  <span class="title">javadoc 标签</span>
</h6>

[javadoc 标签](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/javadoc标签.docx)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413220252.png)

<h6>
  <span class="title">javadoc 标签</span>
</h6>

:::

## 3、使用细节

1.  被注释的文字，不会被 JVM（Java 虚拟机）解析执行。

2.  多行注释里面不允许有多行注释嵌套。
