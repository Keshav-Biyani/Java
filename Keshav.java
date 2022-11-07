public class Keshav
{
    public static void main(String s[])
    {
      try 
      {
            int  x,y,z;
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
            z= x/y;
            System.out.println(z);

          }
      /*catch(Exception e)
         {
            System.out.println("exception");
         }
      */
      catch(ArithmeticException e){
            System.out.println("exception");
         }
     
     finally
            {
            System.out.println("print");
           }
      }
}