package six;  
  
import java.io.IOException;  
import java.util.Scanner;  
  
public class Test {  
  
    public static void main(String[] args) throws IOException {  
        Scanner sc=new Scanner(System.in);  
        while(true){  
            System.out.println("***************************************");  
            System.out.println("*        ��ӭ������ͨѶ¼ϵͳ ��                      *");  
            System.out.println("*         0:        �˳�                                       *");  
            System.out.println("*         1:        ��ѯѧ��                             *");  
            System.out.println("*         2:        �޸�ѧ��                             *");  
            System.out.println("*         3:        ɾ��ѧ��                             *");  
            System.out.println("*         4:        ����ѧ��                             *");  
            System.out.println("*         5:        ��ʾ����ѧ��                   *");  
            System.out.println("��������Ҫ��������Ӧ�ĺ��룺");  
            int num=sc.nextInt();  
            if (num==0) {  
                System.out.println("�˳�ϵͳ�ɹ���");  
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