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
System.out.println("现在时刻是"+y+"年"+m+"月"+d+"日"+h+"时"+mi+"分"+s+"秒");    
}    
  
}   
##########################################################################    
public class Main{    
    public static void main(String[] args){    
        java.util.Calendar c=java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");    
        System.out.println(f.format(c.getTime()));    
    }    
}  


##########################################################################   

public String GetNowDate(){   
    String temp_str="";   
    Date dt = new Date();   
    //最后的aa表示“上午”或“下午”    HH表示24小时制    如果换成hh表示12小时制   
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");   
    temp_str=sdf.format(dt);   
    return temp_str;   
} 