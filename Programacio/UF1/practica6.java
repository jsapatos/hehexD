import java.io.*;
// Tornem a desenvolupar la calculadora senzilla, fent servir el condicional múltiple amb casos.


public class practica6{
	    public static void main(String[] args) throws IOException {
		int num1;
		int num2;
			
		String linea;
		String operacio;
		
		System.out.println("Calculadora senzilla");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix el primer nombre: ");
		linea = reader.readLine();
		num1 = Integer.parseInt(linea);
		
		System.out.print("Introdueix l'operand: ");
		operacio = reader.readLine();
		
		System.out.print("Introdueix el segon nombre: ");
		linea = reader.readLine();
		num2 = Integer.parseInt(linea);
		
		switch (operacio){
			case"+":System.out.println("El resultat es: "+(num1+num2));
			break;
			
			case"-":System.out.println("El resultat es: "+(num1-num2));
			break;
			
			case"*":System.out.println("El resultat es: "+(num1*num2));
			break;
			
			case"/":System.out.println("El resultat es: "+(num1/num2));
			break;
			
			
		}


	}
}
