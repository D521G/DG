import java.util.*;
public class CarDemo{
	static Scanner input=new Scanner(System.in);
	public static Car[] car = new Car[100];
	
	//������Ϣ
	public static void carGu(){
		car[0] = new Car(1,"�µ�A4",4,0,500);
		car[1] = new Car(2,"���Դ�6",4,0,400);
		car[2] = new Car(3,"Ƥ��ѩ6",4,2,450);
		car[3] = new Car(4,"����",20,0,800);
		car[4] = new Car(5,"�ɻ���",0,4,400);
		car[5] = new Car(6,"��ά��",0,20,1000);
	}
   
   //����
   public static void Entry(){
          carGu();
		  System.out.println("****��ӭʹ���⳵ϵͳ��****");
		  System.out.println("****��ȷ���⳵��****");
		  boolean Yan = Yi();
		  if(Yan){
		     NingDi();
			 GuDing();
			 DingBai();
		  }else{
				System.out.println("****��л��� �ݹˣ���ӭ�ٴι��٣�****");
				System.exit(0);
		  }
   }
   //����  �˳�
   public boolean Yi(){
			System.out.println("������ (1 ����) (2 �˳�)");
			while(true){
			String bnxh = sc.next();
				if(bnxh.equals("1")){
					return true;
				}else if{bnxh.equals("2")){
					return false;
				
				}
				System.out.println("û�д�ѡ�� ������(1��2)");
			}
   }

   //������Ϣ
   public static void NingDi(){
   System.out.println("======================================================================");
   System.out.println("���:\t | ����:\t | �ؿ���(��):\t | �ػ���(��):\t | �����(Ԫ/��):\t ");
   System.out.println("======================================================================");
		for(Car r:car){
			if(r!=null){
				r.MangUng();
			}
		
		}
   
   }
	//ѡ��
   public static int[] ZuSu = new int[100];
   public static void  GuDing(){
		System.out.priintln("���������⳵������");
		int ber = Number();
		for(int i = 0;i<ber;i++){
			System.out.println("�������"+(i+1)+"�������");
			ZuSu[i] = Number(); 
		}
   
   }
	//�˵�
	public static void DingBai(){
		System.out.println("****�����˵�:****");
		double melong = 0d;
		int ber = 0;
		int ber2 = 0;
		System.out.println("�������˳�");
		for( int i = 0;i<car.length;i++){
			for( int a = 0;a<ZuSu.length;a++){
				if(car[i] !=null&&car[i].Wquantity()==ZuSu[a]&&car[i].Wthreenumber()==0){
				System.out.println(car[i].Wquantity());
				melong = melong + car[i].Wthreenumber();
				ber = ber + car[i].Wthreenumber();
				}
			}
		}
		System.out.println("��ѡ���ػ���");
		for( int i = 0;i<car.length;i++){
			for( int a = 0;a<ZuSu.length;a++){
				if(car[i] !=null&&car[i].Wquantity()==ZuSu[a]&&car[i].Wthreenumber()==0){
				System.out.println(car[i].Wquantity());
				melong = melong + car[i].Wthreenumber();
				ber2 = ber2 + car[i].Wthreenumber();
	       }
	    }
     } 
	 System.out.println("���ؿ�:"+ber+"��\n���ػ�:"+ber2+"��\n�⳵�ܼ۸�:"+melong+"Ԫ");
  }

  //����
  public static int Number(){
		String bnxh = sc.next();
		try{
		return Integer.parseInt(bnxh);
		}catch(Exception d){
			System.out.println("����������");
		}
		return Number();
  }
}


