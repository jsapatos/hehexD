import java.io.*;
//Programa que demani els dos nombres i mostri tots els que hi ha entre l'un i l'altre

public class practica8{
		public static void main(String[] args) throws IOException {
		
		int nombre1;
		int nombre2;
		String linia;
		int i;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix el primer nombre: ");
		linia = reader.readLine();
		nombre1 = Integer.parseInt(linia);
		
		System.out.print("Introdueix el segon nombre: ");
		linia = reader.readLine();
		nombre2 = Integer.parseInt(linia);
		
		for (i=nombre1+1;i<nombre2;i++) {
			System.out.println(i);
		
		}

	}
	
}
