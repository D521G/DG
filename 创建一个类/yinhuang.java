import java.util.*;
public class Hometemfu{
		
	 
	
	public static void main(String[] args){

	CuBing();
	
	}
	static void CuBing(){
		System.out.println("。。。。。。。。。。。。。。");
		System.out.println("---------------------------");
		System.out.println("      请输入相应的编号     ");
		System.out.println("-------1.进行银行存钱------");
		System.out.println("-------2.进行银行取钱------");
		System.out.println("-------3.进行银行转钱------");
		System.out.println("-------4.退出银行平台------");
		System.out.println("。。。。。。。。。。。。。。");

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
			System.out.println("输入错误,请重新输入");
		CuBiing();
		
		}

	}
	//银行存钱
	public static void CubMe(){

	Hometem c = new Hometem

	System.out.println("您正在录入数据，请开始");
	System.out.println("请输入存钱数目");
	int Cmane = sc.nextInt;
	System.out.println("请输入取钱数目");
	int Qmane = sc.nextInt;
	System.out.println("请输入转钱数目");
	int Zmane = sc.nextInt;
	c.Cmane=Cmane;
	c.Qmane=Qmane;
	c.Zmane=Zmane;
	System.out.println("录入成功");
	System.out.println("输入完成再见");
	CuBing();
	}
	//银行取钱
	public static void QunMe(){
		
	
	
	
	}
	//银行转钱
	public static void ZhuMe(){
	
	
	}
	//退出
	public static void TunMe(){
	
	
	
	}

}