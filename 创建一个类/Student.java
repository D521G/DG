import java.util.*;
public class Student
{   //ȫ�ֱ��� 
	public static int i = 0;

	public static Scanner sc = new Scanner(System.in);

	public static Tesc[] tesc =new Tesc[100];

	public static void main(String[] args){

	TescStudent();
	
	}
	static void TescStudent(){
		System.out.println("----------------------");
		System.out.println("--------�ڿƼ�--------");
		System.out.println("--------��ӭ����------");
		System.out.println("------1.�������------");
		System.out.println("------2.ɾ������------");
		System.out.println("------3.�ı�����------");
		System.out.println("------4.��ѯ����------");
		System.out.println("------5.�˳�ϵͳ------");
		System.out.println("----��ѡ���Ӧ����----");
		System.out.println("----------------------");
		
		int a = sc.nextInt();

		switch(a){
		case 1:
			AlterStudent();
		break;

		case 2:
			DelectStudent();
		break;

		case 3:
			UpdateStudent();
		break;

		case 4:
			SelectStudent();
		break;

		case 5:
			EscStudent();
		break;

		default :
		System.out.println("ɵ�ƣ��������쳣");
		TescStudent();
		}
		
	}
	/**
	1 �������
	*/
	public static void AlterStudent(){
	Tesc tesc = new Tesc();
	System.out.println("������¼��"+(i+1)+"ѧ��");	
	System.out.println("������ѧ������");
	String name = sc.next();
	System.out.println("������ѧ���Ա�");
	String sex = sc.next();
	System.out.println("������ѧ������");
	int age = sc.nextInt();
	tesc.name=name;//����Ա������ֵ
	tesc.sex=sex;
	tesc.age=age;
	
	System.out.println("¼��ɹ�");
	TescStudent();
	i++;
	
	}
	/**
	2 ɾ������
	*/
	public static void DelectStudent(){
	Tesc tesc = new Tesc();
	
	System.out.println("ɾ���ɹ�");
	}
	/**
	3 �ı�����
	*/
	public static void UpdateStudent(){
	Tesc tesc = new Tesc();
	System.out.println("�ı�ɹ�");
	}
	/**
	4 ��ѯ����
	*/
	public static void SelectStudent(){
	Tesc tesc = new Tesc();
	System.out.println("��ѯ����");
	}
	/**
	5 �˳�
	*/
	public static void EscStudent(){
	System.out.println("�ݰ�");
		System.exit(0);
	}
}
