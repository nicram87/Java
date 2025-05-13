import java.io.*;
public class while_do
{

    public static void main(String[] args)
    {
       int a = 10, b = 20, c = 20, d = 0;

       System.out.println("Var1 = " + a);
       System.out.println("Var2 = " + b);
       System.out.println("Var2 = " + c);

       if ((a < b) && (b == c)) {
           d = a + b + c;
           System.out.println("The sum is: " + d);
       }
       if ((a > c) && (++b > c)) {
           System.out.println("Value of b: " +b);
       }
       else {
           System.out.println("False condition");
       }
    }
}

