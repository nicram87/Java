
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Der Computer stellt eine Rechenaufgabe mit 2 Zahlen (zuflällig)
        //Die Zahlen liegen zwischen 1 und 10
        //Gerechnet werden soll: plus / minus / Mal (zufällig)
        //Der Spieler kriegt die Rechenaufgabe auf dem Bildschirm angezeigt
        //Beispiel: Berechne : 12 + 26
        //Der spieler gibt das Ergebnis ein
        //Das Ergebnis wird mit dem tatsächlichen Ergebnis verglichen
        //Ist das Ergebnis des Spielers falsch, soll er nochmal eingeben dürfen.
        Scanner sc = new Scanner(System.in);
        Random zuf = new Random();
        ArrayList<Character> operatorenListe = new ArrayList<>();
        operatorenListe.add('+');
        operatorenListe.add('-');
        operatorenListe.add('*');

        int index = zuf.nextInt(operatorenListe.size());
        char zufallsOperator = operatorenListe.get(index);

        int zahl1 = zuf.nextInt(1,11);
        int zahl2 = zuf.nextInt(1,11);
        int antword =0;
        int ergebnis = 0;

        if (index == 0){
            ergebnis = zahl1 + zahl2;
        }
        if (index == 1){
            ergebnis = zahl1 - zahl2;
        }
        if (index == 2){
            ergebnis = zahl1 * zahl2;
        }
        do {
            System.out.println("Was ist das ergebnis von: "+ zahl1 + zufallsOperator + zahl2);
            antword = sc.nextInt();

        }while (antword != ergebnis);

        System.out.println("Das Ergebnis ist Richtig");


//        //Lösung vom Lehrer
//        Scanner sc = new Scanner(System.in);
//        Random zuf =new Random();
//
//        int zahl1 = zuf.nextInt(10 + 1);
//        int zahl2 = zuf.nextInt(1,11);
//
//        int operation = zuf.nextInt(0, 4);
//
//        int ergebnis = 0;
//        int usereingabe;
//        String hilfe ="";
//
//        if(operation == 0){
//            hilfe = "Bitte rechne " + zahl1 + "+" + zahl2;
//            ergebnis = zahl1 + zahl2;
//        }else if(operation == 1){
//            hilfe = "Bitte rechne " + zahl1 + "-" + zahl2;
//            ergebnis = zahl1 - zahl2;
//        }else if(operation == 2){
//            hilfe = "Bitte rechne " + zahl1 + "*" + zahl2;
//            ergebnis = zahl1 * zahl2;
//        }
//
//        do {
//            System.out.println(hilfe);
//            usereingabe = sc.nextInt();
//
//        }while (usereingabe != ergebnis);
//        System.out.println("Das ergebnis ist Korrekt");
    }
}