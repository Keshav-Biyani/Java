interface IA{
public void show();
public void cal(int p1,int p2);
}
class A implements IA{
     int x= 15,y=20;
     public void disp(){
    System.out.println("x=" + x + ",y= " + y);
   }
public void show(){
}
public void cal(int p1, int p2){
  System.out.println(p1+p2);
}
}
 public class Ex_Ia
{
    public static void main(String s[])
    {
 A ob1 = new A();
ob1.disp();
ob1.cal(4,5);
}
}
