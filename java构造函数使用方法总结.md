使用构造器时需要记住：

1.构造器必须与类同名（如果一个源文件中有多个类，那么构造器必须与公共类同名）

2.每个类可以有一个以上的构造器

3.构造器可以有0个、1个或1个以上的参数

4.构造器没有返回值

5.构造器总是伴随着new操作一起调用

示例：

A.java
>     public class A{
>        public A(){
>           System.out.println("调用了无参的构造函数");
>        }
>        public A(String mess){
>           System.out.println("调用了有参的构造函数\n"+
>              "参数内容为："+mess);
>        }
>     }

Test.java

java 代码
>     public class Test{
>        public static void main(String [] args){
>            A a_1=new A();//调用无参的构造函数
>            A a_2=new A("Hello");//调用有参的构造函数
>        }
>     }

输出结果 
>     调用了无参的构造函数
>     调用了有参的构造函数
>     参数内容为：Hello

继承与构造函数
```
使用super调用父类构造器的语句必须是子类构造器的第一条语句

如果子类构造器没有显式地调用父类的构造器，则将自动调用父类的默

认（没有参数）的构造器。如果父类没有不带参数的构造器，并且在子类

的构造器中又没有显式地调用父类的构造器，则java编译器将报告错误
```
示例：

A.java

Java代码
>     public class A{
>        public A(){
>           System.out.println("调用了A的无参构造函数");
>        }
>        public A(String mess){
>           System.out.println("调用了A的有参的构造函数\n"+
>              "参数内容为："+mess);
>        }
>     }

B.java

Java代码
>     public class B extends A{
>        public B(){
>        	  System.out.println("调用了B的无参构造函数");
>        }
>        public B(String mess){
>           super(mess);
>           System.out.println("调用了B的有参构造函数\n"+
>              "参数内容为："+mess);
>        }
>     }

Test.java

Java代码
>     public class Test{
>        public static void main(String [] args){
>            B b_01=new B();
>            B b_02=new B("你好");
>        }
>     }

输出结果：

>     调用的A的无参构造函数
>     调用了B的无参构造函数
>     调用了A的有参的构造函数
>     参数内容为：你好
>     调用了B的有参构造函数
>     参数内容为：你好