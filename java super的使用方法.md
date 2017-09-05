1）有人写了个很好的初始化属性的构造函数，而你仅仅想要在其中添加另一些自己新建属性的初始化，这样在一个构造函数中调用另外一个构造函数，可以避免重复的代码量，减少工作量；

2）在一个构造函数中调用另外一个构造函数的时候应该用的是同一块内存空间，在默认的构造函数中先初始化变量，调用另一个的时候覆写已经初始化的变量的值；

3）整个调用的过程和递归调用函数有点类似，不断充气球，直到整个气球膨胀起来，不断的深层递进，遇到停止标记，逐层的跳出来。

写了段代码，解释我上面的叙述：
>     class JavanTiger {
>         int age;      // 年龄
>         int hight;    // 身体高度
>     
>         public JavanTiger() {
>             print();
>             this.age=2;   //这里初始化 age 的值 ，但递归返回的时候，这个值会被覆写
>         }
>         
>         public JavanTiger(int age) {
>             this();      // 调用自己的第一个构造函数，下面的两个语句数不执行的
>             this.age = age;
>             print();
>         }
>     
>         public JavanTiger(int age, int hight) {
>             this(age);   // 调用自己第二个构造函数  ，下面的两个语句数不执行的
>             this.hight = hight;
>             print();
>         }
>     
>         public void print() {  //打印函数
>             System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
>         }
>         public static void main(String[] args) {
>             new JavanTiger(3,3);
>         }
>     }
>     //output
>     //I'am a 0岁 0尺高 tiger!
>     //I'am a 3岁 0尺高 tiger!
>     //I'am a 3岁 3尺高 tiger!

今天要总结的是 super 这个关键字的使用，super 在构造函数中出现的时候一般是当前这个类继承了其他的类，super 的出现就是为了调用父类的构造函数，贴段代码先

>     class Tiger {
>         int age; // 年龄
>         int hight; // 身体高度
>     
>         public Tiger() {
>             print();
>         }
>     
>         public void print() {
>             System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
>         }
>     }
>     public class JavanTiger extends Tiger {    
>         public JavanTiger() {
>             super();    // 调用父类无参数的构造函数
>         }
>         public static void main(String[] args) {
>             new JavanTiger();
>         }
>     }

其实在类JavanTiger 中的构造函数中的 super（）可以不写，JAVA会默认调用父类的无参数的构造函数，但如果父类没有定义无参数的构造函数，没有语法错误，程序会自动退出，没有任何打印语句，这时候你需要手动调用其他父类的构造函数，贴段代码：
>     class Tiger {
>         int age; // 年龄
>         int hight; // 身体高度
>     
>         public Tiger(int age) {
>         this.age = age;
>         print();
>         }
>         public void print() {
>             System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
>         }
>     }
>     public class JavanTiger extends Tiger {    
>         public JavanTiger() {
>             super(1);    // 调用父类有参数的构造函数
>         }
>         public static void main(String[] args) {
>             new JavanTiger();
>         }
>     }
> 

 这段代码中的 super(1)必须要写进去，否则编译器会报错。所以我简单的总结了一下，“this（）是调用自己其他的构造函数，super()是调用自己继承的父类的构造函数“，如果只想调用默认无参数的父类构造函数，不用在子类的构造函数当中写出来，但是实际编程的时候，总是会忽略这一点。

那门这两个关键字能不能同时出现在子类的一个构造函数当中纳？答案肯定是不能。先说下自己的理解：

1）在新建一个基类的时候，不论递归调用几次自身的构造函数，最终你都会去调用父类的构造函数，（不是显式调用的话，系统会调用默认无参数的父类构造函数）；

2)JAVA 中规定使用 this 和 super 时必须放在构造函数第一行，只有一个第一行；