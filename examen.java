import java.io.*;
public class examen{
	 public static void main(String[] args) throws IOException {
	String resposta_jugador[];
	int num_jugadors;				//Nombre jugadors
	int contador_guanyador = 0;		//Sebre quans guanyadors hi ha
	int contador_jugadors = 0;		//Saber quans jugadors hi ha
	int premi = 0;					//Doblers per cada guanyador
	String resposta_jug;			//Les diferents respostes
	String nom_jugador[];			//Agafar els noms dels jugadors
	String nom_guanyador[];			//Agafar noms dels guanyadors
	String resposta = "si";			//Resposta
	nom_guanyador = new String [10];
	nom_jugador = new String [10];
	resposta_jugador = new String [10];
	String linia;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("Aquesta sala és de 10€ ");
	System.out.print("Quants de jugadors hi ha a la sala? ");
	linia = reader.readLine(); 
	num_jugadors= Integer.parseInt(linia);
	if (num_jugadors>10){
		System.out.println("No es pot crear una sala amb més de 10 jugadors");
	}
	else if (num_jugadors<0){
		System.out.println("No pot haver una sala amb menys d'un jugador");
	}
	else{
		for (int i=0;i<num_jugadors;i++){
			System.out.print("Quin és el teu nom? ");
			nom_jugador[i] = reader.readLine(); 
			System.out.print("Quina és la teva resposta? Si/No  ");
			resposta_jug = reader.readLine(); 
			resposta_jug=resposta_jug.toLowerCase();
			resposta_jugador[i] = resposta_jug;
		}
		for (int i=0;i<num_jugadors;i++){
			if (resposta_jugador[i].equals(resposta)){
				nom_guanyador[contador_guanyador]=nom_jugador[i];
				contador_guanyador++;
			}
			else {
			}
		}
		if (contador_guanyador>1){	
			System.out.println("Hi ha "+contador_guanyador+" guanyador i és en : ");
		}
		else{
			System.out.println("Hi han "+contador_guanyador+" guanyadors i són : ");
		}
		for (int i=0;i<contador_guanyador;i++){
			if (i<contador_guanyador-1){
				System.out.print(nom_guanyador[i]+", ");
			}
			else {
				System.out.println(nom_guanyador[i]);
			}
		}
		System.out.println("");
		premi = (num_jugadors*10)/contador_guanyador;
		System.out.println("Són "+premi+"€ per cada un!");
	}
	}
}
