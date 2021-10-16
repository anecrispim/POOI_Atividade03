import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a base da potencia: ");
		int base = entrada.nextInt();
		
		System.out.print("Informe o expoente: ");
		int exp = entrada.nextInt();
		
		int potencia = base;
		for (int i = 1; i < exp; i++) {
			potencia = potencia * base;
		}
		
		System.out.println(potencia);
		
		entrada.close();
	}

}
