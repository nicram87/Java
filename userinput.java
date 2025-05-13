import java.util.Scanner;

public class userinput {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Input a chain of strings: ");

            System.out.print("Input an integer value: ");
            int num = sc.nextInt();

            System.out.print("Input a float value: ");
            float num2 = sc.nextFloat();

            float sum = num + num2;

            System.out.println("The input is :" + sum);
        } catch (Exception e) {
            System.out.println("Invalid input.Please enter a numeric value.");
        } finally {
            sc.close();
        }
    }
}
