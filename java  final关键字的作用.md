   ### 题材1   java中的final关键字所起的作用


final的作用随着所修饰的类型而不同
       1、final修饰类中的属性或者变量
              无论属性是基本类型还是引用类型，final所起的作用都是变量里面存放的“值”不能变。
              这个值，对于基本类型来说，变量里面放的就是实实在在的值，如1，“abc”等。
              而引用类型变量里面放的是个地址，所以用final修饰引用类型变量指的是它里面的地址不能变，并不是说这个地址所指向的对象或数组的内容不可以变，这个一定要注意。
              例如：类中有一个属性是final Person p=new Person("name")； 那么你不能对p进行重新赋值，但是可以改变p里面属性的值，p.setName('newName');
              final修饰属性，声明变量时可以不赋值，而且一旦赋值就不能被修改了。对final属性可以在三个地方赋值：声明时、初始化块中、构造方法中。总之一定要赋值。      
      2、final修饰类中的方法
             作用：可以被继承，但继承后不能被重写。
      3、final修饰类
             作用：类不可以被继承。
思考一个有趣的现象：
       byte b1=1;
       byte b2=3;
       byte b3=b1+b2;//当程序执行到这一行的时候会出错，因为b1、b2可以自动转换成int类型的变量，运算时Java虚拟机对它进行了转换，结果导致把一个int赋值给byte-----出错
       如果对b1 b2加上final就不会出错
       final byte b1=1;
       final byte b2=3;
       byte b3=b1+b2;//不会出错，相信你看了上面的解释就知道原因了。


 ### 题材2 java final 关键字
 
   根据上下文环境，Java的关键字final也存在着细微的区别，但通常指的是“这是无法改变的。”不想改变的理由由两种：一种是效率，另一种是设计。由于两个原因相差很远，所以关键子final可能被吴用。

   接下来介绍一下使用到fianl的三中情况：数据，方法，类。

  

   final数据

   许多编程语言都有某种方法，来向编译器告知一块数据是恒定不变的。有时数据的恒定不变是很有用的，例如：

1，一个编译时恒定不变的常量

2，一个在运行时初始化，而你不希望它被改变。

   对于编译期常量的这种情况，编译器可以将该常量值代入任何可能用到它的计算式中，也就是说，可以在编译期就执行计算式，这减轻了一些运行时的负担。在java中，这类常量必须是基本类型，并且以final表示。在对这个常量定义时，必须进行赋值。

   一个即是static又是fianl的域只占一段不能改变的存储空间。

   当final应用于对象引用时，而不是基本类型时，其含义有些让人疑惑。对基本类型使用fianl不能改变的是他的数值。而对于对象引用，不能改变的是他的引用，而对象本身是可以修改的。一旦一个final引用被初始化指向一个对象，这个引用将不能在指向其他对象。java并未提供对任何对象恒定不变的支持。这一限制也通用适用于数组，它也是对象。



   下面的事例示范fianl域的情况。注意，根据惯例，即是static又是fianl的域(即编译器常量)将用大写表示，并用下划分割个单词：

