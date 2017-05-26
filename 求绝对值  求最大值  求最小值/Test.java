public class Test {
  public static void main(String[] args) {
  if(args.length != 2) {
   System.out.println("请输入2个整数:");
  }
  else {
   try{
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("你输入的是" + a + "和" + b);
    System.out.println("最大值是：" + getMax(a, b));
   } catch (Exception e) {
    System.out.println("你输入的不是整数:");
   }
  }
 }
 
 public static int getMax(int a, int b) {
  return a > b ? a:b;
 }
}