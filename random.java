import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random(); // Erstellt ein Random-Objekt
        int zahl = random.nextInt(10) + 1; // Erzeugt eine Zufallszahl zwischen 1 und 10 // 2. Zufallszahl ausgeben
        System.out.println("Die erzeugte Zufallszahl ist: " + zahl);
        if (zahl > 5) {
// wenn zahl größer 5, dann...
            System.out.println("Zahl ist größer als 5");
        } else if (zahl < 5) {
// sonst, wenn zahl kleiner 5, dann...
            System.out.println("Zahl ist kleiner als 5");
        } else {
// sonst (wenn sie weder größer noch kleiner ist, muss sie genau 5 sein)
            System.out.println("Zahl ist genau 5");
        }
    }

}
