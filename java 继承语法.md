Java继承语法使用实例/例子代码教程；Java继承语法 继承与Java（以及其他OOP语言）非常紧密地结合在一起

**Java继承语法**

继承与Java（以及其他OOP语言）非常紧密地结合在一起。我们早在第1章就为大家引入了继承的概念，并
在那章之后到本章之前的各章里不时用到，因为一些特殊的场合要求必须使用继承。除此以外，创建一个类
时肯定会进行继承，因为若非如此，会从Java的标准根类Object中继承。 

用于合成的语法是非常简单且直观的。但为了进行继承，必须采用一种全然不同的形式。需要继承的时候，
我们会说：“这个新类和那个旧类差不多。”为了在代码里表面这一观念，需要给出类名。但在类主体的起
始花括号之前，需要放置一个关键字extends，在后面跟随“基础类”的名字。若采取这种做法，就可自动
获得基础类的所有数据成员以及方法。下面是一个例子： 

>     //: Detergent.java 
>     // Inheritance syntax & properties 
>     // http://www.yiibai.com
>     class Cleanser { 
>       private String s = new String("Cleanser"); 
>       public void append(String a) { s += a; } 
>       public void dilute() { append(" dilute()"); } 
>       public void apply() { append(" apply()"); } 
>       public void scrub() { append(" scrub()"); } 
>       public void print() { System.out.println(s); } 
>       public static void main(String[] args) { 
>         Cleanser x = new Cleanser(); 
>         x.dilute(); x.apply(); x.scrub(); 
>         x.print(); 
>       } 
>     } 
>      
>     public class Detergent extends Cleanser { 
>       // Change a method: 
>       public void scrub() { 
>         append(" Detergent.scrub()"); 
>         super.scrub(); // Call base-class version 
>       } 
>       // Add methods to the interface: 
>       public void foam() { append(" foam()"); } 
>       // Test the new class: 
>       public static void main(String[] args) { 
>         Detergent x = new Detergent(); 
>         x.dilute(); 
>         x.apply(); 
>         x.scrub(); 
>         x.foam(); 
>         x.print(); 
>         System.out.println("Testing base class:"); 
>         Cleanser.main(args); 
>       } 
>     } ///:~ 

```

这个例子向大家展示了大量特性。首先，在Cleanser append()方法里，字串同一个s连接起来。这是用
“+=”运算符实现的。同“+”一样，“+=”被Java用于对字串进行“过载”处理。 

其次，无论Cleanser还是Detergent都包含了一个main()方法。我们可为自己的每个类都创建一个
main()。通常建议大家象这样进行编写代码，使自己的测试代码能够封装到类内。即便在程序中含有数量众
多的类，但对于在命令行请求的public类，只有main()才会得到调用。所以在这种情况下，当我们使用
“java Detergent”的时候，调用的是Degergent.main()——即使Cleanser并非一个public类。采用这种
将main()置入每个类的做法，可方便地为每个类都进行单元测试。而且在完成测试以后，毋需将main()删
去；可把它保留下来，用于以后的测试。 

在这里，大家可看到Deteregent.main()对Cleanser.main()的调用是明确进行的。 

需要着重强调的是Cleanser中的所有类都是public属性。请记住，倘若省略所有访问指示符，则成员默认
为“友好的”。这样一来，就只允许对包成员进行访问。在这个包内，任何人都可使用那些没有访问指示符
的方法。例如，Detergent将不会遇到任何麻烦。然而，假设来自另外某个包的类准备继承Cleanser，它就
只能访问那些public成员。所以在计划继承的时候，一个比较好的规则是将所有字段都设为private，并将
所有方法都设为public（protected成员也允许衍生出来的类访问它；以后还会深入探讨这一问题）。当
然，在一些特殊的场合，我们仍然必须作出一些调整，但这并不是一个好的做法。 

注意Cleanser在它的接口中含有一系列方法：append()，dilute()，apply()，scrub()以及print()。由于
Detergent是从Cleanser衍生出来的（通过extends关键字），所以它会自动获得接口内的所有这些方法—
—即使我们在Detergent里并未看到对它们的明确定义。这样一来，就可将继承想象成“对接口的重复利
用”或者“接口的再生”（以后的实施细节可以自由设置，但那并非我们强调的重点）。 
正如在scrub()里看到的那样，可以获得在基础类里定义的一个方法，并对其进行修改。在这种情况下，我
们通常想在新版本里调用来自基础类的方法。但在scrub()里，不可只是简单地发出对scrub()的调用。那样
便造成了递归调用，我们不愿看到这一情况。为解决这个问题，Java提供了一个super关键字，它引用当前
类已从中继承的一个“超类”（Superclass）。所以表达式super.scrub()调用的是方法scrub()的基础类版
本。 

进行继承时，我们并不限于只能使用基础类的方法。亦可在衍生出来的类里加入自己的新方法。这时采取的
做法与在普通类里添加其他任何方法是完全一样的：只需简单地定义它即可。extends关键字提醒我们准备
将新方法加入基础类的接口里，对其进行“扩展”。foam()便是这种做法的一个产物。 
在Detergent.main()里，我们可看到对于Detergent对象，可调用Cleanser以及Detergent内所有可用的
方法（如foam()）。
```