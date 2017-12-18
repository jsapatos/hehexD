import java.io.*;
// Programa que demana un nom i diu quantes lletres i vocals conté

public class practica11{
	public static void main(String[] args) throws IOException {
		String lletra="";
		String st;
		String linia;
		String caracter;
		int i;
		String conv="";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introdueix el teu nom: ");
		st = reader.readLine();		
		
		for(i=0;i<st.length();i++){
			conv=conv.valueOf(st.charAt(i));
			if (conv.equals("a")){
				lletra=" .- ";
				
			}
			if (conv.equals("b")){
				lletra=" -... ";
				
			}
			if (conv.equals("c")){
				lletra=" -.-. ";
				
			}
			if (conv.equals("d")){
				lletra=" -.. ";
				
			}
			if (conv.equals("e")){
				lletra=" . ";
				
			}
			if (conv.equals("f")){
				lletra=" ..-. ";
				
			}
			if (conv.equals("g")){
				lletra=" --. ";
				
			}
			if (conv.equals("h")){
				lletra=" ..... ";
				
			}
			
			System.out.print(lletra);
		}
		
		
	}
}
