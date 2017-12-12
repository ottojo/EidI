package blatt08;

public class binomialkoeffizient {
	public static void main(String[]args) {
		System.out.println(compBinom(15,3));
	}
	/**
	 * Methode berechnet Binom. Koeff. rekursiv (n über k)
	 * @param n Integer Wert (oberer Wert im Binom.Koeff.)
	 * @param k Integer Wert (unterer Wert im Binom.Koeff)
	 * @return gibt Ergebnis des Binom.Koeff. als Integer zurueck
	 */
	private static int compBinom(int n, int k) {
		//Wenn n<k ist Binom. als 0 definiert
		if(n<k) {
			return 0;
		}
		// Wenn Basisfall erreicht wird, wird 1 zurueckgegeben. Basisfall k=0 oder k=n
		if(k==n || k==0)
			return 1;
		//Definition des Binom.Koeff.
		else {
			return compBinom(n-1,k-1) + compBinom(n-1,k);
		}
	}

}
