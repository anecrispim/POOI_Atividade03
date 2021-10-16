import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o número 1: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe o número 2: ");
		int num2 = entrada.nextInt();
		
		int soma = 0;
		if (num1 < num2) {
			for (int i = num1+1; i < num2; i++) {
				soma = soma + i;
			}
			System.out.println("Soma entre os números " + num1 + " e " + num2 + ": " + soma);
		} else {
			for (int i = num2+1; i < num1; i++) {
				soma = soma + i;
			}
			System.out.println("Soma número entre: " + num2 + " e " + num1 + ": " + soma);
		}
		
		
		entrada.close();
	}

}
