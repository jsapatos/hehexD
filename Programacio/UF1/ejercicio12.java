import java.io.*;
//Programa que demani dos nombres i pinti un rectangle amb aquests

public class ejercicio12{
		public static void main(String[] args) throws IOException {
		
		int base;
		int altura;
		String linia;
		int i,j;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix la base: ");
		linia = reader.readLine();
		base = Integer.parseInt(linia);
		
		//System.out.print("Introdueix l'altura: ");
		//linia = reader.readLine();
		//altura = Integer.parseInt(linia);
		
		altura=base;
		
		//for per pintar linies
		for(i=1;i<=altura;i++){
			for(j=i;j>0;j--){
				System.out.print(j + ", ");
				}
		System.out.println();
		}
	}
	
}
