import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o limite de termos da sequência: ");
		int num = entrada.nextInt();
		
		System.out.print("S = 1/1 ");
		
		int cont = 2;
		
		for (int i = 2; i <= num+num; i++) {
			if (i % 2 != 0) {
				System.out.print(" + " + cont + "/" + i);
				cont++;
			}
		}
		
		entrada.close();
	}

}
