import java.io.*;
// Programa que que demani a l’usuari que introdueixi un preu en € i la quantitat de € que paga

public class practica7{
		public static void main(String[] args) throws IOException {
		
		int num1;
		String decisio = "si";
		String operand;
		String linea;
		int num2;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (decisio.equals("si")){
			
		System.out.print("Introdueix el primer nombre: ");
		linea = reader.readLine();
		num1 = Integer.parseInt(linea);
		
		System.out.print("Introdueix l'operand: ");
		operand = reader.readLine();
		
		System.out.print("Introdueix el segon nombre: ");
		linea = reader.readLine();
		num2 = Integer.parseInt(linea);
		
			if (operand.equals("+")){
				System.out.println(num1+num2);
			}
			else if(operand.equals("-")){
				System.out.println(num1-num2);
				
			}
			else if(operand.equals("*")){
				System.out.println(num1*num2);
				
			}
			else if(operand.equals("/")){
				if (num2==0){
					System.out.println("SYNTAX ERROR");
				}
				else{
					System.out.println(num1/num2);
				}
			}
			else{
				System.out.println("Operació incorrecta, canvia l'operand");
			}
			
			System.out.print("Vols continuar? ");
			decisio = reader.readLine();
		}
	}
}
