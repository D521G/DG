import java.net.*; 
import java.io.*; 
//需求：客户端给服务器端发送一个数据。 
class  TcpClient{ 
 public static void main(String[] args) throws Exception{ 
  Socket s = new Socket(""192.168.199.219",9111); 
  OutputStream out = s.getOutputStream();//获取了 socket 流中的输出流对象。 
  out.write("tcp 演示，哥们又来了!".getBytes()); 
  s.close(); 
 } 
} 