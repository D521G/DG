import java.util.*;    
  
public class D    
{    
public static void main(String []abc)    
{    
int y,m,d,h,mi,s;    
Calendar cal=Calendar.getInstance();    
y=cal.get(Calendar.YEAR);    
m=cal.get(Calendar.MONTH);    
d=cal.get(Calendar.DATE);    
h=cal.get(Calendar.HOUR_OF_DAY);    
mi=cal.get(Calendar.MINUTE);    
s=cal.get(Calendar.SECOND);    
System.out.println("����ʱ����"+y+"��"+m+"��"+d+"��"+h+"ʱ"+mi+"��"+s+"��");    
}    
  
}   
##########################################################################    
public class Main{    
    public static void main(String[] args){    
        java.util.Calendar c=java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy��MM��dd��hhʱmm��ss��");    
        System.out.println(f.format(c.getTime()));    
    }    
}  


##########################################################################   

public String GetNowDate(){   
    String temp_str="";   
    Date dt = new Date();   
    //����aa��ʾ�����硱�����硱    HH��ʾ24Сʱ��    �������hh��ʾ12Сʱ��   
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");   
    temp_str=sdf.format(dt);   
    return temp_str;   
} 