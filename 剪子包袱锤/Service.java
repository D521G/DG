第二各类：服务器的服务线程类。

package src;//定义一个包,存放JAVA类

import java.io.*;//同上一个类
import java.net.*;//同上一个类

public class Service extends Thread {//这是服务于每个请求的服务线程类。

 String data;//定义一个字符串

 BufferedReader inputs;//输入流

 PrintStream outputs;//输出流

 Socket client;//定义一个SOCKET

 public Service(Socket socket) {//定义有参构造方法，通过传入的SOCKET对象来为某一个请求服务。这里就是主线程调用的方法。

  client = socket;//将传递过来的参数给刚定义的这个对象.

  try {//捕捉异常的块

   inputs = new BufferedReader(new InputStreamReader(client
     .getInputStream()));//获取输入流
   outputs = new PrintStream(client.getOutputStream());//获取输出流

  } catch (IOException e) {

}
  this.start();//启动服务线程。开始对客户服务。
 }

 public void run() {//线程的主要方法体

  try {

   while (true) {//表示一直侦听端口

    data = inputs.readLine();//从输入流中读取客户发来的消息，并赋值给DATA
    int res = (int) (Math.random() * 3);// 1是石头2是剪刀3布 系统随机生成三个数字，分别表示游戏的三个出拳状态
    if (data == null)//如果读取到的数据是空值，就不再继续下一步操作。
     break;
    else {//如果读取到的不是空，则进行比较

if (res == 0 && "石头".equals(data)) {

      data = "电脑也是石头，打平了!!";
     } else if (res == 0 && "剪刀".equals(data)) {

      data = "电脑是石头，电脑赢了！！";
     } else if (res == 0 && "布".equals(data)) {

      data = "电脑是石头，恭喜，你赢了！！";
     } else if (res == 1 && "石头".equals(data)) {

      data = "电脑是剪刀，恭喜，你赢了！！";
     } else if (res == 1 && "剪刀".equals(data)) {

      data = "电脑也是剪刀，打平了!!";
     } else if (res == 1 && "布".equals(data)) {

      data = "电脑是剪刀，电脑赢了！！";
     } else if (res == 2 && "石头".equals(data)) {

      data = "电脑是布，电脑赢了！！";
     } else if (res == 2 && "剪刀".equals(data)) {

      data = "电脑是布，恭喜，你赢了！！";
     } else if (res == 2 && "布".equals(data)) {

      data = "电脑也是布，打平了！！";
     }
     else {
      
     data = "电脑不认识你出的拳";
     }
     outputs.println(data);//将比较的结果通过输出流发给客户端。
    }
   }
  } catch (IOException e) {

}
  try {

   client.close();//关闭服务
  } catch (IOException e) {

  }
 }
}
