import java.io.*;
// Programa per calcular i visualitzar les ventes de cada producte


public class programas{
	    public static void main(String[] args) throws IOException {
		int cola;
		int taronja;
		int llimona;

		float preucola;
		float preutaronja;
		float preullimona;
		
		String linea; //valor que posa la persona
		
		System.out.println("Taula de ventes ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix la quantitat de cola: ");
		linea = reader.readLine();
		cola = Integer.parseInt(linea);
		
		System.out.print("Introdueix el preu de la cola: ");
		linea = reader.readLine();
		preucola = Float.parseFloat(linea);
		
		System.out.print("Introdueix la quantitat de taronja: ");
		linea = reader.readLine();
		taronja = Integer.parseInt(linea);
		
		System.out.print("Introdueix el preu de la taronja: ");
		linea = reader.readLine();
		preutaronja = Float.parseFloat(linea);
		
		System.out.print("Introdueix la quantitat de llimona: ");
		linea = reader.readLine();
		llimona = Integer.parseInt(linea);
		
		System.out.print("Introdueix el preu de la llimona: ");
		linea = reader.readLine();
		preullimona = Float.parseFloat(linea);
		
		float totalcola = (cola*preucola);
		
		float totaltaronja = (preutaronja*taronja);
		
		float totalllimona = (preullimona*llimona);
		
		
		
		
		System.out.println("-------------------------------------------------");
		System.out.println ("Producte"+"	Vendes"+"		Preu"+"	    Total");
		System.out.println("-------------------------------------------------");
		System.out.println ("Cola"+"		"+cola+"		"+preucola+"	    "+totalcola);
		System.out.println ("Taronja"+"		"+taronja+"		"+preutaronja+"	    "+totaltaronja);
		System.out.println ("Llimona"+"		"+llimona+"		"+preullimona+"	    "+totalllimona);
		System.out.println("-------------------------------------------------");
		System.out.println ("TOTAL					    "+(totalcola+totaltaronja+totalllimona));
		System.out.println("-------------------------------------------------");


	}
}