>     package reusing;
>     //: reusing/FinalData.java
>     // The effect of final on fields.
>     import java.util.*;
>     import static net.mindview.util.Print.*;
>     
>     class Value {
>       int i; // Package access
>       public Value(int i) { this.i = i; }
>     }
>     
>     
>     
>     public class FinalData {
>       private static Random rand = new Random(47);
>       private String id;
>       public FinalData(String id) { this.id = id; }
>       // Can be compile-time constants:
>       private final int valueOne = 9;
>       private static final int VALUE_TWO = 99;
>       // Typical public constant:
>       public static final int VALUE_THREE = 39;
>       // Cannot be compile-time constants:
>       private final int i4 = rand.nextInt(20);
>       static final int INT_5 = rand.nextInt(20);
>       private Value v1 = new Value(11);
>       private final Value v2 = new Value(22);
>       private static final Value VAL_3 = new Value(33);
>       // Arrays:
>       private final int[] a = { 1, 2, 3, 4, 5, 6 };
>       public String toString() {
>         return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
>       }
>     
>     
>       public static void main(String[] args) {
>         FinalData fd1 = new FinalData("fd1");
>         //! fd1.valueOne++; // Error: can't change value
>         fd1.v2.i++; // Object isn't constant!
>         fd1.v1 = new Value(9); // OK -- not final
>         for(int i = 0; i < fd1.a.length; i++)
>           fd1.a[i]++; // Object isn't constant!
>         //! fd1.v2 = new Value(0); // Error: Can't
>         //! fd1.VAL_3 = new Value(1); // change reference
>         //! fd1.a = new int[3];
>         print(fd1);
>         print("Creating new FinalData");
>         FinalData fd2 = new FinalData("fd2");
>         print(fd1);
>         print(fd2);
>       }
>     } 
>     
>     /* Output:
>     fd1: i4 = 15, INT_5 = 18
>     Creating new FinalData
>     fd1: i4 = 15, INT_5 = 18
>     fd2: i4 = 13, INT_5 = 18
>     */


   由于valueOne和VALUE_TWO都是带有编译时数值的fianl基本类型，所以它们二者均可以用作编译期常量，并且没有重大区别。VALUE_THREE是一种更加典型的对常量进行定义的方式：定义为public，可以被任何人访问；定义为static，则强调只有一份；定义为fianl，这说明它是个常量。请注意带有恒定初始值(即，编译期常量)的final static基本类型全用大写字母命名，并且字母与字母之间用下划线隔开。

   我们不能因为某些数据是fianl的就认为在编译时可以知道它的值。在运行时使用随机数来初始化i4和INT_5的值叫说明了这一点。事例部分也展示了将fianl数据定义为static和非static的区别。此区别只有当数值在运行时内被初始化时才会显现，这是因为在编译器对编译时的数值一视同仁(并且他们可能因为优化而消失)。当运行时会看见这个区别。请注意，在此fd1和fd2中i4的值是唯一的，每次都会被初始化为15,13。INT_5的值是不可以通过创建第二个FinalData对象加以改变的。这是因为他是static的，在装载类时(也就是第一次创建这个类对象时)已经被初始化，而不是每次创建都初始化。


**如果看上面的事例来理解我标记颜色的的部分有点困难的话，请看下面的事例：**

>     public class B3 {
>     	static Random r =new Random(12);
>     	final int int1= r.nextInt(100);//产生0-99的随机数
>     	static final int INT_2= r.nextInt(100);
>     	
>     
>     	public static void main(String[] args) {
>     		B3 b1=new B3();
>     		System.out.println("int1:"+b1.int1+"    INT_2:"+b1.INT_2);
>     		B3 b2=new B3();
>     		//b2.INT_2=100;//错误的赋值
>     		System.out.println("int1:"+b2.int1+"    INT_2:"+b2.INT_2);
>     
>     	}
>     
>     }

启动main()先执行的是B3 b1=new B3();，创建B3的第一个对象，这将会先初始化static final int INT_2= r.nextInt(100);，然后是初始化final int int1= r.nextInt(100);，所以第一条输出语句的结果是int1:12    INT_2:66。接下来创建B3的第二个对象，这也会导致B3类中成员的初始化，但static final int INT_2= r.nextInt(100);不会在被初始化，为什么前面已经提过。输出的结果是int1:56    INT_2:66。两次的输出INT_2的值都是一样的。

   在说回我们的第一个事例，V1到VAL_3说明final引用的意义。正如在main()方法中看见的，可以改变对象数组a的值，但不能将a的引用指向另一个对象。看起来使基本类型成为fianl比引用类型成为final的用处大。

   java也许生成"空白final",所谓空白final是指被声明为final但又未给初值的域。无论什么情况下编译器都会保证final域在使用前初始化。但空白final在fianl的使用上提供了很大的灵活性，为此，一个fianl域可以根据某些对象有所不同，却又保持恒定不变的特性。下面的事例说明了一点。

>     class Poppet {
>       private int i;
>       Poppet(int ii) { i = ii; }
>     }
>     
>     public class BlankFinal {
>       private final int i = 0; // Initialized final
>       private final int j; // Blank final
>       private final Poppet p; // Blank final reference
>       // Blank finals MUST be initialized in the constructor:
>       public BlankFinal() {
>         j = 1; // Initialize blank final
>         p = new Poppet(1); // Initialize blank final reference
>       }
>       public BlankFinal(int x) {
>         j = x; // Initialize blank final
>         p = new Poppet(x); // Initialize blank final reference
>       }
>       public static void main(String[] args) {
>         new BlankFinal();
>         new BlankFinal(47);
>       }
>     } //
> 

**final 参数**

   java中也许将参数列表中的参数以声明的方式声指明为final。这意味着你无发改变参数所指向的对象。
   
