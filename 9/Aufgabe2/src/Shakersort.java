
public class Shakersort {

    public static void main(String[] args) {
        int[] testDaten = new int[]{5, 7, 3, 4, 1, 2, 9, 8, 3};
        System.out.println("Eingabe: " + arrayToString(testDaten));
        System.out.println("Sortiert: " + arrayToString(sort(testDaten)));
        System.out.println("Eingabe: " + arrayToString(testDaten));
    }

    /**
     * Macht etwa das gleiche wie Arrays.toString(int[] a),
     * aber für die Verwendung von dem gabs mal Punktabzug.
     * <p>
     * javadoc: siehe {@link java.util.Arrays#toString(int[])}.
     */
    private static String arrayToString(int[] arr) {
        String s = "[";
        for (int i : arr) {
            s += i + ", ";
        }
        return s.substring(0, s.length() - 2) + "]";
    }

    /**
     * Sortiert das Eingabearray mittels shakersort.
     * (nicht in-place)
     *
     * @param input Eingabearray
     * @return Sortiertes Array
     */
    private static int[] sort(int[] input) {
        int[] sorted = new int[input.length];
        System.arraycopy(input, 0, sorted, 0, input.length);

        boolean currentlyAscending = true;
        boolean performedSwap = true;

        while (performedSwap) {
            performedSwap = false;
            if (currentlyAscending) {
                for (int i = 0; i < sorted.length - 1; i++) {
                    if (sorted[i] > sorted[i + 1]) {
                        // swap
                        int b = sorted[i + 1];
                        sorted[i + 1] = sorted[i];
                        sorted[i] = b;
                        performedSwap = true;
                    }
                }
            } else {
                for (int i = sorted.length - 1; i > 0; i--) {
                    if (sorted[i - 1] > sorted[i]) {
                        // swap
                        int b = sorted[i - 1];
                        sorted[i - 1] = sorted[i];
                        sorted[i] = b;
                        performedSwap = true;
                    }
                }
            }
            currentlyAscending = !currentlyAscending;

            System.out.println(arrayToString(sorted));
        }

        return sorted;
    }
}
