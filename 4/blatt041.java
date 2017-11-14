//package eidi;
public class blatt041{
	public static void main(String[]args){
		//Einlesen des Satztes und des Zeichens
		TextIO.put("Geben sie ihren Satz ein: ");
		String satz = TextIO.getln();
		TextIO.put("Geben sie das zu suchende Zeichen ein: ");
		//Ausgabe des Satzes unter dem dann Markierungen gesetzt werden
		char zeichen = TextIO.getChar();
		TextIO.put(satz + "\n");
		// For Schleife iteriert über alle Buchstaben des String
		for(int i = 0 ; i<= satz.length()-1 ; i++){
			//Prüft ob aktuelle zu prüfender Buchstabe mit dem eingegebenen Char übereinstimmt.
			// Falls ja Ausgabe von "+", Falls Nein Leerzeichen und springe zum nächsten Buchstabe
			if(satz.charAt(i)==zeichen){
				TextIO.put("+");
			}else{TextIO.put(" ");
			}
		} //Ende der for-Schleife
	}//Ende der Main-Methode
}//Ende der Klasse
