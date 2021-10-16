import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida.");
			System.out.print("Informe a nota: ");
			nota = entrada.nextInt();
		}
		
		System.out.println("Nota: " + nota);
		
		entrada.close();
	}

}
