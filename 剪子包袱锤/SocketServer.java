��һ���࣬���������߳��ࡣ

package src;//����һ����,���JAVA�ļ���

import java.io.*;//����JAVA��,�����������
import java.net.*;//����JAVA��,����Ӧ�ð�

public class SocketServer extends Thread {//���������̣߳�����Ϊÿ�������������ӵĿͻ��˷���һ�������̡߳�

 ServerSocket server;//����һ������
 
 public SocketServer() { //�������͹��췽���������ʼ��������������6000�˿�
  
  try {//��׽�쳣�Ŀ�
   
   server = new ServerSocket(6000);//ʵ��������
  }
  catch(IOException e) {//��׽���쳣

   System.exit(0);//�����˳�
  }

  this.start();//�������߳�
  
 }
 
 public void run() {//���̵߳��߳���
  
  try {//��׽�쳣�Ŀ�
   
   while(true) {//����ΪTRUE,��ʾһֱ����6000�˿ڿ�
    
    Socket client = server.accept();//Ϊÿ��������һ��SOCKET
    Service ss = new Service(client);//Ϊÿ��SOCKET����һ�������̡߳� ����ο��ڶ����࣬SERVICE��
   }
  }
  catch(IOException e) {//��׽�쳣�Ŀ�

System.exit(1);//�����˳�
  }
 }
 public static void main(String[] args) {//������������ڣ�MAIN����

  new SocketServer();//����ֱ�Ӵ���һ�����̶߳�����Ϊ��ʼ��д���޲ι��캯�����棬��������ֱ�Ӿ��������߳��ˡ�
 }
}
