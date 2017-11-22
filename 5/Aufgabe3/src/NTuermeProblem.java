
public class NTuermeProblem {
	public static void main(String[]args) {
		final int N = 8;
		boolean[][]brett = new boolean[N][N];
		boolean korrekt = true;
		
		for(int z=0;z<N;z++) {
			int i = (int)(Math.random()*N);
			int j = (int)(Math.random()*N);
			brett[i][j]=true;
			System.out.println("Turm: " + i + " " + j);
		}
		
		
		for(int i=0;i<N;i++) {
			int colcounter = 0;
			int rowcounter = 0;
			if(!korrekt)
				break;
			for(int j=0;j<N;j++) {
				if(brett[j][i])
					colcounter++;
				if (colcounter>1) {
					korrekt = false;
					System.out.println("Mehr als ein Turm in der gleichen Spalte");
					break;
				}
				if(brett[i][j])
					rowcounter++;
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
