[java]
import java.math.BigDecimal ; 
/*
实现两个大数的加减乘除
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
    System.out.println("相加: "+ b1.add(b2)) ; 
    System.out.println("相减: "+ b1.subtract(b2)) ; 
    System.out.println("相乘: "+ b1.multiply(b2)) ; 
    System.out.println("相除: "+ b1.divideToIntegralValue(b2)) ;//舍弃小数部分  
     
     
    } 
} 
 
import java.math.BigDecimal ;
/*
实现两个大数的加减乘除
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
       System.out.println("相加: "+ b1.add(b2)) ;
       System.out.println("相减: "+ b1.subtract(b2)) ;
       System.out.println("相乘: "+ b1.multiply(b2)) ;
       System.out.println("相除: "+ b1.divideToIntegralValue(b2)) ;//舍弃小数部分
   
      
       }
}