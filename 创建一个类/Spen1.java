public class Spen1{
	public static int i = 0;

	public static Scanner sc = new Scanner(System.in);


	public static void main( String[] agrs){


		Udent();
	
	}
	
	static void Udent(){
	System.out.println("-----------------");
	System.out.println("-------����------");
	System.out.println("----��ӭ����-----");
	System.out.println("----��Ʒ����-----");
	System.out.println("----��Ʒ����-----");
	System.out.println("----��Ʒ����-----");
	System.out.println("----��Ʒ��С-----");
	System.out.println("----�˳�ϵͳ-----");
    
	int a = sc.nextInt();

	switch (a){

	case 1:
	Spenname();
	break;

		case 2:
	Spenshu();
	break;

	case 3:
	Spenshu();
	break;
	
	case 4:
	Spenlei();
	break;

	case 5:
	Spenbig();
	break;
	default:
	System.out.println("ɵ�ƣ���������۾��ɴ�");
	Udent();
	}
	
}



	//��Ʒ����
	public static void Spenname(){
	Spen spen = new Spen();
	System.out.println("ѡ��� ˧������Ů��");
	System.out.println("��������Ʒ����");
	String name = sc.nextlin;
	System.out.println("��������Ʒ����");
	int shumu = sc.nextInt;
	System.out.println("��������Ʒ����");
	String lei = sc.nextlin;
	System.out.println("��������Ʒ�۸�");
    String big = sc.nextlin;

	


	//��������ֵ
	spen.name =  name;
	spen.shumu = shumu;
	spen.lei = lei;
	spen.big = big;
	System.out.println("¼��ɹ�");
	Udent();
	
	}
	//��Ʒ����
	public static void Spenshu(){
	
	
	}
	//��Ʒ����
	public static void Spenlei(){
	
	}
	//��Ʒ��С
	public static void Spenbig(){
	
	
	}
}