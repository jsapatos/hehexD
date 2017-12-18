import java.io.*;
//Programa que declara una matriu en 5x4 i va sumant

public class practica10{
	static final int maxfil=5;
	static final int maxcol=4;
	public static void main(String[] args) throws IOException {
	
		int nombre1;
		int nombre2;
		int nota;
		String linia;
		int i=0;
		int matriz[][];
		matriz=new int [5][4];
		int cont=1;
		int inici;
		int fin=10;
		int j;
		int z=0;
		int x=0;
		int u=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

		for (i=0;i<maxfil;i++){
			for (j=0;j<maxcol; j++){
				matriz[i][j]=cont;
				cont++;
			}
		}
		for (i=0;i<maxfil;i++){
			for (j=0;j<maxcol; j++){
				System.out.print (matriz[i][j]+"  ");
			}
			System.out.println ();
		}
		
	}
}
