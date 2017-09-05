```
是静态修饰符，什么叫静态修饰符呢？大家都知道，在程序中任何变量或
者代码都是在编译时由系统自动分配内存来存储的，而所谓静态就是指在
编译后所分配的内存会一直存在，直到程序退出内存才会释放这个空间，
也就是只要程序在运行，那么这块内存就会一直存在。这样做有什么意义
呢？ 

在Java程序里面，所有的东西都是对象，而对象的抽象就是类，对于一个
类而言，如果要使用他的成员，那么普通情况下必须先实例化对象后，通
过对象的引用才能够访问这些成员，但是有种情况例外，就是该成员是用s
tatic声明的（在这里所讲排除了类的访问控制），
```
**例如**

>     未声明为static  
>     class ClassA{  
>     int b;  
>     public void ex1(){  
>     …  
>     }  
>     }  
>     class ClassB{  
>     void ex2{  
>     int i;  
>     ClassA a = new ClassA();  
>     i = a.b; //这里通过对象引用访问成员变量b  
>     a.ex1; //这里通过对象引用访问成员函数ex1  
>     }  
>     }  
>      
>     声明为static  
>     class ClassA{  
>     static int b;  
>     static void ex1(){  
>     …  
>     }  
>     }  
>     class ClassB{  
>     void ex2{  
>     int i;  
>     i = ClassA.b; //这里通过类名访问成员变量b  
>     ClassA.ex1; //这里通过类名访问成员函数ex1  
>     }  
>     } 

```
通过以上两种比较，就可以知道static用来修饰类成员的主要作用了，在j
ava类库当中有很多类成员都声明为static，可以让用户不需要实例化对象
就可以引用成员，最基本的有Integer.parseInt()，Float.parseFloat()
等等用来把对象转换为所需要的基本数据类型。这样的变量和方法我们又
叫做类变量和类方法。  
接下来讲一下被static修饰后的变量的值的问题，刚才在前面讲过，被sta
tic修饰后的成员，在编译时由内存分配一块内存空间，直到程序停止运行
才会释放，那么就是说该类的所有对象都会共享这块内存空间，看一下下
面这个例子： 
```
>     class TStatic{  
>     static int i;  
>      
>     public TStatic(){  
>     i = 4;  
>     }  
>      
>     public TStatic(int j){  
>     i = j;  
>     }  
>      
>     public static void main(String args[]){  
>     TStatic t = new TStatic(5); //声明对象引用，并实例化  
>     TStatic tt = new TStatic(); //同上  
>     System.out.println(t.i);  
>     System.out.println(tt.i);  
>     System.out.println(t.i);  
>     }  
>     }  

```
这段代码里面Tstatic类有一个static的int变量I，有两个构造函数，第一
个用于初始化I为4，第二个用于初始化i为传进函数的值，在main中所传的
值是5，程序首先声明对象的引用t，然后调用带参数的构造函数实例化对
象，此时对象t的成员变量I的值为5，接着声明对象tt，调用无参数的构造
函数，那么就把对象tt的成员变量i的值初始化为4了，注意了，在这里i是
static，那就是说该类的所有对象都共享该内存，那也就是说在实例化对
象tt的时候改变了i的值，那么实际上对象t的i值也变了，因为实际上他们
引用的是同一个成员变量。最后打印的结果是三个4。
```