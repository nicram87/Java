import java.util.Scanner;
public class user_prompt {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Type in a number:");
       int number = scanner.nextInt();
       System.out.println("Write in a word:");
       String word = scanner.nextLine();

       System.out.println(word + " " + number);
   }
}
