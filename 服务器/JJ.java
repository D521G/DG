import java.util.*;
import java.io.*;
import java.net.*;

public class JJ{
	public static void main(String[] args){
		try{
			ServerSocket serverSocket = new ServerSocket(9111);
			System.out.println("�����������ɹ�");
			Socket sockect = serverSocket.accept();
			System.out.println("���ڼ����˿�");
			InputStream inputStream = sockect.getInputStream();
			byte[] bytes = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = inputStream.read(bytes))!=-1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println("������:���Ǹ�ʲô��");
			System.out.println("�ͻ��ˣ�"+sb.toString());
			inputStream.close();
			String address = new String(sockect.getInetAddress().getHostName());
			System.out.print("���������ʵ�ַ��"+address);
		}catch (Exception e){

		}
	}
}