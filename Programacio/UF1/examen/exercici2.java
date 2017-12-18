import java.io.*;
//Programa que demana un nombre i suma els anteriors per arribar al número més proper per sota d’aquest valor

public class exercici2{ 
		public static void main(String[] args) throws IOException {

		int nombre;
		String linia;
		int i = 1;
		int suma =0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix un numero: "); //demanam numero
		linia = reader.readLine();
		nombre = Integer.parseInt(linia);
		
		if (i<=nombre){ // si la i es mes petita que el numero fa el seguent
			for (i=1;i<nombre;i++) {
				suma+=i;

				System.out.print(i+",");
				
				if (suma>nombre-i-1){ //si la el contador es major que el numero només sumara els nombres fins el mes proper

					for(i=0;i<nombre;i++){
					}

				}
			}
			System.out.print(" i la seva suma es "+suma); //print que ens dona el resultat

		}
		else if (i==nombre){
			System.out.print(i);
		}
		else{
			System.out.print("El segon numero no pot esser inferior al primer");
		}
		

		

	}
	
}
