package six;  
  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.Scanner;  
  
public class Work {  
    static ArrayList<String> s=new ArrayList<String>();  
    static Scanner sc=new Scanner(System.in);  
    //����ѧ���жϸ�ѧ���Ƿ����  
    public static int judge(String no) throws IOException{  
        int k=-1;  
        s=ReadWriter.readXinxi();  
        for (int i = 0; i < s.size(); i++) {  
            if(s.get(i).startsWith(no)){  
                k=i;  
            }  
        }  
        if (k==-1) {  
            System.out.println("�������ѧ�Ų����ڣ�");  
            return -1;  
        }else{  
            return k;  
        }  
    }  
    //����ѧ����Ϣ  
    public static void add() throws IOException {  
        s=ReadWriter.readXinxi();  
        System.out.println("��������Ҫ���ѧ����ѧ�š�������רҵ��");  
        String no=sc.next();  
        String name=sc.next();  
        String zhuan=sc.next();  
        String zong=no+" "+name+" "+zhuan;  
        s.add(zong);  
        ReadWriter.writeXinxi();  
        System.out.println("��ӳɹ���"); 
    }  
    //ɾ��ѧ����Ϣ  
    public static void delete( ) throws IOException{  
        System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");  
        String no=sc.next();  
        int i;  
        if((i=judge(no))!=-1){  
            s.remove(i);  
            ReadWriter.writeXinxi();  
            System.out.println("ɾ���ɹ���");  
        }  
    }  
    //�޸�ѧ����Ϣ  
    public static void update() throws IOException{  
        System.out.println("��������Ҫ�޸�ѧ����ѧ�ţ�");  
        String no=sc.next();  
        int i;  
        if((i=judge(no))!=-1){  
                s.remove(i);  
                System.out.println("������ѧ���޸ĺ��ѧ�š�������רҵ��");  
                String no1=sc.next();  
                String name=sc.next();  
                String zhuan=sc.next();  
                String zong=no1+" "+name+" "+zhuan;  
                s.add(zong);  
                ReadWriter.writeXinxi();  
                System.out.println("�޸ĳɹ���");  
        }  
    }  
    //��ʾ����ѯѧ����Ϣ  
    public static void show() throws IOException{  
        System.out.println("��������Ҫ��ѯѧ����ѧ�ţ�");  
        String no=sc.next();  
        int i;  
        if ((i=judge(no))!=-1) {  
            System.out.println("ѧ��                ����      רҵ");  
            System.out.println(s.get(i));  
        }  
    }  
    //��ʾ����ѧ����Ϣ  
    public static void showAll() throws IOException{  
        s=ReadWriter.readXinxi();  
        System.out.println("ѧ��                ����      רҵ");  
        for (int i = 0; i < s.size(); i++) {  
            System.out.println(s.get(i));  
        }  
           
    }  
}  