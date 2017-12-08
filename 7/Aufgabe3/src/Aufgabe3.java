package Blatt07;

public class Aufgabe3 {
	public static void main(String[]args) {
		//Beachte ab 47 kommt man im Integer Zahlenbereich in einen Überlauf
		final int X = 8;
		System.out.println(compFibIt(X));
		System.out.println(compFibRec(X));
		
	}
	/**
	 * Iterative Methode um n-te Fibonacci Zahl zu berechnen
	 * @param n Integer Wert der angibt die wie vielte Fibonacci Zahl berechnet werden soll
	 * @return gibt n-te Fibonacci Zahl als Integer zurueck
	 */
	private static int compFibIt(int n) {
		//Falls negatives n eingegeben wird, wird Fehlermeldung ausgegeben und -1 zurückgegeben
		if(n<0) {
			System.out.println("Negative Eingaben sind nicht erlaubt.");
			return -1;
		}
		//Falls n=0 wird 0 zurückgegeben
		if(n==0)
			return 0;
		
		int result =0;
		int buf =1;
		int speicher=1;
		//Wiederholt so oft bis gesuchte Fibonacci Zahl erreicht wird. Addiert immer die beiden vorherigen Zahlen auf. (2 Ablage Variablen)
		for(int i=1;i<n-1;i++) {
			result=buf+speicher;
			buf=speicher;
			speicher=result;
		}
		return result;
	}
	
	/**
	 * Rekursive Methode um n-te Fibonacci Zahl zu berechnen
	 * @param result result: Integer Wert der angibt die wie vielte Fibonacci Zahl berechnet werden soll
	 * @return gibt n-te Fibonacci Zahl als Integer zurück
	 */
	private static int compFibRec(int result) {
		//Prüft ob eingabe korrekt ist und gibt -1 zurück und gibt Fehler auf der Konsole aus.
		if(result<0) {
			System.out.println("Es gibte keine negative n-te Fibonacci Zahl");
			return -1;
		}
		//0-te Fibonacci Zahl wird als 0 definiert.
		if (result==0)
			return 0;
		//Abbruch sobald Basisfall erreicht
		if(result<=2)
			return 1;
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

