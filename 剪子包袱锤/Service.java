�ڶ����ࣺ�������ķ����߳��ࡣ

package src;//����һ����,���JAVA��

import java.io.*;//ͬ��һ����
import java.net.*;//ͬ��һ����

public class Service extends Thread {//���Ƿ�����ÿ������ķ����߳��ࡣ

 String data;//����һ���ַ���

 BufferedReader inputs;//������

 PrintStream outputs;//�����

 Socket client;//����һ��SOCKET

 public Service(Socket socket) {//�����вι��췽����ͨ�������SOCKET������Ϊĳһ�������������������̵߳��õķ�����

  client = socket;//�����ݹ����Ĳ������ն�����������.

  try {//��׽�쳣�Ŀ�

   inputs = new BufferedReader(new InputStreamReader(client
     .getInputStream()));//��ȡ������
   outputs = new PrintStream(client.getOutputStream());//��ȡ�����

  } catch (IOException e) {

}
  this.start();//���������̡߳���ʼ�Կͻ�����
 }

 public void run() {//�̵߳���Ҫ������

  try {

   while (true) {//��ʾһֱ�����˿�

    data = inputs.readLine();//���������ж�ȡ�ͻ���������Ϣ������ֵ��DATA
    int res = (int) (Math.random() * 3);// 1��ʯͷ2�Ǽ���3�� ϵͳ��������������֣��ֱ��ʾ��Ϸ��������ȭ״̬
    if (data == null)//�����ȡ���������ǿ�ֵ���Ͳ��ټ�����һ��������
     break;
    else {//�����ȡ���Ĳ��ǿգ�����бȽ�

if (res == 0 && "ʯͷ".equals(data)) {

      data = "����Ҳ��ʯͷ����ƽ��!!";
     } else if (res == 0 && "����".equals(data)) {

      data = "������ʯͷ������Ӯ�ˣ���";
     } else if (res == 0 && "��".equals(data)) {

      data = "������ʯͷ����ϲ����Ӯ�ˣ���";
     } else if (res == 1 && "ʯͷ".equals(data)) {

      data = "�����Ǽ�������ϲ����Ӯ�ˣ���";
     } else if (res == 1 && "����".equals(data)) {

      data = "����Ҳ�Ǽ�������ƽ��!!";
     } else if (res == 1 && "��".equals(data)) {

      data = "�����Ǽ���������Ӯ�ˣ���";
     } else if (res == 2 && "ʯͷ".equals(data)) {

      data = "�����ǲ�������Ӯ�ˣ���";
     } else if (res == 2 && "����".equals(data)) {

      data = "�����ǲ�����ϲ����Ӯ�ˣ���";
     } else if (res == 2 && "��".equals(data)) {

      data = "����Ҳ�ǲ�����ƽ�ˣ���";
     }
     else {
      
     data = "���Բ���ʶ�����ȭ";
     }
     outputs.println(data);//���ȽϵĽ��ͨ������������ͻ��ˡ�
    }
   }
  } catch (IOException e) {

}
  try {

   client.close();//�رշ���
  } catch (IOException e) {

  }
 }
}
