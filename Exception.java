public class Exception
{
    public static void main(String s[])
    {
      try {
         System.out.println(s[0]);
         System.out.println(s[1]);
         int  x,y,z;
         x = Integer.parseInt(s[1]);
         y = Integer.parseInt(s[2]);
         z= x + y;
         z= x/y;
          }
      catch(Exception e)
         {
         System.out.println("exception");
         }
     }
}