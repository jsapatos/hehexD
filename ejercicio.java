import java.io.*;
//Programa que demani dos nombres i pinti un rectangle amb aquests

public class ejercicio{
		public static void main(String[] args) throws IOException {
		
		int base;
		int altura;
		String linia;
		int i,j;
		int aux=1;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix la base: ");
		linia = reader.readLine();
		base = Integer.parseInt(linia);
		
		//System.out.print("Introdueix l'altura: ");
		//linia = reader.readLine();
		//altura = Integer.parseInt(linia);
		
		altura=base;
		
		//for per pintar linies
		for(i=0;i<altura;i++){
			for(j=altura-i;j>0;j--){
				if(j == 1)
					System.out.print(aux);
				else
					System.out.print(aux+(","));
				aux = aux + 1;
			}	
			System.out.println();
			aux = 1;
		}
	}
	
}
