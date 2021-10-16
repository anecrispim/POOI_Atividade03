import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o número 1: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe o número 2: ");
		int num2 = entrada.nextInt();
		
		if (num1 < num2) {
			for (int i = num1+1; i < num2; i++) {
				System.out.print(i + " | ");
			}
		} else {
			for (int i = num2+1; i < num1; i++) {
				System.out.print(i + " | ");
			}
		}
		
		entrada.close();
	}

}
