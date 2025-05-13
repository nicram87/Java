import java.util.Random;
import java.util.Scanner;

public  class Zufallszahlen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random zuf = new Random();
//        for (int i = 0 ; i < 10; i++) {
//            int zufallszahl = zuf.nextInt();
//            System.out.println(zufallszahl);
//        }
//        System.out.println();
//        for (int i = 0 ; i < 10; i++) {
//            int zufallszahl = zuf.nextInt(101);
//            System.out.println(zufallszahl);
//        }
//        System.out.println();
//        for (int i = 0 ; i < 10; i++) {
//            // origin untergrenze einschließlich ausgewählte zahl, bound obergrenze zahl wird ausgeschlossen
//            int zufallszahl = zuf.nextInt(25 ,101);
//            System.out.println(zufallszahl);
//        }
        for (int i = 0 ; i < 10; i++) {
            int zufallszahl = zuf.nextInt(1, 7);
            System.out.println(zufallszahl);
        }


    }
}
