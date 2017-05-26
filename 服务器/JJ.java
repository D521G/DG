import java.util.*;
import java.io.*;
import java.net.*;

public class JJ{
	public static void main(String[] args){
		try{
			ServerSocket serverSocket = new ServerSocket(9111);
			System.out.println("服务器创建成功");
			Socket sockect = serverSocket.accept();
			System.out.println("正在监听端口");
			InputStream inputStream = sockect.getInputStream();
			byte[] bytes = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = inputStream.read(bytes))!=-1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println("服务器:你是干什么的");
			System.out.println("客户端："+sb.toString());
			inputStream.close();
			String address = new String(sockect.getInetAddress().getHostName());
			System.out.print("有人来访问地址是"+address);
		}catch (Exception e){

		}
	}
}