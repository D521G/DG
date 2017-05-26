package six;  
  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.Scanner;  
  
public class Work {  
    static ArrayList<String> s=new ArrayList<String>();  
    static Scanner sc=new Scanner(System.in);  
    //根据学号判断该学生是否存在  
    public static int judge(String no) throws IOException{  
        int k=-1;  
        s=ReadWriter.readXinxi();  
        for (int i = 0; i < s.size(); i++) {  
            if(s.get(i).startsWith(no)){  
                k=i;  
            }  
        }  
        if (k==-1) {  
            System.out.println("您输入的学号不存在！");  
            return -1;  
        }else{  
            return k;  
        }  
    }  
    //增加学生信息  
    public static void add() throws IOException {  
        s=ReadWriter.readXinxi();  
        System.out.println("请输入所要添加学生的学号、姓名、专业：");  
        String no=sc.next();  
        String name=sc.next();  
        String zhuan=sc.next();  
        String zong=no+" "+name+" "+zhuan;  
        s.add(zong);  
        ReadWriter.writeXinxi();  
        System.out.println("添加成功！"); 
    }  
    //删除学生信息  
    public static void delete( ) throws IOException{  
        System.out.println("请输入所要删除的学生的学号：");  
        String no=sc.next();  
        int i;  
        if((i=judge(no))!=-1){  
            s.remove(i);  
            ReadWriter.writeXinxi();  
            System.out.println("删除成功！");  
        }  
    }  
    //修改学生信息  
    public static void update() throws IOException{  
        System.out.println("请输入所要修改学生的学号：");  
        String no=sc.next();  
        int i;  
        if((i=judge(no))!=-1){  
                s.remove(i);  
                System.out.println("请输入学生修改后的学号、姓名与专业：");  
                String no1=sc.next();  
                String name=sc.next();  
                String zhuan=sc.next();  
                String zong=no1+" "+name+" "+zhuan;  
                s.add(zong);  
                ReadWriter.writeXinxi();  
                System.out.println("修改成功！");  
        }  
    }  
    //显示所查询学生信息  
    public static void show() throws IOException{  
        System.out.println("请输入所要查询学生的学号：");  
        String no=sc.next();  
        int i;  
        if ((i=judge(no))!=-1) {  
            System.out.println("学号                姓名      专业");  
            System.out.println(s.get(i));  
        }  
    }  
    //显示所有学生信息  
    public static void showAll() throws IOException{  
        s=ReadWriter.readXinxi();  
        System.out.println("学号                姓名      专业");  
        for (int i = 0; i < s.size(); i++) {  
            System.out.println(s.get(i));  
        }  
           
    }  
}  