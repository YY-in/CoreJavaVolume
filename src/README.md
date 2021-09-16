# 第四章  对象与类
## 4.1 面向对象程序设计概述
### 4.1.1 类
名词：class（类）、construct（构造）、instance（实例）、
 
encapsulation（封装）：对象中的数据称为实例域（instance filed）

method（方法）：操纵数据的过程
### 4.1.2 对象
对象的三个特性
* behavior ——   可以对对象施加哪些操作，或者可以对对象施加哪些方法
* state ——  当施加方法时，对象如何响应
* identity ——   如何辨别具有相同行为与模式的不同对象
### 4.1.3 识别类
### 4.1.4 类之间的关系
* dependence（依赖）：use -a 一个类操纵另一个类的对象
* aggregation（聚合）：has -a 类A的对象包含类B的对象
* inheritance （继承）：is -a 类A拓展类B。类A不但包含继承自类B的方法，还会有额外功能

UML（Unified Modeling Language）统一建模语言

## 4.2 使用预定义类

### 4.2.1 对象与对象变量
constructor（构造器）：构造并初始化对象
``` java
     Data deadline；    //对象变量 deadline doesn't refer to any object
     deadline = new Data();   //对象 (1) use constrator to initialize an instance
     Data birthday = new Data(); 
     deadline = brithday;   //(2) use an exist instance
```
一定要意识到：一个对象变量并没有实际包含一个对象../img/CppQuoteTip.jpeg，而仅仅只是引用

局部变量不会自动的初始化为null，而必须通过调用new或将它们设定为null进行初始化

 ![c++注释](./img/CppQuoteTip.jpeg)

### 4.2.2 Gregorian Calendar 
[GregorianCalendarTest.java](./com/yyin/oop_class/GregorianCalendarTest.java)
### 4.2.3更改器方法和访问器方法
mutator method(get) : 对实例域作出修改的方法称为更改器方法

accessor method(set) : 仅访问实例域而不进行修改的方法称为访问器方法

[CalendarApplication.java](./com/yyin/oop_class/CalendarApplication.java)

## 4.3 用户自定义类
### 4.3.1-4.3.5 自定义类的细节
主力类 workhorse class

构造器 constructor
+ 不要在构造器中定义与实例域重名的局部变量。

隐式参数 implicit ： 出现在方法名前的类的对象 例如 this、super 关键字 
显示参数 explicit ： 出现在方法名后出现的数值

### 4.3.6 封装的优点
1. 可以改变内部实现，除了该类的方法之外，不会影响其他代码
2. set方法可以执行错误检查，而直接对域进行赋值不会进行这些处理

注意：不要编写返回可变对象的get方法。如果需要返回一个可变对象的引用，应首先对它进行克隆（clone）

### 4.3.7 基于类的访问权限
一个方法可以访问所属类的所有对象的私有属性

### 4.3.8 私有方法
### 4.3.9 final 
final： 当用final修饰一个类时，表明这个类不能被继承。也就是说，如果一个类你永远不会让他被继承，就可以用final进行修饰。final类中的成员变量可以根据需要设为final，但是要注意final类中的所有成员方法都会被隐式地指定为final方法。

1.类的final变量和普通变量有什么区别？

当用final作用于类的成员变量时，成员变量（注意是类的成员变量，局部变量只需要保证在使用之前被初始化赋值即可）必须在定义时或者构造器中进行初始化赋值，而且final变量一旦被初始化赋值之后，就不能再被赋值了。

那么final变量和普通变量到底有何区别呢？下面请看一个例子：

```java
public class Test {
public static void main(String[] args)  {
    String a = "hello2";
    final String b = "hello";
    String d = "hello";
    String c = b + 2;
    String e = d + 2;
    System.out.println((a == c));
    System.out.println((a == e));
    }
}
```