>     class Gizmo {
>       public void spin() {}
>     }
>     
>     public class FinalArguments {
>       void with(final Gizmo g) {
>         //! g = new Gizmo(); // Illegal -- g is final
>       }
>       void without(Gizmo g) {
>         g = new Gizmo(); // OK -- g not final
>         g.spin();
>       }
>       // void f(final int i) { i++; } // Can't change
>       // You can only read from a final primitive:
>       int g(final int i) { return i + 1; }
>       public static void main(String[] args) {
>         FinalArguments bf = new FinalArguments();
>         bf.without(null);
>         bf.with(null);
>       }
>     } //
> 

方法f()g()展示了基本类型的参数被指定为final是所出现的结果：你可以读参数，但不能修改参数。这一特性只要用来向匿名内部类传递数据。

**final 方法**

   使用final方法有两个原因。第一个原因是把方法锁定，以防止任何继承它的类修改它的含义。这是出于设计的考虑：想要确保在继承中使用的方法保持不变，并且不会被覆盖。

   过去建议使用final方法的第二个原因是效率。在java的早期实现中，如果将一个方法指明为fianl，就是同意编译器将针对该方法的所有调用都转为内嵌调用。当编译器发现一个final方法调用命令时，它会根据自己的谨慎判断，跳过插入程序代码这种正常的调用方式而执行方法调用机制（将参数压入栈，跳至方法代码处执行，然后跳回并清理栈中的参数，处理返回值），并且以方法体中的实际代码的副本来代替方法调用。这将消除方法调用的开销。当然，如果一个方法很大，你的程序代码会膨胀，因而可能看不到内嵌所带来的性能上的提高，因为所带来的性能会花费于方法内的时间量而被缩减。

  上面标颜色的地方不太懂。不知道那位看过Java编程思想和知道的高人给解释解释。

  在最进的java版本中，虚拟机(特别是hotspot技术)可以探测到这些情况，并优化去掉这些效率反而降低的额外的内嵌调用，因此不再需要使用final方法来进行优化了。事实上，这种做法正逐渐受到劝阻。在使用Java se5/6时，应该让编译器和JVM去处理效率问题，只有在想明确禁止覆盖式，才将方法设置为fianl的。

**final和private关键字**

   类中的所有private方法都是隐式的制定为final的。由于你无法访问private方法你也就无法覆盖它。可以对private方法添加final修饰词，但这毫无意义。

>     class WithFinals {
>       // Identical to "private" alone:
>       private final void f() { print("WithFinals.f()"); }
>       // Also automatically "final":
>       private void g() { print("WithFinals.g()"); }
>     }
>     
>     class OverridingPrivate extends WithFinals {
>       private final void f() {
>         print("OverridingPrivate.f()");
>       }
>       private void g() {
>         print("OverridingPrivate.g()");
>       }
>     }
>     
>     class OverridingPrivate2 extends OverridingPrivate {
>       public final void f() {
>         print("OverridingPrivate2.f()");
>       }
>       public void g() {
>         print("OverridingPrivate2.g()");
>       }
>     }

"覆盖"只有在某方法是基类接口的一部分时才会发生。即，必须将一个对象向上转型为它的基类并条用相同的方法。如果某方法是private的，它就不是基类接口的一部分。它仅是一些隐藏于类中的程序代码，如果一个基类中存在某个private方法，在派生类中以相同的名称创建一个public，protected或包访问权限方法的话，该方法只不过是与基类中的方法有相同的名称而已，并没有覆盖基类方法。由于private方法无法触及且有很好的隐藏性，所以把它看成是因为他所属类的组织结的原因而存在外，其他任何事物都不用考虑。

**final 类**

   当将类定义为final时，就表明了你不打算继承该类，而且也不也许别人这样做。换句话说，出于某种考虑，你对该类的设计永不需要做任何变动，或者出于安全的考虑，你不希望他有子类。

>     class SmallBrain {}
>     
>     final class Dinosaur {
>       int i = 7;
>       int j = 1;
>       SmallBrain x = new SmallBrain();
>       void f() {}
>     }
>     
>     //! class Further extends Dinosaur {}
>     // error: Cannot extend final class 'Dinosaur'
>     
>     public class Jurassic {
>       public static void main(String[] args) {
>         Dinosaur n = new Dinosaur();
>         n.f();
>         n.i = 40;
>         n.j++;
>       }
>     } 

   请注意，final类的域可以根据个人的意愿选择是或不是final。不论类是否被定义为final，相同的规则同样适用于定义为final的域。然而，由于final是无法继承的，所以被final修饰的类中的方法都隐式的制定为fianl，因为你无法覆盖他们。在fianl类中可以给方法添加final，但这不会产生任何意义。






