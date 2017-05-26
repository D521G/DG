���������ͻ����ࡣ

package src;//ͬ��һ����

import java.io.*;//ͬ��һ����
import java.net.*;//ͬ��һ����

public class Client {//�ͻ�����

 public static void main(String[] args) {//�ͻ��˳������,MAIN����
  
  String data;//�����ַ���
  Socket client = null;//����SOCKET
  BufferedReader inputs = null;//������
  BufferedReader key = null;//������
  PrintStream outputs = null;//�����
 
  try {
   
   client = new Socket("localhost",6000);//�ͻ���������ͨ��6000�˿ںͷ�������ϵ���ͷ��������ֶ˿�һ�¡�
   inputs = new BufferedReader(new InputStreamReader(client.getInputStream()));//��ȡ������
   outputs = new PrintStream(client.getOutputStream());//��ȡ�����
   key = new BufferedReader(new InputStreamReader(System.in));//���ڽ����û�Ҫ���͸��ͻ��˵��ַ�����
  }
  catch(IOException e) {
   
  System.out.println("CAN NOT CONN WITH SERVER");
  }
  
  try {
   
   while(true) {
    System.out.println("----------------------------");
    System.out.print("���ȭ��ʯͷ/����/�� ");
    data = key.readLine();//��ȡ�û�������ַ�����
    outputs.println(data);//����ȡ���ַ������͸���������
    System.out.println("ECHO: " + inputs.readLine());//���ط������Ľ������ӡ������̨��
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
