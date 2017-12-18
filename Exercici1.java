import java.io.*;
//Programa que fa com un cronometre al reves
public class Exercici1{
	public static void main(String[] args) throws IOException {
	int hores;				//Quantes hores ens dona
	int cont_hores;			//Quantes hores queden
	int minuts;				//Quants minuts ens dona
	int cont_minuts;		//Quants de minuts ens queden
	int segons;				//Quants de segons ens dona
	int cont_segons;		//Quants de segons ens queden
	String linia;			//Agafar valor
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Introdueix les hores: ");
	linia = reader.readLine();
	hores = Integer.parseInt(linia);
	System.out.print("Introdueix els minuts: ");
	linia = reader.readLine();
	minuts = Integer.parseInt(linia);
	System.out.print("Introdueix els segons: ");
	linia = reader.readLine();
	segons = Integer.parseInt(linia);
	cont_hores=hores;
	cont_minuts=minuts;
	cont_segons=segons;
	for (int i=-1;i<hores;i++){						//Farà açò tantes vegades com hores hi hagin
		for(int j=-1;j<minuts;j++){					//Farà açò tantes vegades com minuts quedin
			for (int k=0;k<segons;k++){				//Fara açò tantes vegades com segons quedin
				System.out.println(cont_hores+":"+cont_minuts+":"+cont_segons);	
				cont_segons--;
			}
			segons=60;								//reiniciam
			cont_segons=59;							//reiniciam
			cont_minuts--;							//llevam un minut
		 }
		 minuts=60;									//reiniciam
		 cont_minuts=60;							//reiniciam
		 cont_hores--;								//llevam una hora
	}
	}
}
