package blatt08;

public class Binomialkoeffizient {
    public static void main(String[] args) {
        System.out.println(binom(15, 3));
    }

    /**
     * Methode berechnet Binom. Koeff. rekursiv (n ueber k)
     *
     * @param n Integer Wert (oberer Wert im Binom.Koeff.)
     * @param k Integer Wert (unterer Wert im Binom.Koeff)
     * @return gibt Ergebnis des Binom.Koeff. als Integer zurueck
     */
    private static int binom(int n, int k) {
        // Wenn n<k ist Binom. als 0 definiert
        if (n < k) {
            return 0;
        }
        // Basisfall: k=0 oder k=n, Rückgabe: 1
        if (k == n || k == 0)
            return 1;
        //Definition des Binom.Koeff.:
        else {
            return binom(n - 1, k - 1) + binom(n - 1, k);
        }
    }
}
