>     java  抽象类与接口的定义
>     
>     Jvm ：
>     
>     抽象规范；
>     
>     一个具体实现
>     
>     一个运行的虚拟机实例
>     
>     装载器： 启动类装载器，自定义装载器（继承 java.lang.ClassLoader ）
>     
>     解析的内型信息放入方法区，对象放入堆，一个新线程，有自己 java 栈放中间数据， pc 计数器。
>     
>     接口与抽象类深入
>     
>     java 没有多重继承，意味一个类只能继承一个父类所以绝对必要的时候，才用继承
>     
>     所以表示相同行为的方法都应该声明为一个接口的的形式，并使用不同的实现类对其进行实现。
>     
>     缺点：每一个实现类都需要显示的实现声明中所有的方法。即便有些时候 ， 这些方法 代表着不变的功能部分 ，并且在所有类中都有完全相同的实现，这样导致冗余代码。
>     
>     Public abstract class Employee{
>     
>     String name ;
>     
>     String id;
>     
>     Public Employee (String empName, String empId){
>     
>     name=empName;
>     
>     id = empId;
>     
>     }
>     
>     public String getName()
>     
>     {
>     
>     return name;
>     
>     }
>     
>     Public String getID(){
>     
>     return id;
>     
>     }
>     
>     }
>     
>     Public void save(){
>     
>     fileUtil futil=new FileUtil();
>     
>     futil.writeToFile(“emp.txt”,this,toString,true,true);
>     
>     }
>     
>     Public abstract String computeCompensation();
>     
>     }
>     
>     不同的头衔的雇员，计算薪水的方式不同。这样一种操作多种方法实现。
>     
>     public class consultant extends Employee{
>     
>     public String computeCompensation(){
>     
>     Return(“consultant salary ”);
>     
>     }
>     
>     Public consultant(String empname,String empid){
>     
>     super(empname,empid);
>     
>     }
>     
>     }
>     
>     Pulbic class salesRep exends Employee{
>     
>     Public String computeCompensation(){
>     
>     Retrun(“salesRep salary”);
>     
>     }
>     
>     Public salesRep(String empName,String empId){
>     
>     super(empName,empId);
>     
>     }
>     
>     }
>     
>     用抽象类来实现
>     
>      
>     
>     用接口来实现
>     
>     用接口来实现的话，实现类中都要给出
>     
>     Save ,getid,getname 等方法。这样导致了冗余代码。
>     
>      
>     
>      
>     
>      
>     
>     接口和抽象类在设计层面上的区别
>     
>     “一个类一次只能继续一个抽象类，但可以实现若干个接口”。
>     
>     首先注重这个要点的用词：“继续－－－类，实现－－－接口”，抽象父类和他的子类在体现出的是一种“继续”关系，要想使得“继续”关系合理，抽象父类和子类之间应该存在着“ is － a“ 关系，即父类和子类在概念本质上应该是相同的。
>     
>     而 对于接口来说则不然，接口是拿来“实现”的，并不要求接口的实现类和接口定义在概念本质上是一致的，因为众所周知，接口只是定义了一组方法的框架，它的本 质是行为特征的集合，规范。一个类实现了接口，仅仅是实现了接口所定义的规范而已，实现了接口的类并不“属于”接口！这时，应该说接口和实现了接口的子类 的关系是一种“like － a” 的关系。
>     
>     而且，一个类是可以实现多个接口的，在这种情况下，实现多个接口的类体现出的是“ like － a ， like － b， like － c” 的关系。在单继续的 Java 中，抽象类是做不到这点的。假设即使能这么做，假如一个类“ is － a， is － b ， is － c” ，这和我们对世界的理解也不太一致。因为我们看待事物时，习惯把事物归属一类，但同时可以具有其他类的特征。
>     
>      
>     
>     考虑这样一个例子，假设我们在为一个生产厂家开发手机软件，问题领域中有一个关于手机的抽象概念，该手机具一些动作如开机，关机等，此时我们可以通过接口或者抽象类来定义一个表示该抽象概念的类型，定义方式分别如下所示：
>     
>     使用接口方式定义手机：
>     
>     Interface Mobile_phone{
>     
>     Void pen （） ;
>     
>     Void close （） ;
>     
>     }
>     
>     使用抽象类方式定义手机：
>     
>     Abstract class Mobile_phone{
>     
>     Abstract void open （）；
>     
>     Abstract void close （）；
>     
>     }
>     
>     而具体的手机类型可以继续抽象类方式定义，或者使用实现接口的方式定义。看起来似乎使用接口和抽象类没有大的区别。
>     
>      
>     
>     假如现在要求手机要集成有信用卡的功能。我们应该如何设计针对该例子的类结构呢？
>     
>     信用卡的一些基本功能有，电子钱包，消费等，这些功能和手机的开机关机功能属于两个不同的概念，根据 ISP （InterfaceSegregationPrinciple ）原则应该把它们分别定义在代表这两个概念的抽象表示中。这时“信用卡”这个抽象概念的定义可能是这两种情况：
>     
>     Interface Creditcard {
>     
>     Void e_wallet （） ; // 电子钱包
>     
>     Void consume （） ; // 消费
>     
>     }
>     
>     或
>     
>     Abstract class Creditcard{
>     
>     Abstract void e_wallet （） ;
>     
>     Abstract void consume （）；
>     
>     }
>     
>     这时手机和银行卡这两个概念的定义方式就有了四种可能的组合，如下表：
>     
>     手机
>     
>     信用卡
>     
>      
>     
>      
>     
>     方案 A
>     
>     手机 定义为抽象类
>     
>     信用卡 定义为抽象类
>     
>     方案 B
>     
>     手机定义为抽象类
>     
>     信用卡定义为接口
>     
>     方案 C
>     
>     手机定义为接口
>     
>     信用卡定义为抽象类
>     
>      
>     
>     方案 D
>     
>     手机定义为接口
>     
>     信用卡定义为接口
>     
>     方案 A 可以马上排除，因为 Java 不支持多继续， 手机要集成有信用卡 实现类这无法同时继续这两个抽象类。在这里可以看到抽象类在通过概念的组合来扩展功能的时候是不方便的。
>     
>      
>     
>     研究一下方案 C ，如本文所述，这时实现这两个概念的类和这两个概念之间的关系就是：“ like” 手机，“is” 信用卡。显然这和我们对问题领域的理解不符。因为“带信用卡功能的手机” 在概念本质上是手机，同时具有信用卡的功能 。所以这个方案是不合理的。除非我们是在为信用卡的制造商写软件，他们希望加入手机的功能。
>     
>     而且，假如手机再扩展功能，如电子地图，导航器—－－等等，把这种扩展的功能概念象“信用卡”一样定义为抽象类的话，由于 Java 的单继续机制，这是无法实现的。这道理和方案 A 一样，把用来扩展功能的概念定义为抽象类并不合适。
>     
>      
>     
>     方案 B 应该是目前最合理的设计了，这时反映出的概念是“ is 手机， like 信用卡”。假如有扩展功能的话，可以再定义成接口，成为“ is 手机， like 信用卡 like 电子地图－－－”，从而正确的反应我们面对的问题域。
>     
>      
>     
>     那方案 D 是不是就不行呢？
>     
>     相对方案 C 来说，方案 D 的设计没有反映出“手机”是问题领域的本质的主体，使人有“到底我们在搞手机还是信用 卡还是别的什么东西？”这个疑问。这个缺点是不容置疑的。但从另一方面来说，“手机”这个概念定义成接口，在软件规模扩大的前提下，也许为以后其他的组件 的使用提供了方便。比如说，假设厂家又有一个“遥控器”的概念要我们设计，要把手机的功能设计进去，这时候“手机”假如是接口就方便了， implements 他就行。所以说，方案 D 是牺牲了概念的清楚性，得到了扩展性。
>     
>      
>     
>     这里得到的结论就是：假如只是在定义一组行为框架的话，抽象类合适用来定义问题领域中的本质的抽象概念，接口合适用来定义扩展功能的抽象概念。
>     
>      
>     
>     不能说这个结论就总结了抽象类和接口的全部区别，这只是问题的一小部分结论而已。再举一个例子来说明他们的另外一方面的区别。
>     
>      
>     
>     在刚刚这个例子中，“手机”，“信用卡”仅仅是一组抽象方法，也就是概念中含有的只是行为框架没有实现，这时候定义成抽象类或接口都有自己的道理。假如概念中已经含有了实现，这时候就把应该概念定义成抽象类了。
>     
>      
>     
>     比如一个” A 系列打印机”的抽象类，由他定义不同类型的打印机，那一系列的打印机打印页头，页脚的方案都是一样的，但打印页面主体比较复杂，各种具体型号的打印机的各有它们不同的打印方法，这时可以这么设计：
>     
>      
>     
>      
>     
>     方案一：按照打印机应该打印完整页面的自然逻辑， body 抽象方法是打印机这个概念的一部分，设计为抽象类：
>     
>      
>     
>     Abstract class A_SeriesPrinter{
>     
>     Abstract protected void PrintBody （） ;
>     
>     Public void OutReport （） {
>     
>     PrintHeader （） ;
>     
>     PrintBody （） ;
>     
>     PrintFooter （） ;
>     
>     }
>     
>     Protected void Draw （ Stringstr ） {/ 实现的代码 /}
>     
>     Protected void PrintHeader （） {Draw （“ Head“ ） ;/ 实现的代码 /}
>     
>     Protected void PrintFooter （） {Draw （“ Footer“ ） ;/ 实现的代码 /}
>     
>     }
>     
>     继续抽象类的代码：
>     
>     Class XXPrinter extends A_SeriesPrinter{
>     
>     Protected void PrintBody （） {/ 实现的代码 /} // 这个一定要实现吧？
>     
>     }
>     
>     classYYPrinter extends A_SeriesPrinter{
>     
>     protected void PrintBody （） {/ 实现的代码 /}
>     
>     }
>     
>     运用的代码：
>     
>     XXPrinterxx ＝ new XXPrinter （） ;
>     
>     Xx ． OutReport （） ;
>     
>     YYPrinteryy ＝ new YYPrinter （） ;
>     
>     Yy ． OutReport （） ;
>     
>     显然这个方案是简单而清楚的。
>     
>     方案二：为了扩展性，硬把 body 抽象方法取出来成为一个接口，代码如下：
>     
>     Abstract class A_SeriesPrinter{ // 思考一下，还用 abstract 么？
>     
>     Protected void Draw （ Stringstr ） {/ 实现的代码 /}
>     
>     Protected void PrintHeader （） {Draw （“ Head“ ） ;/ 实现的代码 /}
>     
>     Protected void PrintFooter （） {Draw （“ Footer“ ） ;/ 实现的代码 /}
>     
>     }
>     
>     Interface Body{
>     
>     void PrintBody （） ;// 多了一个 Body 接口的概念
>     
>     }
>     
>     在这里先解决一个问题，假如 Printer 去掉了 PrintBody 抽象方法，都是实现了的方法，是不是就应该把它定义为普通的类呢？
>     
>     答案是否定的，设计一个抽象概念为抽象类的意义，不是因为它含有抽象方法，而主要因为是他表示的概念不应该被实例化，即使它里头的方法全部是实现了的，想让子类继续的代码。在上面这个例子中，” A 系列打印机”这个概念，是不应该有实例的， 有实例的应该是具体型号的打印机 。所以，即便是全部是实现了的方法，方案二中的A_SeriesPrinter 还是定义成抽象类更好。
>     
>      
>     
>     好，继续看继续类并实现接口的代码：
>     
>     Class XXPrinter extends A_SeriesPrinter implement Body {
>     
>     Public void PrintBody （） {;/ 实现的代码 /}
>     
>     Public void OutReport （） {//OutReport （）被迫移到了实现类
>     
>     PrintHeader （） ;
>     
>     PrintBody （） ;
>     
>     PrintFooter （） ;
>     
>     }
>     
>     }
>     
>     Class YYPrinter extends A_SeriesPrinter implement sBody{
>     
>     Public void PrintBody （） {;/ 实现的代码 /}
>     
>     Public void OutReport （） {//OutReport （）被迫移到了实现类
>     
>     PrintHeader （） ;
>     
>     PrintBody （） ;
>     
>     PrintFooter （） ;
>     
>     }
>     
>     }
>     
>     运用的代码：
>     
>     XXPrinter xx ＝ new XXPrinter （） ;
>     
>     Xx ． OutReport （） ;
>     
>     YYPrinter yy ＝ new YYPrinter （） ;
>     
>     Yy ． OutReport （） ;
>     
>     这样做会显得很希奇和复杂： class XXPrinter extends Printer implements Body ？似 乎打印 Body 竟然是打印机的附加功能？还无故的多出了一个 Body 接口的概念。而且， OutReport （）被迫移到了各个实现类，代码变长而且复杂了。
>     
>     所以这时抽象类是最好的选择。除非有业务要求需要把 Body 的打印从打印机分离出来。套到别的概念中去。这时才有考虑使它成为接口的可能，但再次提醒大家，代码会变得复杂。
>     
>     追溯问题出现的源头，是因为 PrintBody （）这个抽象方法和打印机这个概念结合的太紧密了，它本身就是打印机功能的不可缺少的 一部分。贪图接口语法上的灵活性，盲目的追求扩展性开放性，而不顾对问题领域的理解而建模，只要某一个概念中含有的行为框架都分离出来搞成接口，就会有一 系列的编码上和理解上的麻烦，反而增加了代码的复杂性，自讨苦吃。
>     
>     然而，即使在使用抽象类的场合，也不要忽视通过接口定义行为模型的原则。假如依靠于抽象类来定义行为，往往导致过于复杂的继承关系， 而通过接口定义行为能够更有效地分离行为与实现，为代码的维护和修改带来方便。
>     
>     比如我扩展 A_SeriesPrinter 类，在打印后加个日志信息，如 viodoutLog （）方法什么的，那么我就不应该把它定义成 A_SeriesPrinter 类的抽象方法了，而是日志接口了。因为“日志”这概念不属于打印机的专有范畴。这样以后其他模块用到关于日志的操作规范时可以方便地用到这个日志接口。
>     
>     所以，关键在于能否出色地结合业务要求对问题域进行理解分析。假如你没有做好这点，你就不能建立合理的模型 。
>     
>      
>     
>     总结：
>     
>     1 接口能向上转型多个基本型别。
>     
>     2 接口，接口让客户端程序员无法产生对象，确保这只是个接口，抽象类而无实体
>     
>     3 你设计基本类 base class 时候，不带任何函数定义或成员变量时候，优先考虑 interface,( 如果必须带有函数定义或成员变量时候，改用 abstract class)
>     
>     4 . 为了消除不变功能部分相同实现，避免代码冗余，应用抽象类
>     
>     5. 多态实现中 , is- a 和 like-a 关系
>     
>     Is-a 是一种完全替换 base class 方法 ( 覆写 overring ) ，重载（ overloader ）功能，可以用interface 来实现说接口和实现了接口的子类的关系是一种“ like － a” 多态。
>     
>     看java用法
>     
>     从设计理念层面看 abstract class 和 interface
>     
>     　　上面主要从语法定义和编程的角度论述了abstract class和interface的区 别，这些层面的区别是比较低层次的、非本质的。本小节将从另一个层面：abstract class和interface所反映出的设计理念，来分析一下二者的区别。作者认为，从这个层面进行分析才能理解二者概念的本质所在。
>     
>     　　前面已经提到过，abstract class在Java语言中体现了一种继承关系，要想使得 继承关系合理，父类和派生类之间必须存在"is-a"关系，即父类和派生类在概念本质上应该是相同的。对于interface来说则不然，并不要求interface的实现者和interface定义在概念本质上是一致的， 仅仅是实现了interface定义的契约而已。为了使论述便于理解，下面将通过一个简单的实例进行说明。
>     
>     　　考虑这样一个例子，假设在我们的问题领域中有一个关于Door的抽象概念，该Door具有执行两个动作open和close，此时我们可以通过abstract class或者interface来定义一个表示该抽象概念的类型，定义方式分别如下所示
>     
>     接口定义
>     关于java的接口定义方式，以下三种情况下可以采用接口定义方式：
>     1.    接口中声明的变量全部为final 和static类型的，并且这个接口的作用在于定义一些值不能改变的变量。
>     举个例子：
>     public interface ObjectConstants{
>     public static final String SPACE = new String(" ");
>     public static final char FORMFEED = 'f';
>     }
>     2.    接口中只定义可供实现的抽象方法
>     EventListener.java
>         public interface EventListener {
>         public void handleEvent(Event evt);
>         }
>     Runnable.java
>     package java.lang;
>         public interface Runnable {   
>         public abstract void run();
>         }
>     3.    还有一种方式是上述两种方式的组合，如非必要一般会将这样一个接口定义拆分成两个接口定义
>     抽象类的定义
>     1.    如果一个类包含一个接口但是不完全实现接口定义的方法，那么该类必须定义成abstract型
>     例如InputStream.java类的定义方式：
>     package java.io;
>     public abstract class InputStream implements Closeable {
>         // SKIP_BUFFER_SIZE is used to determine the size of skipBuffer
>         private static final int SKIP_BUFFER_SIZE = 2048;
>         // skipBuffer is initialized in skip(long), if needed.
>         private static byte[] skipBuffer;   
>         public abstract int read() throws IOException;
>     
>        
>         public int read(byte b[]) throws IOException {
>         return read(b, 0, b.length);
>         }   
>         public int read(byte b[], int off, int len) throws IOException {
>         if (b == null) {
>             throw new NullPointerException();
>         } else if ((off < 0) || (off > b.length) || (len < 0) ||
>                ((off + len) > b.length) || ((off + len) < 0)) {
>             throw new IndexOutOfBoundsException();
>         } else if (len == 0) {
>             return 0;
>         }
>         int c = read();
>         if (c == -1) {
>             return -1;
>         }
>         b[off] = (byte)c;
>         int i = 1;
>         try {
>             for (; i < len ; i++) {
>             c = read();
>             if (c == -1) {
>                 break;
>             }
>             if (b != null) {
>                 b[off + i] = (byte)c;
>             }
>             }
>         } catch (IOException ee) {
>         }
>         return i;
>         }
>      public long skip(long n) throws IOException {
>         long remaining = n;
>         int nr;
>         if (skipBuffer == null)
>             skipBuffer = new byte[SKIP_BUFFER_SIZE];
>         byte[] localSkipBuffer = skipBuffer;        
>         if (n <= 0) {
>             return 0;
>         }
>         while (remaining > 0) {
>             nr = read(localSkipBuffer, 0,
>                   (int) Math.min(SKIP_BUFFER_SIZE, remaining));
>             if (nr < 0) {
>             break;
>             }
>        remaining -= nr;
>         }    
>         return n - remaining;
>         } 
>         public int available() throws IOException {
>         return 0;
>         }   
>         public void close() throws IOException {}  
>         public synchronized void mark(int readlimit) {}    
>         public synchronized void reset() throws IOException {
>         throw new IOException("mark/reset not supported");
>         }
>         public boolean markSupported() {
>         return false;
>         }
>     }
>     2.    抽象类的方法体中只定义抽象的方法，例如AbstractMethodError.java
>         package java.lang;
>         public class AbstractMethodError extends IncompatibleClassChangeError {
>         public AbstractMethodError() {
>         super();}
>         public AbstractMethodError(String s) {
>         super(s); }
>     }