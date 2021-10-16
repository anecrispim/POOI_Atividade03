import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a popula��o do pa�s A: ");
		float a = entrada.nextFloat();
		
		while (a <= 0) {
			System.out.println("A popula��o deve ser maior que zero.");
			
			System.out.print("Informe a popula��o do pa�s A: ");
			a = entrada.nextFloat();
		}
		
		System.out.print("Informe a taxa de crescimento do pa�s A (%): ");
		float taxaA = entrada.nextFloat();
		
		while (taxaA <= 0 || taxaA > 100) {
			System.out.println("A taxa deve ser maior que 0 e menor ou igual a 100.");
			
			System.out.print("Informe a taxa de crescimento do pa�s A (%): ");
			taxaA = entrada.nextFloat();
		}
		
		System.out.print("Informe a popula��o do pa�s B: ");
		float b = entrada.nextFloat();
		
		while (b <= 0) {
			System.out.println("A popula��o deve ser maior que zero.");
			
			System.out.print("Informe a popula��o do pa�s B: ");
			b = entrada.nextFloat();
		}
		
		System.out.print("Informe a taxa de crescimento do pa�s B (%): ");
		float taxaB = entrada.nextFloat();
		
		while (taxaB <= 0 || taxaB > 100) {
			System.out.println("A taxa deve ser maior que 0 e menor ou igual a 100.");
			
			System.out.print("Informe a taxa de crescimento do pa�s B (%): ");
			taxaB = entrada.nextFloat();
		}
		
		int cont = 0;
		if (a < b) {
			while (a < b) {
				a = a + (a * (taxaA / 100));
				b = b + (b * (taxaB / 100));
				cont++;
			}
		} else {
			while (b < a) {
				a = a + (a * (taxaA / 100));
				b = b + (b * (taxaB / 100));
				cont++;
			}
		}
		System.out.println("Anos necess�rios para o pa�s com popula��o menor ultrapassar ou igualar a popula��o maior: " + cont + " anos");
		
		entrada.close();
	}

}
