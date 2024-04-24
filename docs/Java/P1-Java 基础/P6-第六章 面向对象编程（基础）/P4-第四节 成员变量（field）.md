# 第四节 成员变量（field）

## 1、如何声明成员变量

::: raw

<h6>
  <span class="title">语法格式</span>
</h6>

```java
[修饰符1] class 类名 {
    [修饰符2] 数据类型 成员变量名 [= 初始化值];
}
```

说明：

- 位置要求：必须在类中，方法外

- 修饰符 2（暂不考虑）

  常用的权限修饰符有：private、缺省、protected、public

  其它修饰符：static、final

- 数据类型

  任何基本数据类型（如 int、boolean）或任何引用类型数据

- 成员变量名

  属于标识符，符合命名规则和规范即可

- 初始化值

  根据情况，可以显式赋值；也可以不赋值，使用默认值

<h6>
  <span class="title">语法格式</span>
</h6>

:::

<div class="br"></div>

示例：

```java
public class Person {

    private int age; // 声明 private 变量 age

    public String name = "Lila"; // 声明 public 变量 name

}
```

## 2、成员变量 vs 局部变量

### ① 变量的分类：成员变量与局部变量

在方法体外，类体内声明的变量称为成员变量。

在方法体内部等位置声明的变量称为局部变量。

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424111010.png)

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424111024.png)

> 其中，static 可以将成员变量分为两大类，静态变量和非静态变量。其中静态变量又称为类变量，非静态变量又称为实例变量或者属性。

### ② 成员变量与局部变量的对比

相同点：

- 变量声明的格式相同：数据类型 变量名 = 初始化值

- 变量必须先声明、后初始化、再使用

- 变量都有其对应的作用域。只在其作用域内是有效的

<div class="br"></div>

不同点：

1.  声明位置和方式

    1.  实例变量：在类中方法外

    2.  局部变量：再方法体{} 中或方法的形参列表、代码块中

2.  在内存中存储的位置不同

    1.  实例变量：堆

    2.  局部变量：栈

3.  生命周期

    1.  实例变量：和对象的生命周期一样，随着对象的创建而存在，随着对象被GC回收而消亡，而且每一个对象的实例变量是对立的

    2.  局部变量：和方法调用的生命周期一样，每一次方法被调用而存在，随着方法执行的结束而消亡，而且每一次方法调用都是独立

4.  局部变

    1.  实例变量：通过对象就可以使用，本类中直接调用，其它类中“对象.实例变量”

    2.  局部变量：出了作用域就不能使用

5.  修饰符

    1.  实例变量：public、protected、private、final、volatile、transient 等

    2.  局部变量：final

6.  默认值

    1.  实例变量：有默认值

    2.  局部变量：没有，必须手动初始化。其中的形参比较特殊，靠实参给它初始化

### ③ 对象属性的默认初始化赋值

当一个对象被创建时，会对其中各种类型的成员变量自动进行初始化赋值

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424112615.png)

### ④ 举例

::: code-group

```java [Person.java]
// 人类
public class Person {
    // 1.属性
    String name; // 姓名
    int age = 1; // 年龄
    boolean isMale; // 是否是男性

    public void show(String nation) {
        // nation: 局部变量
        String color; // color: 局部变量
        color = "yellow";
    }
}
```

```java [PersonTest.java]
// 测试类
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.show("CHN");
    }
}
```

:::

![](https://raw.githubusercontent.com/wehome-h/typora-images-repository/main/images/20240424141511.png)