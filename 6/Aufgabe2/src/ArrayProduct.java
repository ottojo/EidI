import java.util.Arrays;

public class ArrayProduct {

    public static void main(String[] args) {
        int[] testData = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arrayProduct(testData)));
    }

    /**
     * Berechnet für jede Zahl im Eingabearray das Produkt aller anderer Zahlen
     *
     * @param input Eingabearray
     * @return Array, welches die Produkte enthält. Länge entspricht der Eingabe.
     */
    public static int[] arrayProduct(int[] input) {
        // Ausgebearray auf 1 initialisieren (Neutrales Element der Multiplikation)
        int[] result = new int[input.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }

        // Über alle Elemente des Eingabearrays iterieren
        for (int i = 0; i < input.length; i++) {
            // Für jedes Element: Produkt aus allen anderen Elementen bilden
            for (int b = 0; b < input.length; b++) {
                // Das Element selbst soll nicht im Produkt enthalten sein
                if (i != b)
                    result[i] *= input[b];
            }
        }
        return result;
    }
}
