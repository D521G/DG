public class Student1{
	public Static void main(String[] args){
	try{
	    ServerSocket serverSocket = new ServerSocket(9111);

	    while(true){
		//���������  ����ͨע��˿�
		System.out.println("���������������ɹ�");
		//������Ӧ�˿� ����
		Socket socket = serverSocket.accept();
		System.out.println("���ڼ����˿�");
		InputStream inputStream = sockect.getInputStream();
		byte[] bytes = new byte[1024];
		int len = 0;
		StringBuffer stringBuffer = new StringBuffer();
		while ((len = inputStream.read(bytes))!=-1){
			stringBuffer.append(new String(bytes,0,len));
		}
		System.out.println("�������� �����Ǹ�ɶô��");
		System.out.println("�ͻ��ˣ�"+stringBuffer.toString());
		
		inputStream.close();

		String address = new String(sockect.getIneAddress().getHostName());
		System.out.println("���������ʵ�ַ��"+address);
	    }catch(Exception e){
		
		}
     }
   }
}