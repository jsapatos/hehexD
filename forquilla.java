 import java.io.*;
// Programa que demana dos nombres, calcula els 10 següents i dona la suma 
public class forquilla{
  public static void main(String[] args) throws IOException { 
	int x = 0;
	int y = 0;
	int z = 0;
	int enter1;
	int enter2;
	int taula1[];
	int taula2[];
	int taula_suma[];
	taula1 = new int [20];
	taula2 = new int [20];
	taula_suma = new int [20];
	String linia;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Donem un enter ");
	linia = reader.readLine(); 	
	enter1= Integer.parseInt(linia);
	System.out.println("Donamen un altre ");
	linia = reader.readLine(); 	
	enter2= Integer.parseInt(linia);

	for (int i=enter1;i<enter1+10;i++){
		taula1[x]=i;
		x++;	
	}
	for (int i=enter2;i<enter2+10;i++){
		taula2[y]=i;
		y++;
	}
	for (int i=0;i<10;i++){
		taula_suma[i]=taula1[i]+taula2[i];
	}
	for (int i=0;i<10;i++){
		if (i<9){
			System.out.print(taula1[i]+", ");
		}
		else{
			System.out.println(taula1[i]);
		}
	}
	for (int i=0;i<10;i++){
		if (i<9){
			System.out.print(taula2[i]+", ");
		}
		else {
			System.out.println(taula2[i]);
		}
	}
	for (int i=0;i<10;i++){
		if (i<9){
			System.out.print(taula_suma[i]+", ");
		}
		else{
			System.out.print(taula_suma[i]);
		}
	}
	
	}			
}


