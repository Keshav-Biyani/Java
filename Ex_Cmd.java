public class Ex_Cmd
{
    public static void main(String s[])
    {
       System.out.println(s[0]);
       System.out.println(s[1]);
       System.out.println(s[2]);
       int x,y,z;
      /* x= s[0];
       y=s[1];
       z= x + y;
       //Ex_Cmd.java:9: error: incompatible types: String cannot be converted to int
       x= s[0];
           ^
       Ex_Cmd.java:10: error: incompatible types: String cannot be converted to int
       y=s[1];
       // 
       System.out.println(z);
       */
       x = Integer.parseInt(s[1]);
       y = Integer.parseInt(s[2]);
       z= x + y;
       z= x/y;
       /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Ex_Cmd.main(Ex_Cmd.java:23)*/
       /* when s[2] is not given
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at Ex_Cmd.main(Ex_Cmd.java:7)*/

       System.out.println("s=" + z);
    }
}
       /*
0
10
a
Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:784)
        at Ex_Cmd.main(Ex_Cmd.java:21)
*/
