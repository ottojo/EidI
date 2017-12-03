
public class Blatt06_4 {
    public static void main(String[] args) {
        //Array zum Testen der Methode
        int[] test = new int[]{1, 1, 3, 3, 5, 5, 2, 2, 2, 4, 4, 4, 6, 8, 8, 0, 0, 100, 100};

        int[] duplicates = findDuplicates(test);

        //Ausgabe des zurückgegebenen Arrays
        for (int i = 0; i < duplicates.length; i++) {
            System.out.println(duplicates[i]);
        }
    }

    /**
     * Sucht aus Eingabe-Array die doppelt vorhandenen Zahlen heraus und gibt diese in einem Array zurück
     *
     * @param arg Integer Array mit den Zahlenwerten zwischen 0-100
     * @return Array mit allen doppelt vorhandenen Zahlen
     */
    public static int[] findDuplicates(int[] arg) {
        //Array in dem die Häufigkeit einer Zahl gespeichert wird
        int[] count = new int[101];

        //Interiert über Input-Array und erhöht jeweilige Zahl im count-Array
        for (int i = 0; i < arg.length; i++) {
            count[arg[i]]++;
        }

        //Prüft wie viele doppelte Zahlen vorhanden sind, damit Array korrekte Länge hat
        int len = 0;
        for (int z = 0; z < count.length; z++) {
            if (count[z] == 2)
                len++;
        }

        //Erstellt Array das zurückgegeben wird
        int[] duplicates = new int[len];

        //Schreibt alle Doppelt vorkommenden Zahlen ins neue Array
        byte j = 0;
        for (byte i = 0; i < count.length; i++) {
            if (count[i] == 2) {
                duplicates[j] = i;
                j++;
            }
        }

        //Rückgabe des Arrays mit den Duplikaten
        return duplicates;
    }
}
