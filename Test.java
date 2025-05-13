import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");

        int zahl = 5;
        boolean isCorrect = false;

        do {
            if (isCorrect) {
                System.out.println("Die Eingabe muss wirklich zwischen 4 und 20 sein.");
            }

            System.out.print("Bitte gib eine Zahl zwischen 4 und 20 ein: ");

            try {
                // Try to read an integer input
                zahl = scanner.nextInt();

                // Check if the number is within the valid range
                if (zahl < 4 || zahl > 20) {
                    isCorrect = true;  // Invalid input
                    continue;  // Ask for input again
                }

                // If input is valid, break the loop
                isCorrect = false;

            } catch (InputMismatchException e) {
                // Handle the case where the user enters a float or something invalid
                System.out.println("Bitte nur Ganzzahlen eingeben!");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
                isCorrect = true;
            }
        } while (zahl < 4 || zahl > 20);

        // Print numbers from 1 to 'zahl' once valid input is entered
        for (int i = 1; i <= zahl; i++) {
            System.out.println("i = " + i);
        }

        scanner.close();  // Don't forget to close the scanner!
    }
}
