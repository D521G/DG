第三个，客户端类。

package src;//同上一个类

import java.io.*;//同上一个类
import java.net.*;//同上一个类

public class Client {//客户端类

 public static void main(String[] args) {//客户端程序入口,MAIN方法
  
  String data;//定义字符串
  Socket client = null;//定义SOCKET
  BufferedReader inputs = null;//输入流
  BufferedReader key = null;//输入流
  PrintStream outputs = null;//输出流
 
  try {
   
   client = new Socket("localhost",6000);//客户程序启动通过6000端口和服务器联系，和服务器保持端口一致。
   inputs = new BufferedReader(new InputStreamReader(client.getInputStream()));//获取输入流
   outputs = new PrintStream(client.getOutputStream());//获取输出流
   key = new BufferedReader(new InputStreamReader(System.in));//用于接收用户要发送给客户端的字符串。
  }
  catch(IOException e) {
   
  System.out.println("CAN NOT CONN WITH SERVER");
  }
  
  try {
   
   while(true) {
    System.out.println("----------------------------");
    System.out.print("请出拳：石头/剪刀/布 ");
    data = key.readLine();//读取用户输入的字符串。
    outputs.println(data);//将读取的字符串发送给服务器。
    System.out.println("ECHO: " + inputs.readLine());//返回服务器的结果并打印到控制台。
   }
  }
  catch(IOException e) {
   
   System.out.println("ERROR IO");
  }
  
  try {
   
   client.close();
  }
  catch(IOException e) {
   
   System.out.println("can not close it");
  }
 }
}
