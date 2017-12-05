package Blatt07;

public class Aufgabe3 {
	public static void main(String[]args) {
		final int X = 6;
		System.out.println(compFibIt(X));
		System.out.println(compFibRec(X));
		
	}
	/**
	 * Iterative Methode um n-te Fibonacci Zahl zu berechnen
	 * @param n Integer Wert der angibt die wie vielte Fibonacci Zahl berechnet werden soll
	 * @return gibt n-te Fibonacci Zahl als Integer zurück
	 */
	private static int compFibIt(int n) {
		//Falls negatives n eingegeben wird, wird Fehlermeldung ausgegeben und 0 zurückgegeben
		if(n<0) {
			System.out.println("Negative Eingaben sind nicht erlaubt.");
			return 0;
		}
		//Falls n=0 wird 0 zurückgegeben
		if(n==0)
			return 0;
		
		int result =0;
		int buf =1;
		int speicher=0;
		int i=0;
		//Wiederholt sooft bis gesuchte Fibonacci Zahl erreicht wird. Addiert immer die beiden vorherigen Zahlen auf. (2 Ablage Variablen)
		while(i<n) {
			result=buf+speicher;
			buf=speicher;
			speicher=result;
			i++;
		}
		return result;
	}
	
	/**
	 * Rekursive Methode um n-te Fibonacci Zahl zu berechnen
	 * @param result result: Integer Wert der angibt die wie vielte Fibonacci Zahl berechnet werden soll
	 * @return gibt n-te Fibonacci Zahl als Integer zurück
	 */
	private static int compFibRec(int result) {
		//Abbruch sobald Basisfall erreicht [Basisfall: ersten zwei Zahlen 0 und 1]
		if(result<=1)
			return result;
		else {
			//Addiert die zwei vorherigen Zahlen auf
			int buf = compFibRec(result-1)+compFibRec(result-2);
			return buf;
		}
	}

}
/* 1  1
*  1  2
*  2  3
*  3  4
*  5  5
*  8  6
*  13 7
*  21 8
*  34 9
*  55 10
*
*/

