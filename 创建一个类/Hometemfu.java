import java.util.*;
public class Hometemfu{
		
	 
	
	public static void main(String[] args){

	CuBing();
	
	}
	static void CuBing(){
		System.out.println("����������������������������");
		System.out.println("---------------------------");
		System.out.println("      ��������Ӧ�ı��     ");
		System.out.println("-------1.�������д�Ǯ------");
		System.out.println("-------2.��������ȡǮ------");
		System.out.println("-------3.��������תǮ------");
		System.out.println("-------4.�˳�����ƽ̨------");
		System.out.println("����������������������������");

		int a = sc.nextiInt();
		
		switch (a){
		
		case 1:
			CubMe(); break;

		case 2:
			QunMe(); break;

		case 3:
			ZhuMe(); break;

		case 4: 
			TunMe(); break;

		default :
			System.out.println("�������,����������");
		CuBiing();
		
		}

	}
	//���д�Ǯ
	public static void CubMe(){

	Hometem c = new Hometem

	System.out.println("������¼�����ݣ��뿪ʼ");
	System.out.println("�������Ǯ��Ŀ");
	int Cmane = sc.nextInt;
	System.out.println("������ȡǮ��Ŀ");
	int Qmane = sc.nextInt;
	System.out.println("������תǮ��Ŀ");
	int Zmane = sc.nextInt;
	c.Cmane=Cmane;
	c.Qmane=Qmane;
	c.Zmane=Zmane;
	System.out.println("¼��ɹ�");
	System.out.println("��������ټ�");
	CuBing();
	}
	//����ȡǮ
	public static void QunMe(){
		
	
	
	
	}
	//����תǮ
	public static void ZhuMe(){
	
	
	}
	//�˳�
	public static void TunMe(){
	
	
	
	}

}