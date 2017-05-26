public class Spen1{
	public static int i = 0;

	public static Scanner sc = new Scanner(System.in);


	public static void main( String[] agrs){


		Udent();
	
	}
	
	static void Udent(){
	System.out.println("-----------------");
	System.out.println("-------超市------");
	System.out.println("----欢迎光临-----");
	System.out.println("----商品名字-----");
	System.out.println("----商品数量-----");
	System.out.println("----商品种类-----");
	System.out.println("----商品大小-----");
	System.out.println("----退出系统-----");
    
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
	System.out.println("傻逼，输入错误，眼睛瞪大");
	Udent();
	}
	
}



	//商品名字
	public static void Spenname(){
	Spen spen = new Spen();
	System.out.println("选择吧 帅哥们美女们");
	System.out.println("请输入商品名字");
	String name = sc.nextlin;
	System.out.println("请输入商品数量");
	int shumu = sc.nextInt;
	System.out.println("请输入商品种类");
	String lei = sc.nextlin;
	System.out.println("请输入商品价格");
    String big = sc.nextlin;

	


	//给变量赋值
	spen.name =  name;
	spen.shumu = shumu;
	spen.lei = lei;
	spen.big = big;
	System.out.println("录入成功");
	Udent();
	
	}
	//商品数量
	public static void Spenshu(){
	
	
	}
	//商品种类
	public static void Spenlei(){
	
	}
	//商品大小
	public static void Spenbig(){
	
	
	}
}