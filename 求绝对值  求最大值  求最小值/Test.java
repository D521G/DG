public class Test {
  public static void main(String[] args) {
  if(args.length != 2) {
   System.out.println("������2������:");
  }
  else {
   try{
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("���������" + a + "��" + b);
    System.out.println("���ֵ�ǣ�" + getMax(a, b));
   } catch (Exception e) {
    System.out.println("������Ĳ�������:");
   }
  }
 }
 
 public static int getMax(int a, int b) {
  return a > b ? a:b;
 }
}