[java]
import java.math.BigDecimal ; 
/*
ʵ�����������ļӼ��˳�
*/ 
public class BigDecimalTest 
{ 
    public static void main(String[] args) 
    { 
         
    String x = "1000000000000000000000000000000000000000000000.5" ; 
    String y = "2" ; 
 
    BigDecimal b1 = new BigDecimal(x) ; 
    BigDecimal b2 = new BigDecimal(y) ; 
 
    System.out.println("result: ") ; 
    System.out.println("���: "+ b1.add(b2)) ; 
    System.out.println("���: "+ b1.subtract(b2)) ; 
    System.out.println("���: "+ b1.multiply(b2)) ; 
    System.out.println("���: "+ b1.divideToIntegralValue(b2)) ;//����С������  
     
     
    } 
} 
 
import java.math.BigDecimal ;
/*
ʵ�����������ļӼ��˳�
*/
public class BigDecimalTest
{
       public static void main(String[] args)
       {
             
       String x = "1000000000000000000000000000000000000000000000.5" ;
       String y = "2" ;
 
       BigDecimal b1 = new BigDecimal(x) ;
       BigDecimal b2 = new BigDecimal(y) ;
 
    System.out.println("result: ") ;
       System.out.println("���: "+ b1.add(b2)) ;
       System.out.println("���: "+ b1.subtract(b2)) ;
       System.out.println("���: "+ b1.multiply(b2)) ;
       System.out.println("���: "+ b1.divideToIntegralValue(b2)) ;//����С������
   
      
       }
}