
public class NTuermeProblem {
	public static void main(String[]args) {
		//Groesse des Schachbrettes wird festgelegt
		final int N = 8;
		//NxN Array aus Boolean-Werten wird erstellt
		boolean[][]brett = new boolean[N][N];
		boolean korrekt = true;
		
		//Stellt zufällig Tuerme aufs Feld. Fuer Testzwecke
		for(int z=0;z<N;z++) {
			int i = (int)(Math.random()*N);
			int j = (int)(Math.random()*N);
			brett[i][j]=true;
			System.out.println("Turm: " + i + " " + j);
		}
		
		//Verschachtelte Vorschleife geht alle Felder auf Brett durch
		for(int i=0;i<N;i++) {
			int colcounter = 0;
			int rowcounter = 0;
			if(!korrekt)
				break;
			for(int j=0;j<N;j++) {
				//wenn auf Feld ein Turm steht wird Counter erhöht 
				if(brett[j][i])
					colcounter++;
				//Wenn in einer Zeile mehr als ein Turm steht wird korrekt auf false gesetzt
				if (colcounter>1) {
					korrekt = false;
					System.out.println("Mehr als ein Turm in der gleichen Spalte");
					break;
				}
				//wenn auf Feld ein Turm steht wird Counter erhöht
				if(brett[i][j])
					rowcounter++;
				//Wenn in einer Reihe mehr als ein Turm steht wird korrekt auf false gesetzt
				if(rowcounter>1) {
					korrekt=false;
					System.out.println("Mehr als ein Turm in der gleichen Zeile ");
					break;
				}
			}
		}
		System.out.println(korrekt);
	}

}
