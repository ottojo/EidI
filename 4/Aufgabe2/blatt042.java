public class blatt042 {
	public static void main(String[]args) {
		//Liest Werte für Hoehe und Breite ein und schreibt sie in Integer-Variablen
		TextIO.put("Geben sie die Breite an :");
		int breite = TextIO.getInt();
		TextIO.put("Geben sie die Hoehe an :");
		int hoehe = TextIO.getInt();
		//for-Schleife geht die einzelnen Zeilen durch, bis gewuenschte Hoehe erreicht 
		for(int i=1; i<=hoehe; i++) {
			TextIO.put("\n");
			//for-Schleife geht eine ganze Spalte durch, bis die gewuenschte Breite erreicht
			for(int j=1; j<=breite; j++) {
				//Gibt zufällig 0 oder 1 aus
				int var = (int) (Math.random()*2);
				//Je nach Wert der zufalls Variable wird "/" oder "\" ausgegeben
				if(var==1) {
					TextIO.put("/");
				}else {TextIO.put("\\");
				}
			}//Ende der for-Schleife
		}//Ende der for-Schleife
	}//Ende der Main-Methode

}//Ende der Klasse
