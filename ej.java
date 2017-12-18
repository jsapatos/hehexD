import java.io.*;
public class ej{
	public static void main(String[] args) throws IOException {
	int num_items = 0;
	int preu;
	String linia;
	String respostes[];
	respostes = new String [10];
	String nom_sala;
	System.out.println("Creador de sala");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Quin nom vols que tengui la sala? ");
	nom_sala = reader.readLine(); 	
	System.out.print("Quant vols que valgui entrar a la sala? ");
	linia = reader.readLine();
	preu = Integer.parseInt(linia);
	System.out.println("Quantes respostes vols que hi hagi? ");
	linia = reader.readLine();
	num_items = Integer.parseInt(linia);
	if (num_items<2){
		System.out.println("No pot haver menys de dues resposta");
	}
	else if (num_items>9){
		System.out.println("No pot haver més de 9 respostes");
	}
	else{
		for (int i=1;i<num_items+1;i++){
			System.out.println("Resposta nombre "+i);
			respostes[i] = reader.readLine();
		}
		System.out.println("Molt be, la teva sala quedara així");
		System.out.println(nom_sala);
		System.out.println("Preu per entrar = "+preu);
		System.out.println("Amb les següents respostes : ");
		for (int i=1;i<num_items+1;i++){
			System.out.println(respostes[i]);
		}
	}
	}
}
