class Demo  
{  
    public static void main(String[] args)  
    {  
        System.out.println("hello,java");  
          
        System.out.println("ÎÒµÄÐ¡¾Å¾Å£º");  
        int x,y;  
  
        for(x = 0;x <= 9; x++)  
        {  
            for(y = 1;y <= x; y++)  
            {  
                System.out.print(y+"*"+x+"="+x*y+"\t");  
            }  
            System.out.println();  
        }  
    }  
}  