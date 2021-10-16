import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a população do país A: ");
		float a = entrada.nextFloat();
		
		while (a <= 0) {
			System.out.println("A população deve ser maior que zero.");
			
			System.out.print("Informe a população do país A: ");
			a = entrada.nextFloat();
		}
		
		System.out.print("Informe a taxa de crescimento do país A (%): ");
		float taxaA = entrada.nextFloat();
		
		while (taxaA <= 0 || taxaA > 100) {
			System.out.println("A taxa deve ser maior que 0 e menor ou igual a 100.");
			
			System.out.print("Informe a taxa de crescimento do país A (%): ");
			taxaA = entrada.nextFloat();
		}
		
		System.out.print("Informe a população do país B: ");
		float b = entrada.nextFloat();
		
		while (b <= 0) {
			System.out.println("A população deve ser maior que zero.");
			
			System.out.print("Informe a população do país B: ");
			b = entrada.nextFloat();
		}
		
		System.out.print("Informe a taxa de crescimento do país B (%): ");
		float taxaB = entrada.nextFloat();
		
		while (taxaB <= 0 || taxaB > 100) {
			System.out.println("A taxa deve ser maior que 0 e menor ou igual a 100.");
			
			System.out.print("Informe a taxa de crescimento do país B (%): ");
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
		System.out.println("Anos necessários para o país com população menor ultrapassar ou igualar a população maior: " + cont + " anos");
		
		entrada.close();
	}

}
