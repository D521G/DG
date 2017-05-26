public class Student1{
	public Static void main(String[] args){
	try{
	    ServerSocket serverSocket = new ServerSocket(9111);

	    while(true){
		//创建服务端  并开通注册端口
		System.out.println("服务器毒啊创建成功");
		//监听对应端口 阻塞
		Socket socket = serverSocket.accept();
		System.out.println("正在监听端口");
		InputStream inputStream = sockect.getInputStream();
		byte[] bytes = new byte[1024];
		int len = 0;
		StringBuffer stringBuffer = new StringBuffer();
		while ((len = inputStream.read(bytes))!=-1){
			stringBuffer.append(new String(bytes,0,len));
		}
		System.out.println("服务器端 ：你是干啥么的");
		System.out.println("客户端："+stringBuffer.toString());
		
		inputStream.close();

		String address = new String(sockect.getIneAddress().getHostName());
		System.out.println("有人来访问地址是"+address);
	    }catch(Exception e){
		
		}
     }
   }
}