import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");

        int zahl = 5;
        boolean isCorrect = false;

        do {
            if (isCorrect) {
                System.out.println("die Eingabe muss wirklich zwischen 4 und 20 sein.");
                // TODO
                // wir wollen aus der inifinite Loop raus.
            }
            System.out.print("Bitte gib eine Zahl zwischen 4 und 20 ein: ");
            // int zahl;
            try {
                zahl = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bitte nur Ganzzahlen eingeben!");
                zahl = -7;
            }
            isCorrect = true;
        }    while (zahl < 4 || zahl > 20);
        for (int i = 1; i <= zahl; i++) {
            System.out.println("i = " + i);

        }
    }
}
