>     /*
>     样例1：
>       class Parent{
>          int num = 3;
>       }
>      
>       class Child extends Parent{
>          int num = 4;
>       }
>     */
>      
>     /*
>     样例2：
>     class Parent{
>      
>     }
>      
>     class Child extends Parent{
>         int num = 4;
>     }
>     */
>      
>     /*
>     样例3：
>     class Parent{
>         void show(){
>             System.out.println("Parent Show!");
>          }
>       }
>      
>       class Child extends Parent{
>         void show(){
>             System.out.println("Child Show!");
>          }
>       }
>     */
>      
>     /*
>     样例4：
>     class Parent{
>         
>       }
>      
>       class Child extends Parent{
>         void show(){
>             System.out.println("Child Show!");
>          }
>       }
>     */
>      
>      
>     class Parent{
>         static void show(){
>             System.out.println("Parent Show!");
>          }
>       }
>      
>       class Child extends Parent{
>         static void show(){
>             System.out.println("Child Show!");
>          }
>       }
>      
>      
>     public class PC{
>        public static void main(String[] args){
>             Parent p = new Child();
>             //样例1：
>             //System.out.println(p.num);// 3， 输出的是父类的num；
>              
>             //样例2：
>             //System.out.println(p.num);// 错误: 找不到符号 num
>              
>             //样例3：
>             //p.show();//Child Show!  输出的是子类的方法！
>              
>             //样例4：
>             //p.show();//  错误: 找不到符号   p.show();
>              
>             //样例5：
>             p.show();// Parent Show!  运行父类的静态方法。
>        } 
>     }
>      
>     /*
>     总结：
>     对象多态时：
>     1.成员变量：(不涉及覆盖)
>     编译时: 参考引用变量所属的类中是否有调用的成员变量， 有， 编译通过，没有，编译失败。
>     运行时: 参考引用变量所属的类中是否有调用的成员变量， 并运行该类所属中的成员变量。
>     简单的说：编译和运行都参考等号的左边。
>     2.成员函数（非静态）：
>     编译时：参考引用变量所属的类中是否有调用的成员变量， 有， 编译通过， 没有，编译失败：
>     运行时：参考的是对象所属的类中是否有调用的函数。
>     简单的说：编译看左边， 运行看右边。
>     3.静态函数， 变量：
>        编译和运行都是参考左边参数类型！
>        其实静态方法不存在多态， 静态方法是属于类的，我们说的是对象的多态！静态方法直接用类名调用就好了，
>        没必要创建对象！
>        静态的方法只能被静态的方法所覆盖！
>      
>     */