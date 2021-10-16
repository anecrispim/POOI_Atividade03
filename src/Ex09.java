import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja? ");
		int tab = entrada.nextInt();
		
		final int TAM = 10;

		for (int i = 0; i <= TAM; i++) {
			System.out.println(tab + " x " + i + " = " + i * tab);
		}
		
		entrada.close();
	}

}
