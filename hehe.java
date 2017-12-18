import java.io.*;
//Porgrama que demana un nombre i dibuixa un cuadrat amb aquesta mesura
public class hehe{
	public static void main(String[] args) throws IOException {
	int nombre;
	String linia;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Donam un nombre ");
	linia = reader.readLine(); 	
	nombre= Integer.parseInt(linia);
	if (nombre==1){
		System.out.print("+");
	}
	else if (nombre==2){
		System.out.print("++\n++");
	}
	else if (nombre==3){
		System.out.print("+-+\n| |\n+-+");
	}
	else if (nombre==4){
		System.out.print("+--+\n|  |\n|  |\n+--+");
	}
	else if (nombre==5){
		System.out.print("+---+\n|   |\n|   |\n|   |\n+---+");
	}
	else if (nombre==6){
		System.out.print("+----+\n|    |\n|    |\n|    |\n|    |\n+----+");
	}
	else if (nombre==7){
		System.out.print("+-----+\n|     |\n|     |\n|     |\n|     |\n|     |\n+-----+");
	}
	else if (nombre==8){
		System.out.print("+------+\n|      |\n|      |\n|      |\n|      |\n|      |\n|      |\n+------+");
	}
	else if (nombre==9){
		System.out.print("+-------+\n|       |\n|       |\n|       |\n|       |\n|       |\n|       |\n|       |\n+-------+");
	}
	else if (nombre==10){
		System.out.print("+--------+\n|        |\n|        |\n|        |\n|        |\n|        |\n|        |\n|        |\n|        |\n+--------+");
	}
	else if (nombre==11){
		System.out.print("+---------+\n|         |\n|         |\n|         |\n|         |\n|         |\n|         |\n|         |\n|         |\n|         |\n+---------+");
	}
	else if (nombre==12){
		System.out.print("+----------+\n|          |\n|          |\n|          |\n|          |\n|          |\n|          |\n|          |\n|          |\n|          |\n|          |\n+----------+");
	}
	else if (nombre==13){
		System.out.print("+-----------+\n|           |\n|           |\n|           |\n|           |\n|           |\n|           |\n|           |\n|           |\n|           |\n|           |\n|           |\n+-----------+");
	}
	else if (nombre==14){
		System.out.print("+------------+\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n|            |\n+------------+");
	}
	else if (nombre==15){
		System.out.print("+-------------+\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n|             |\n+-------------+");
	} 
	else if (nombre==16){
		System.out.print("+--------------+\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n|              |\n+--------------+");
	}
	else if (nombre==17){
		System.out.print("+---------------+\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n|               |\n+---------------+");
	}
	else if (nombre==18){
		System.out.print("+----------------+\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n|                |\n+----------------+");
	}
	else if (nombre==19){
		System.out.print("+-----------------+\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n|                 |\n+-----------------+");
	}
	else if(nombre<=0){
		System.out.print("El nombre no pot 0 o menor");
	}
	else if (nombre>=20){
		System.out.print("El nombre no pot ser 20 o major");
	}
	}
}
