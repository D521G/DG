第一个类，服务器主线程类。

package src;//定义一个包,存放JAVA文件。

import java.io.*;//导入JAVA包,输入输出流包
import java.net.*;//导入JAVA包,网络应用包

public class SocketServer extends Thread {//服务器主线程，负责为每个发出请求连接的客户端分配一个服务线程。

 ServerSocket server;//定义一个对象
 
 public SocketServer() { //该类的午餐构造方法，负责初始化服务器，监听6000端口
  
  try {//捕捉异常的块
   
   server = new ServerSocket(6000);//实例化对象
  }
  catch(IOException e) {//捕捉流异常

   System.exit(0);//程序退出
  }

  this.start();//启动主线程
  
 }
 
 public void run() {//主线程的线程体
  
  try {//捕捉异常的块
   
   while(true) {//这里为TRUE,表示一直监听6000端口可
    
    Socket client = server.accept();//为每个请求建立一个SOCKET
    Service ss = new Service(client);//为每个SOCKET建立一个服务线程。 这里参考第二个类，SERVICE类
   }
  }
  catch(IOException e) {//捕捉异常的块

System.exit(1);//程序退出
  }
 }
 public static void main(String[] args) {//服务器程序入口，MAIN方法

  new SocketServer();//这里直接创建一个主线程对象，因为初始化写再无参构造函数里面，所以这里直接就启动主线程了。
 }
}
