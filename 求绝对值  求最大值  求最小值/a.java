public class a { 
 public static void main(String args[]) { 
  int a[]={84,40,16,3,10,49,28,76,94,70}; 
  int n; 
  int min=a[0]; 
  int i; 
  int max=a[0]; 
  for(n=0;n<=9;n++) { 
  if(max<a[n]) 
   max=a[n]; 
  } 
  for(i=0;i<=9;i++) { 
  if(min>a[i]) 
  min=a[i]; 
  } 
  System.out.print("max="+max); 
  System.out.print("min="+min); 
 } 
}