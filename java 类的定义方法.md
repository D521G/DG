 ### java类的定义及其实例化
 
类必须先定义才能使用。类是创建对象的模板,创建对象也叫类的实例化。 

下面通过一个简单的例子来理解Java中类的定义:
>     public class Dog
>     {
>        String name;
>        int age;
>     
>        void bark()//汪汪叫
>        {
>            System.out.println("汪汪，不要过来");
>        }
>        void hungry()
>        {
>            System.out.println("主人，我饿了");
>        }
>     }

对示例的说明:
```
1 public 是类的修饰符，表明该类是公共类，可以被其他类访问。
2 class 是定义类的关键字。
3 Dog是类的名称。
4 name,age是类的成员变量，也叫属性；bark(),hungry()是类中的函数，也叫方法。 
5 一个类可以包含以下类型变量:
6 局部变量:在方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
7 成员变量:成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化(分配内存)。成员变量可以被类中的方法和特定类的语句访问。
8 类变量:类变量也声明在类中，方法体之外，但必须声明为static类型。static也是修饰符的一种。
```

 ### 构造方法

在类实例化的过程中自动执行的方法叫做构造方法，它不需要你手动调用。构造方法可以在类实例化的过程中做一些初始化的工作。

构造方法的名称必须与类的名称相同，并且没有返回值。

每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认的构造方法。
>     public class Dog
>     {
>       String name;
>       int age;
>     
>       //构造方法，没有返回值
>       Dog(String name1,int age1)
>       {
>          name = name1;
>          age = age1;
>          System.out.println("感谢主人领养了我");
>       }
>     
>       //普通方法,必须有返回值
>       void bark()
>       {
>          System.out.println("汪汪，不要过来");
>       }
>     
>       void hungry()
>       {
>           System.out.println("主人，我饿了");
>       }
>     
>       public static void main(String[] args)
>       {
>           //创建对象时传递的参数要与构造方法参数列表对应
>           Dog myDog = new Dog("花花",3);
>       }
>     }

运行结果： 
>     感谢主人领养了我

>     package day23;
>     /*构造方法
>      - 作用是用于初始化参数
>      - 所有的数字变量全部设置为0
>      - 所有的boolean类型全部设置为false
>      - 所有的对象变量全部设置为null
>      */
>     /*
>      - 设计自己的构造方法
>      -   方法名称必须和类的名称相同
>      -   没有返回值
>      */
>     /*
>      - 如果自己写了有参的构造方法，那么编译器不会再提供
>      - 默认的构造方法了
>      - 如果我们还想用无参的构造方法，
>      - 那么需要手动实现
>      */
>     public class People 
>     {
>         String name;
>         String sex;
>         int age;
>     
>         //无参的构造方法(可以不写编译器自动加上，前提是没有任何其他构造方法)
>         People()//构造方法（可删掉,编译器默认加上)
>         {
>     //      name = null;
>     //      sex = null;
>     //      age = 0;
>         }
>     
>         //有参的构造方法
>         People(String name,String sex,int age)
>         {
>             this.name = name;
>             this.sex = sex;
>             this.age = age;
>         }
>     
>         //部分初始化
>         People(String name)
>         {
>             this.name = name;
>         }
>     
>         People(String name,int age)
>         {
>             this.name = name;
>             this.age = age;
>         }
>         public static void main(String[] args)
>         {
>             People p = new People();
>             System.out.println(p.name);
>             System.out.println(p.sex);
>             System.out.println(p.age);
>     
>             People p1 = new People("张三","男",30);
>             System.out.println(p1.name+","+p1.sex+","+p1.age);
>     
>             People p2 = new People("老王");
>             System.out.println(p2.name);
>     
>             People p3 = new People("小老虎",3);
>             System.out.println(p3.name+","+p2.age);
>         }
>     }

说明:

1 构造方法不能被显式调用。

2 构造方法不能有返回值，因为没有变量来接收返回值

 ### 创建对象
 
对象是类的一个实例，创建对象的过程也叫类的实例化。对象是以类为模板来创建的。 

在Java中，使用new关键字来创建对象，一般有以下三个步骤:

>     声明:声明一个对象，包括对象名称和对象类型
>     实例化:使用关键字new来创建一个对象。
>     初始化:使用new创建对象时，会调用构造方法初始化对象。

例如:

>     Dog myDog;//声明一个对象
>     myDog = new Dog("花花",3);//实例化

也可以在声明的同时进行初始化:
>     Dog myDog = new Dog("花花",3);

 ### 访问成员变量和方法
 
 通过已创建的对象来访问成员变量和成员方法，例如:
>     //实例化
>     Dog myDog = new Dog("花花",3);
>     //通过点号访问成员变量
>     myDog.name;
>     //通过点号访问成员方法
>     myDog.bark();
    
下面的例子演示了如何访问成员变量和方法:
>     public class Dog
>     {
>       String name;
>       int age;
>     
>       Dog(String name1,int age1)
>       {
>          name = name1;
>          age = age1;
>          System.out.println("感谢主人领养了我");
>       }
>     
>       void bark()
>       {
>         System.out.println("汪汪，不要过来");
>       }
>     
>       void hungry()
>       {
>         System.out.println("主人，我饿了");
>       }
>     
>       public static void main(String[] args)
>       {
>         Dog myDog = new Dog("花花",3);
>         //访问成员变量
>         String name = myDog.name;
>         int age = myDog.age;
>         System.out.println("我是一只小狗，我名字叫" + name + ",我" + age + "岁了");
>         //访问方法
>         myDog.bark();
>         myDog.hungry();
>       }
>     }

>     运行结果： 
>     感谢主人领养了我 
>     我是一只小狗，我名字叫花花，我3岁了 
>     汪汪，不要过来 
>     主人，我饿了