import java.util.Scanner;

public class Usereingabe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Usereingabe, bis eine 10 eingegeben wurde
//        int usereingabe;
//        do
//        {
//            System.out.println("Gib eine zehn ein");
//            usereingabe = sc.nextInt();
//        }while(usereingabe != 10);
//
//        System.out.println(" Du hast eine zehn eingegeben");
//        sc.nextLine();

        //Passworteingabe, max 3 versuche
        String passwort = "Geheim";
        String eingabe;
        boolean korrekt = false;
        int zaehler = 0;

//        do
//        {
//            zaehler ++;
//            System.out.println("Gib das passwort ein:");
//            eingabe = sc.nextLine();
//            if (eingabe.equals(passwort)){
//                System.out.println("Das Passwort ist Korekt");
//                korrekt = true;
//                zaehler = 3;
//            }
//            else
//            {
//                System.out.println("Falsches Passwort. Du hast noch " + (3 - zaehler) + " Versuche");
//            }
//        }while (zaehler < 3);
//    //if (!korrekt) ist das selbe wie == false.
//        if (korrekt == false)
//        {
//            System.out.println("3 versuche verbraucht. Bitte warte 10 minuten und probiere es nochmal");
//        }

        // Mit for schleife
        for(int i = 1; i < 4; i++)
        {
            zaehler++;
            System.out.println("Gib das Passwort ein");
            eingabe = sc.nextLine();
            if (eingabe.equals(passwort))
            {
                System.out.println("Das Passwort ist Korekt");
                korrekt = true;
                i = 3;
            }
            else
            {
                System.out.println("Falsches Passwort. Du hast noch " + (3 - zaehler) + " Versuche");
            }
            if(!korrekt)
            {
                System.out.println("3 versuche verbraucht. Bitte warte 10 minuten und probiere es nochmal");
            }
        }
    }
}