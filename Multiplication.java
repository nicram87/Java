import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args)
    {
     Scanner console = new Scanner(System.in);
     int num;

     System.out.println("Enter any positive integer:");
     num = console.nextInt();

        if(num <=0) {
            System.out.println("Please enter a positive integer. ");

        }
        while(true) {
            if (num > 0) break;
        }
        {

     System.out.println("Multiplication number of: " + num);
     for(int i = 1; i<10; i++)
     {
         System.out.println(num + "x" + i + "=" +(num*i) );

     }

     }
    }
}
