import java.util.*;
public class Student
{   //全局变量 
	public static int i = 0;

	public static Scanner sc = new Scanner(System.in);

	public static Tesc[] tesc =new Tesc[100];

	public static void main(String[] args){

	TescStudent();
	
	}
	static void TescStudent(){
		System.out.println("----------------------");
		System.out.println("--------黑科技--------");
		System.out.println("--------欢迎进入------");
		System.out.println("------1.添加数据------");
		System.out.println("------2.删除数据------");
		System.out.println("------3.改变数据------");
		System.out.println("------4.查询数据------");
		System.out.println("------5.退出系统------");
		System.out.println("----请选择对应功能----");
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
		System.out.println("傻逼，输入有异常");
		TescStudent();
		}
		
	}
	/**
	1 添加数据
	*/
	public static void AlterStudent(){
	Tesc tesc = new Tesc();
	System.out.println("你正在录入"+(i+1)+"学生");	
	System.out.println("请输入学生姓名");
	String name = sc.next();
	System.out.println("请输入学生性别");
	String sex = sc.next();
	System.out.println("请输入学生年龄");
	int age = sc.nextInt();
	tesc.name=name;//给成员变量赋值
	tesc.sex=sex;
	tesc.age=age;
	
	System.out.println("录入成功");
	TescStudent();
	i++;
	
	}
	/**
	2 删除数据
	*/
	public static void DelectStudent(){
	Tesc tesc = new Tesc();
	
	System.out.println("删除成功");
	}
	/**
	3 改变数据
	*/
	public static void UpdateStudent(){
	Tesc tesc = new Tesc();
	System.out.println("改变成功");
	}
	/**
	4 查询数据
	*/
	public static void SelectStudent(){
	Tesc tesc = new Tesc();
	System.out.println("查询数据");
	}
	/**
	5 退出
	*/
	public static void EscStudent(){
	System.out.println("拜拜");
		System.exit(0);
	}
}
