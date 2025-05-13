import java.util.Random;
import java.util.Scanner;

//Ein Spieler soll eine vom Computer erzeugte Zahl erraten
//Die zahl liegt zwischen 1 und 100
//Bei jedem Rateversuch wird dem Spieler gesagt, ob die geratene Zahl
//zu klein oder zu groß war
//Am Ende Wird ausgegeben, wie viele Versuche der Spieler gebraucht hat.
public class Zahlen_Raten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random zuf = new Random();
        int zahl = zuf.nextInt(1,101);
        int geraten;
        int anzahl = 0;

        do{
            anzahl++;
            System.out.println("Rate eine Zahl zwischen 1 und 100:");
            geraten = sc.nextInt();
            if (geraten  < zahl){
                System.out.println("Deine Zahl ist zu klein!!");
            }
            else if (geraten > zahl){
                System.out.println("Deine Zahl ist zu groß!!");
            }
            else {
                System.out.println("Du hast die zahl erraten");
            }
        }while (geraten!= zahl);


        System.out.println("DU hast " + anzahl + " Versuche gebraucht.");

    }
}
