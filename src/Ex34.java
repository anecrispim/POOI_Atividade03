import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, quantNu[] = new int[5];
		
		while(numero >= 0) {
			System.out.println("Digite um numero: ");
			numero= entrada.nextInt();
			
			if(numero>=0 && numero <= 25) {
				quantNu[0] = quantNu[0] +1;
			}
			else if(numero>=26 && numero <= 50) {
				quantNu[1] = quantNu[1] +1;
			}
			else if(numero>=51 && numero <= 75) {
				quantNu[2] = quantNu[2] +1;
			}
			else if(numero>=76 && numero <= 100) {
				quantNu[3] = quantNu[3] +1;
			}
			else if(numero>100) {
				quantNu[4] = quantNu[4] +1;
			}
		}
		
		System.out.println("Numeros digitados:\n"
				+ "intervalo [0-25]: "+quantNu[0]+"\n"
				+ "intervalo [26-50]: "+quantNu[1]+"\n"
				+ "intervalo [51-75]: "+quantNu[2]+"\n"
				+ "intervalo [76-100]: "+quantNu[3]+"\n"
				+ "intervalo [>100]: "+quantNu[4]+"\n"
				);
		
		
		
		entrada.close();
	}

}
