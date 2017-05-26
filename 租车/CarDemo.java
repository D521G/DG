import java.util.*;
public class CarDemo{
	static Scanner input=new Scanner(System.in);
	public static Car[] car = new Car[100];
	
	//车辆信息
	public static void carGu(){
		car[0] = new Car(1,"奥迪A4",4,0,500);
		car[1] = new Car(2,"马自达6",4,0,400);
		car[2] = new Car(3,"皮卡雪6",4,2,450);
		car[3] = new Car(4,"金龙",20,0,800);
		car[4] = new Car(5,"松花江",0,4,400);
		car[5] = new Car(6,"依维柯",0,20,1000);
	}
   
   //进入
   public static void Entry(){
          carGu();
		  System.out.println("****欢迎使用租车系统！****");
		  System.out.println("****您确认租车吗？****");
		  boolean Yan = Yi();
		  if(Yan){
		     NingDi();
			 GuDing();
			 DingBai();
		  }else{
				System.out.println("****感谢你的 惠顾，欢迎再次光临！****");
				System.exit(0);
		  }
   }
   //进入  退出
   public boolean Yi(){
			System.out.println("请输入 (1 进入) (2 退出)");
			while(true){
			String bnxh = sc.next();
				if(bnxh.equals("1")){
					return true;
				}else if{bnxh.equals("2")){
					return false;
				
				}
				System.out.println("没有此选择 请输入(1或2)");
			}
   }

   //车辆信息
   public static void NingDi(){
   System.out.println("======================================================================");
   System.out.println("序号:\t | 车名:\t | 载客数(人):\t | 载货量(吨):\t | 日租金(元/天):\t ");
   System.out.println("======================================================================");
		for(Car r:car){
			if(r!=null){
				r.MangUng();
			}
		
		}
   
   }
	//选车
   public static int[] ZuSu = new int[100];
   public static void  GuDing(){
		System.out.priintln("请输入您租车的数量");
		int ber = Number();
		for(int i = 0;i<ber;i++){
			System.out.println("请输入第"+(i+1)+"车的序号");
			ZuSu[i] = Number(); 
		}
   
   }
	//账单
	public static void DingBai(){
		System.out.println("****您的账单:****");
		double melong = 0d;
		int ber = 0;
		int ber2 = 0;
		System.out.println("已载入人车");
		for( int i = 0;i<car.length;i++){
			for( int a = 0;a<ZuSu.length;a++){
				if(car[i] !=null&&car[i].Wquantity()==ZuSu[a]&&car[i].Wthreenumber()==0){
				System.out.println(car[i].Wquantity());
				melong = melong + car[i].Wthreenumber();
				ber = ber + car[i].Wthreenumber();
				}
			}
		}
		System.out.println("已选择载货车");
		for( int i = 0;i<car.length;i++){
			for( int a = 0;a<ZuSu.length;a++){
				if(car[i] !=null&&car[i].Wquantity()==ZuSu[a]&&car[i].Wthreenumber()==0){
				System.out.println(car[i].Wquantity());
				melong = melong + car[i].Wthreenumber();
				ber2 = ber2 + car[i].Wthreenumber();
	       }
	    }
     } 
	 System.out.println("共载客:"+ber+"人\n共载货:"+ber2+"吨\n租车总价格:"+melong+"元");
  }

  //整数
  public static int Number(){
		String bnxh = sc.next();
		try{
		return Integer.parseInt(bnxh);
		}catch(Exception d){
			System.out.println("请输入整数");
		}
		return Number();
  }
}


