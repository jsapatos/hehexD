import java.io.*;
//Programa que agafa tants nombres com li diguis(màxim de 100) i diu si estàn ordenats o no 
public class Exercici4{
	public static void main(String[] args) throws IOException {
	int elements[];					//tabla amb els valors
	elements = new int [100];		//Donant el màxim que tindrà
	int valor;						//Quants de nombre hi haurà
	int contador = 1;				//Si i és més petit que i+1 sumarà i despres compara amb valor
	String linia;					//Agafar valor que dona l'usuari
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Introdueix numero elements array: ");
	linia = reader.readLine();
	valor = Integer.parseInt(linia);
	if (valor<1){
		System.out.println("Error: El minim d'elements és 1");
	}
	else if (valor>100){
		System.out.println("Error: El màxim d'elements és 15");
	}
	else {
		for (int i=1;i<valor+1;i++){				//Donar valors a les posicions de l'array
			System.out.print("Element "+i+":");
			linia = reader.readLine();
			elements[i] = Integer.parseInt(linia);
		}
		for (int i=1;i<valor+1;i++){				
			if (elements[i]<elements[i+1]){			//Comparar amb el següent nombre
				contador++;
			}
			else {
			}
		}
		if (contador==valor){						//Si el valor(quants de nombres ha posat) es correspon amb el contador (Quantes vegades  i és menor que i+1) farà aço
			System.out.print("Array ordenada: ");
			for (int i=1;i<valor+1;i++){
				if (i<valor){
					System.out.print(elements[i]+",");
				}
				else{
					System.out.println(elements[i]);
				}
			}
		}
		else if (valor==1){							//Si només hi ha un valor fara açi
			System.out.print("Array ordenada: "+elements[1]+",");
		}
		else {										//Si el valor és més gran que el contador dira açò
			System.out.println("Array NO ordenada");
		}
	}
	}
}
