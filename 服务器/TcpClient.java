import java.net.*; 
import java.io.*; 
//���󣺿ͻ��˸��������˷���һ�����ݡ� 
class  TcpClient{ 
 public static void main(String[] args) throws Exception{ 
  Socket s = new Socket(""192.168.199.219",9111); 
  OutputStream out = s.getOutputStream();//��ȡ�� socket ���е���������� 
  out.write("tcp ��ʾ������������!".getBytes()); 
  s.close(); 
 } 
} 