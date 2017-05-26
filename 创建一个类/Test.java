package six;  
  
import java.io.IOException;  
import java.util.Scanner;  
  
public class Test {  
  
    public static void main(String[] args) throws IOException {  
        Scanner sc=new Scanner(System.in);  
        while(true){  
            System.out.println("***************************************");  
            System.out.println("*        欢迎来到本通讯录系统 ！                      *");  
            System.out.println("*         0:        退出                                       *");  
            System.out.println("*         1:        查询学生                             *");  
            System.out.println("*         2:        修改学生                             *");  
            System.out.println("*         3:        删除学生                             *");  
            System.out.println("*         4:        增加学生                             *");  
            System.out.println("*         5:        显示所有学生                   *");  
            System.out.println("请输入所要操作所对应的号码：");  
            int num=sc.nextInt();  
            if (num==0) {  
                System.out.println("退出系统成功！");  
                break;  
            }  
            switch (num) {  
            case 1:  
                Work.show();  
                break;  
            case 2:  
                Work.update();  
                break;  
            case 3:  
                Work.delete();  
                break;  
            case 4:  
                Work.add();  
                break;  
            case 5:  
                Work.showAll();  
                break;  
            default:  
                break;  
            }  
        }  
           
    }  
  
}  