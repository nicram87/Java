import java.util.Random;

public class WuerfelSpiel {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random zuf = new Random();
        int summe = 0;

        for (int i = 1 ; i < 4; i++) {
            int zufallszahl = zuf.nextInt(1, 7);

            summe = summe + zufallszahl;
            System.out.println("wurf " + i + ": " + zufallszahl);


            System.out.println("Die gewürfelte Summe ist: "+ summe);
        }

    }
}
