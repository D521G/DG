 ### 一，java环境变量设置 - 精简版
 ```
1.右键打开我的电脑->属性->高级->环境变量
 
2.新建系统变量JAVA_HOME和CLASSPATH
变量名(N)：JAVA_HOME 
变量值(V)：C:\Program Files\Java\jdk1.7.0
变量名(N)：CLASSPATH 
变量值(V)：.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;
 
3.选择“系统变量”中变量名为“Path”的环境变量，双击该变量，把jdk安装路径中bin目录的绝对路径，添加到Path变量的值中，并使用半角英文的分号和已有的路径进行分隔。 
变量名(N)：Path 
变量值(V)：%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
 ```
 
 ### 二，java环境设置 - 详细版
```
 把jdk安装到计算机后（这里以jdk1.7来安装，其他版本一样），再进行设置，java环境才能够生效。
 
    首先，右键点我的电脑。打开属性。然后选择“高级”里面的“环境变量”，在新打开的界面中的需要设置三个系统变量属性“JAVA_HOME”、“Path”、“CLASSPATH”。在没安装过jdk前，path属性是原本就存在的，而
 JAVA_HOME和CLASSPATH这俩个系统变量是不存在的，需要新建。 
 点“新建”，然后在“变量名(N)”写上JAVA_HOME，JAVA_HOME变量表示java的安装路径。然后在改变量值(N)写入刚才安装的路径“C:\jdk1.7”。
 （注： 如果安装的路径不是磁盘C或者不是在jdk1.7这个文件夹，可对应修改。以下文字都是假定安装在C:\jdk1.7里面。）
  
    其二，在系统变量里面找到Path，然后点“编辑”，Path变量表示系统在任何路径下都可以识别java命令。然后在改变量值(N)写入“.;%JAVA_HOME%\bin”，(其中“%JAVA_HOME%”的意思为刚才设置JAVA_HOME的值），也可以
 直接写上“C:\jdk1.7\bin”，推荐使用前者，复用性高。
 
    其三，再点“新建”，然后在变量名上写CLASSPATH,CLASSPATH变量表示java加载类(class or lib)路径，只有类在CLASSPATH中，java命令才能识别。然后在改变量值(N)写入“.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\toos.jar” (要加.表示当前路径) 
          
    最后，java环境变量设置完毕，按“确定”直至属性窗口消失，即保存成功
 验证java环境变量设置是否成功。先打开“开始”->“运行”，打入“cmd”，进入dos系统界面。然后输入“java -version”，如果安装成功。系统会显示java version jdk"1.7.0"。这样java环境变量设置OK了！
```
 ### 总结，java环境变量设置目的：
 ```
 1,JAVA_HOME
    （1）为了方便引用，例如你jdk安装在C:\Program Files\Java\jdk1.7.0目录里，则设置JAVA_HOME为该目录路径, 那么以后你要使用这个路径的时候, 只需输入%JAVA_HOME%即可, 避免每次引用都输入很长的路径串； 
    （2）归一原则, 当你jdk路径需要改变的时候, 你仅需更改JAVA_HOME的变量值即可, 否则你就要更改任何用绝对路径引用jdk目录的文档, 要是万一你没改全,某个程序找不到jdk, 后果就可能是程序崩溃； 
    （3）第三方软件会引用约定好的JAVA_HOME变量, 才能够正常使用该软件, 以后用JAVA久了就会知道, 要是某个软件不能正常使用, 很可能就是JAVA_HOME设置不对造成的； 
 
2，CLASSPATH
     设置CLASSPATH的目的是为了程序能找到相应的".class"文件, 举个例子: 编译一个JAVA程序---A.java, 会得到一个A.class的类文件,在当前目录下执行java A, 将会得到相应的结果(前提是已经设置
CLASSPATH为"."). 现在, 把A.class移到别的目录下(例如:"e:\"), 执行java A, 将会抛出java.lang.NoClassDefFoundError异常,原因就是找不到.class文件, 现在你把CLASSPATH增加为:".;e:\"再运行java A, 结果一切正常， java命令通过CLASSPATH找到了.class文件! 
 
3，PATH
      你想在任何时候都使用%JAVA_HOME%\bin\java 等来执行java命令吗, 当然不会, 于是, 你可以选择把 %JAVA_HOME%\bin添加到PATH路径下, 这样, 我们在任何路径下就可以仅用java来执行命令了.(当你在命令提示符窗口输入你个代码时,操作系统会在当前目录和PATH变量目录里查找相应的应用程序, 并且执行. 
 
 ```
 ### 三，java环境变量设置 - 错误案例
 ```
 错误：java.lang.NoClassDefFoundError 
描述：当 Java 虚拟机或 ClassLoader 实例试图在类的定义中加载（作为通常方法调用的一部分或者作为使用new 表达式创建的新实例的一部分），但无法找到该类的定义时，抛出此异常。 
原因：java环境变量设置错误
 ```