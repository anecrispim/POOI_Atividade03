import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		int num;
		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Informe um número: ");
			num = entrada.nextInt();
			
			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		
		System.out.println("Quantidade de número pares: " + contPar);
		System.out.println("Quantidade de números impares: " + contImpar);
		
		entrada.close();

	}

}
