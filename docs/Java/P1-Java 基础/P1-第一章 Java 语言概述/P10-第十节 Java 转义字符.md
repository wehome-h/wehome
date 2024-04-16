# 第十节 Java 转义字符

| 转义字符 | 说明                       |
| :------: | -------------------------- |
|   `\t`   | 一个制表位，实现对象的功能 |
|   `\n`   | 换行符                     |
|   `\\`   | 一个 \                     |
|   `\"`   | 一个 "                     |
|   `\'`   | 一个 '                     |
|   `\r`   | 一个回车                   |

::: raw

<h6>
  <span class="title">\r：一个回车</span>
</h6>

```java
public class EscapeCharacter {
    public static void main(String[] args) {
        System.out.println("我爱学习\r你好"); // [!code highlight] // [!code focus]
    }
}
```

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240413210943.png)

解读：

1.  首先输出：我爱学习

2.  \r 表示回车

3.  光标回到最前面，没有换行

4.  再输出你好，用你好替换我爱

5.  最终输出：你好学习

<h6>
  <span class="title">\r：一个回车</span>
</h6>

:::
