# 第二节 标识符（identifier）

Java 中变量、方法、类等要素命名时使用的字符序列，称为标识符。

::: tip 技巧

技巧：凡是自己可以起名字的地方都叫标识符。

:::

::: raw

<h6>
  <span class="title">标识符的命名规则</span>
</h6>

必须遵守的<strong style="color: #f3514f;">硬性规定</strong>

1.  由 26 个英文字母大小写，`0-9`，`_` 或 `$` 组成。

2.  数字不可以开头。

3.  不可以使用关键字和保留字，但能包含关键字和保留字。

4.  Java 中严格区分大小写，长度无限制。

5.  标识符不能包含空格。

<h6>
  <span class="title">标识符的命名规则</span>
</h6>

:::

::: raw

<h6>
  <span class="title">标识符的命名规范</span>
</h6>

建议遵守的<strong style="color: #f3514f;">软性要求</strong>

1.  包名：多单词组成时所有字母都小写：xxxyyyzzz。

    例如：java.lang、com.wehome.bean

2.  类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz。

    例如：HelloWorld、String、System 等

3.  变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz。

    例如：age、name、bookName、main、binarySearch、getName

4.  常量名：所有字母大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ。

    例如：MAX_VALUE、PI、DEFAULT_CAPACITY

<h6>
  <span class="title">标识符的命名规范</span>
</h6>

:::

::: tip 注意：

在起名字时，为了提高阅读性，要尽量有意义，“见名知意”。

:::

更多细节详见：

[【拓展】代码整洁之道\_关于标识符.txt](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/【拓展】代码整洁之道_关于标识符.txt)

[阿里巴巴 Java 开发手册（详尽版）.pdf](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/阿里巴巴Java开发手册（详尽版）.pdf)
