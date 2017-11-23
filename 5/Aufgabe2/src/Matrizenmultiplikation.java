import java.util.Arrays;

public class Matrizenmultiplikation {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {3, 2, 1},
                {1, 0, 2}};
        int[][] matrix2 = {
                {1, 2},
                {0, 1},
                {4, 0}};

        System.out.println(Arrays.deepToString(matrixMultiply(matrix1, matrix2)));
    }

    /**
     * Multipliziert zwei Matrizen
     *
     * @param m1 Erste Matrix
     * @param m2 Zweite Matrix
     * @return Ergebnis der Matrizenmultiplikation, null wenn Multiplikation nicht möglich.
     */
    private static int[][] matrixMultiply(int[][] m1, int[][] m2) {
        if (m1[0].length != m2.length) {
            System.out.println("Matrizen können nicht multipliziert werden.");
            System.out.println("Spaltenzahl der ersten und Zeilenzahl der zweiten Matrix stimmen nicht überein.");
            return null;
        }

        // Ergebnismatrix mit Zeilenzahl der ersten und Spaltenzahl der zweiten Matrix
        int[][] result = new int[m1.length][m2[0].length];

        // Iteriere über Zeilen der Ergebnismatrix
        for (int i = 0; i < result.length; i++) {
            // Iteriere über jedes Element der Zeile der Ergebnismatrix
            for (int k = 0; k < result[0].length; k++) {
                // i: Zeile, k: Spalte
                // Für jedes Element der Ergebnismatrix:
                // Summiere:
                // Elemente der Zeile der ersten Matrix multipliziert mit den Elementen der Spalte der zweiten Matrix
                for (int j = 0; j < m2.length; j++) {
                    // j: Laufindex der Summe
                    result[i][k] += m1[i][j] * m2[j][k];
                }
            }
        }
        return result;
    }
}
