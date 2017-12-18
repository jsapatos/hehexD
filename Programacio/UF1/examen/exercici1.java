import java.io.*;
// Programa sumi els nombres fins al valor introduït del teclat

public class exercici1{
	public static void main(String[] args) throws IOException {
int i;
int hora1 = 00;
int hora2 = 00;
int minut1 = 00;
int minut2 = 00;
int segon1 = 00;
int segon2 = 00;
String linia;
int cont =0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Introdueix la primera hora: ");
		linia = reader.readLine();
		hora1 = Integer.parseInt(linia);

		System.out.print("Introdueix la segona hora: ");
		linia = reader.readLine();
		hora2 = Integer.parseInt(linia);
		
		
		for (i=0;segon1<59;i++){
			
			segon1++;
			if (segon1<10){
				System.out.println (hora1+":"+minut1+":0"+segon1);

			}
			if (minut1<10){
			System.out.println (hora1+":0"+minut1+":0"+segon1);
				
			}
			else{
			System.out.println (hora1+":"+minut1+":"+segon1);
			}
		}
	}
}
